/**
 * 
 */
package acer.coding.challenge.printer;

import java.util.List;

import acer.coding.challenge.beans.report.FeedbackReport;
import acer.coding.challenge.beans.report.FeedbackReportDetails;

/**
 * @author stefanuskj
 *
 */
public class FeedbackReportPrinter {
	public static String printFeedbackReport(FeedbackReport feedbackReport) {
		StringBuilder builder = new StringBuilder();
		FeedbackReportDetails feedbackReportDetails = new FeedbackReportDetails();
		List<FeedbackReportDetails> listOfFeedbackReportDetails = feedbackReport.getListOfFeedbackReportDetails();
		builder.append(feedbackReport.getFirstName()+" "+feedbackReport.getLastName()+" recently completed "+feedbackReport.getAssessmentName()+" assessment on " + feedbackReport.getCompletedDate());
		builder.append(System.getProperty("line.separator"));
		builder.append("He got "+ feedbackReport.getRawScore() + " questions right out of "+ feedbackReport.getTotalQuestion()+". Feedback for wrong answers given below:\n");
		builder.append(System.getProperty("line.separator"));
		for (int i = 0; i < listOfFeedbackReportDetails.size(); i++) {
			feedbackReportDetails = listOfFeedbackReportDetails.get(i);
			builder.append("Question: "+ feedbackReportDetails.getQuestion());
			builder.append(System.getProperty("line.separator"));
			builder.append("Your answer: "+ feedbackReportDetails.getStudentAnswerLabel()+" with value "+ feedbackReportDetails.getStudentAnswerValue());
			builder.append(System.getProperty("line.separator"));
			builder.append("Right answer: "+ feedbackReportDetails.getCorrectAnswerLabel()+" with value "+feedbackReportDetails.getCorrectAnswerValue());
			builder.append(System.getProperty("line.separator"));
			builder.append("Hint: "+ feedbackReportDetails.getQuestionHint());
			builder.append(System.getProperty("line.separator"));
		}
		return builder.toString();
	}
}
