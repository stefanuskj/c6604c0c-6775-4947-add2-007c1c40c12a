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
import acer.coding.challenge.beans.StudentResponseDetails;
import acer.coding.challenge.beans.StrandDetails;
import acer.coding.challenge.beans.json.StudentResponse;
import acer.coding.challenge.beans.json.Question;
import acer.coding.challenge.beans.json.Response;
import acer.coding.challenge.beans.json.QuestionOption;
import acer.coding.challenge.beans.report.FeedbackReport;
import acer.coding.challenge.beans.report.FeedbackReportDetails;
import acer.coding.challenge.utils.DateUtils;
import acer.coding.challenge.utils.ReportGeneratorUtils;

/**
 * @author stefanuskj
 *
 */
public class FeedbackReportGenerator {
	public static FeedbackReport generator(AssessmentDetails assessmentDetails, StudentResponseDetails studentResponseDetails, StudentResponse latestStudentResponse) throws ParseException, NullPointerException {
		FeedbackReport feedbackReport = new FeedbackReport();
		StrandDetails strandDetails = new StrandDetails();
		List<FeedbackReportDetails> listOfFeedbackReportDetails = new ArrayList<FeedbackReportDetails>();
		Calendar calendar = Calendar.getInstance();
		String dayNumberSuffix = "";
		String completedDate = latestStudentResponse.getCompleted();
		HashMap<String, StrandDetails> strandHashMap = ReportGeneratorUtils.getScoreEvaluation(assessmentDetails.getListOfQuestions(), latestStudentResponse.getListOfResponses()); 
		Iterator<Entry<String, StrandDetails>> hashMapIterator = strandHashMap.entrySet().iterator();
		calendar = DateUtils.stringDateToCalendar(completedDate);
		dayNumberSuffix = DateUtils.getDayNumberSuffix(calendar.get(Calendar.DAY_OF_MONTH));
		
		
		while(hashMapIterator.hasNext()) {
			Entry<String, StrandDetails> mapElement = hashMapIterator.next();
			strandDetails = mapElement.getValue();
			for (int i = 0; i < strandDetails.getWrongAnswer().size(); i++) {
				Question question = ReportGeneratorUtils.getQuestionDetailsById(strandDetails.getWrongAnswer().get(i), assessmentDetails.getListOfQuestions());
				Response response = ReportGeneratorUtils.getResponseDetailsById(strandDetails.getWrongAnswer().get(i), latestStudentResponse.getListOfResponses());
				QuestionOption questionOption = ReportGeneratorUtils.getOptionDetailsById(question, response.getResponse());
				FeedbackReportDetails feedbackReportDetails = new FeedbackReportDetails();
				feedbackReportDetails.setQuestion(question.getStem());
				feedbackReportDetails.setStudentAnswerLabel(questionOption.getOptionLabel());
				feedbackReportDetails.setStudentAnswerValue(questionOption.getOptionValue());
				questionOption = ReportGeneratorUtils.getOptionDetailsById(question, question.getQuestionConfig().getQuestionKey());
				feedbackReportDetails.setCorrectAnswerLabel(questionOption.getOptionLabel());
				feedbackReportDetails.setCorrectAnswerValue(questionOption.getOptionValue());
				feedbackReportDetails.setQuestionHint(question.getQuestionConfig().getQuestionHint());
				listOfFeedbackReportDetails.add(feedbackReportDetails);
			}
		}
		feedbackReport.setFirstName(studentResponseDetails.getStudent().getFirstName());
		feedbackReport.setLastName(studentResponseDetails.getStudent().getLastName());
		feedbackReport.setAssessmentName(assessmentDetails.getAssessment().getAssessmentName());
		feedbackReport.setRawScore(latestStudentResponse.getResponseResult().getRawScore());
		feedbackReport.setTotalQuestion(assessmentDetails.getListOfQuestions().size());
		feedbackReport.setCompletedDate(calendar.get(Calendar.DAY_OF_MONTH)+dayNumberSuffix+" "+DateUtils.intMonthToString(calendar.get(Calendar.MONTH))+" "+calendar.get(Calendar.YEAR)+ " "+calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE)+" "+DateUtils.intToAmPm(calendar.get(Calendar.AM_PM)));
		feedbackReport.setListOfFeedbackReportDetails(listOfFeedbackReportDetails);
				
		return feedbackReport;
	}
}
