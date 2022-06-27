/**
 * 
 */
package acer.coding.challenge.generator;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import acer.coding.challenge.beans.AssessmentDetails;
import acer.coding.challenge.beans.StudentResponseDetails;
import acer.coding.challenge.beans.json.ResponseResult;
import acer.coding.challenge.beans.json.StudentResponse;
import acer.coding.challenge.beans.report.ProgressReport;
import acer.coding.challenge.beans.report.ProgressReportDetails;
import acer.coding.challenge.exception.DataNotFoundException;
import acer.coding.challenge.utils.DateUtils;
import acer.coding.challenge.utils.ReportGeneratorUtils;

/**
 * @author stefanuskj
 *
 */
public class ProgressReportGenerator {
	public static ProgressReport generator(AssessmentDetails assessmentDetails, StudentResponseDetails studentResponseDetails) throws ParseException, DataNotFoundException, NullPointerException {
		ProgressReport progressReport = new ProgressReport();
		int lowestScore = 0;
		int highestScore = 0;
		String dayNumberSuffix = "";
		Calendar calendar = Calendar.getInstance();
		List<StudentResponse> listOfStudentResponses = new ArrayList<StudentResponse>();
		List<ProgressReportDetails> listOfProgressReportDetails = new ArrayList<ProgressReportDetails>();
		listOfStudentResponses = ReportGeneratorUtils.getStudentResponseByAssessmentId(assessmentDetails.getAssessment().getAssessmentId(),studentResponseDetails.getListOfStudentResponses());
		
		progressReport.setFirstName(studentResponseDetails.getStudent().getFirstName());
		progressReport.setLastName(studentResponseDetails.getStudent().getLastName());
		progressReport.setAssessmentName(assessmentDetails.getAssessment().getAssessmentName());
		progressReport.setCompletedAssessment(studentResponseDetails.getListOfStudentResponses().size());
		
		for (int i = 0;i < listOfStudentResponses.size(); i++) {
			ProgressReportDetails progressReportDetails = new ProgressReportDetails();
			calendar = DateUtils.stringDateToCalendar(listOfStudentResponses.get(i).getAssigned());
			dayNumberSuffix = DateUtils.getDayNumberSuffix(calendar.get(Calendar.DAY_OF_MONTH));
			progressReportDetails.setCompletedDate(calendar.get(Calendar.DAY_OF_MONTH)+dayNumberSuffix+" "+DateUtils.intMonthToString(calendar.get(Calendar.MONTH))+" "+calendar.get(Calendar.YEAR)+ " ");
			ResponseResult responseResult = listOfStudentResponses.get(i).getResponseResult();
			progressReportDetails.setRawScore(responseResult.getRawScore());
			progressReportDetails.setTotalQuestion(listOfStudentResponses.get(i).getListOfResponses().size());
			if(i!=0) {
				lowestScore = responseResult.getRawScore() < lowestScore ? responseResult.getRawScore() : lowestScore;
				highestScore = responseResult.getRawScore() > highestScore ? responseResult.getRawScore() : highestScore;
			}
			else {
				lowestScore = responseResult.getRawScore();
				highestScore = responseResult.getRawScore();
			}
			listOfProgressReportDetails.add(progressReportDetails);
		}
		progressReport.setScoreDifferences(highestScore - lowestScore);
		progressReport.setListOfProgressReportDetails(listOfProgressReportDetails);
		return progressReport;
	}
}
