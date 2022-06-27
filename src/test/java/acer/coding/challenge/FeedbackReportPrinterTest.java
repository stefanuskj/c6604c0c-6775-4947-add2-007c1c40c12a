/**
 * 
 */
package acer.coding.challenge.printer;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import acer.coding.challenge.TestData;
import acer.coding.challenge.beans.report.FeedbackReportDetails;

/**
 * @author stefanuskj
 *
 */
public class FeedbackReportPrinterTest {

	/**
	 * Test method for {@link acer.coding.challenge.printer.FeedbackReportPrinter#printFeedbackReport(acer.coding.challenge.beans.report.FeedbackReport)}.
	 */
	@Test
	public void printFeedbackReportTest_shouldReturnString() {
		StringBuilder builder = new StringBuilder();
		FeedbackReportDetails feedbackReportDetails = new FeedbackReportDetails();
		List<FeedbackReportDetails> listOfFeedbackReportDetails = TestData.getFeedbackReport().getListOfFeedbackReportDetails();
		builder.append(TestData.getFeedbackReport().getFirstName()+" "+TestData.getFeedbackReport().getLastName()+" recently completed "+TestData.getFeedbackReport().getAssessmentName()+" assessment on " + TestData.getFeedbackReport().getCompletedDate());
		builder.append(System.getProperty("line.separator"));
		builder.append("He got "+ TestData.getFeedbackReport().getRawScore() + " questions right out of "+ TestData.getFeedbackReport().getTotalQuestion()+". Feedback for wrong answers given below:\n");
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
		assertEquals(builder.toString(),FeedbackReportPrinter.printFeedbackReport(TestData.getFeedbackReport()));
	}

}
