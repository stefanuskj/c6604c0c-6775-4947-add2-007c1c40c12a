/**
 * 
 */
package acer.coding.challenge.generator;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import acer.coding.challenge.beans.AssessmentDetails;
import acer.coding.challenge.beans.StrandDetails;
import acer.coding.challenge.beans.StudentResponseDetails;
import acer.coding.challenge.beans.json.StudentResponse;
import acer.coding.challenge.beans.report.DiagnosticReport;
import acer.coding.challenge.utils.DateUtils;
import acer.coding.challenge.utils.ReportGeneratorUtils;

/**
 * @author stefanuskj
 *
 */
public class DiagnosticReportGenerator {
	public static DiagnosticReport generator(AssessmentDetails assessmentDetails, StudentResponseDetails studentResponseDetails, StudentResponse latestStudentResponse) throws ParseException, NullPointerException {
		DiagnosticReport diagnosticReport = new DiagnosticReport();
		List<StrandDetails> listOfStrandDetails = new ArrayList<StrandDetails>();
		Calendar calendar = Calendar.getInstance();
		StrandDetails strandDetails = new StrandDetails();
		String dayNumberSuffix = "";
		HashMap<String, StrandDetails> strandHashMap = ReportGeneratorUtils.getScoreEvaluation(assessmentDetails.getListOfQuestions(), latestStudentResponse.getListOfResponses()); 
		String completedDate = latestStudentResponse.getCompleted();
		
		calendar = DateUtils.stringDateToCalendar(completedDate);
		dayNumberSuffix = DateUtils.getDayNumberSuffix(calendar.get(Calendar.DAY_OF_MONTH));
		
		
		Iterator<Entry<String, StrandDetails>> hashMapIterator = strandHashMap.entrySet().iterator();
		while(hashMapIterator.hasNext()) {
			Entry<String, StrandDetails> mapElement = hashMapIterator.next();
			strandDetails = mapElement.getValue();
			strandDetails.setStrandName(mapElement.getKey());
			listOfStrandDetails.add(strandDetails);
		}
		
		diagnosticReport.setFirstName(studentResponseDetails.getStudent().getFirstName());
		diagnosticReport.setLastName(studentResponseDetails.getStudent().getLastName());
		diagnosticReport.setAssessmentName(assessmentDetails.getAssessment().getAssessmentName());
		diagnosticReport.setRawScore(latestStudentResponse.getResponseResult().getRawScore());
		diagnosticReport.setTotalQuestion(assessmentDetails.getListOfQuestions().size());
		diagnosticReport.setCompletedDate(calendar.get(Calendar.DAY_OF_MONTH)+dayNumberSuffix+" "+DateUtils.intMonthToString(calendar.get(Calendar.MONTH))+" "+calendar.get(Calendar.YEAR)+ " "+calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE)+" "+DateUtils.intToAmPm(calendar.get(Calendar.AM_PM))); 
		diagnosticReport.setListOfStrandDetails(listOfStrandDetails);
		
		return diagnosticReport;
	}
	
}
