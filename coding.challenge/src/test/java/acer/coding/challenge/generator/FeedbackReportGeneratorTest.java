/**
 * 
 */
package acer.coding.challenge.generator;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

import acer.coding.challenge.TestData;
import acer.coding.challenge.beans.json.StudentResponse;

/**
 * @author stefanuskj
 *
 */
public class FeedbackReportGeneratorTest {

	/**
	 * Test method for {@link acer.coding.challenge.generator.FeedbackReportGenerator#generator(acer.coding.challenge.beans.AssessmentDetails, acer.coding.challenge.beans.StudentResponseDetails, acer.coding.challenge.beans.json.StudentResponse)}.
	 */
	@Test
	public void feedbackReportGeneratorTest_shouldReturnEquals() {
		try {
			assertEquals(TestData.getFeedbackReport(), FeedbackReportGenerator.generator(TestData.getAssessmentDetails(), TestData.getStudentResponseDetails(), TestData.getLatestStudentResponse()));
		} catch (NullPointerException | ParseException e) {
			System.out.println(e.getMessage());
		}
	}
	@Test(expected = NullPointerException.class)
	public void feedbackReportGeneratorTest_shouldReturnNullPointerException() throws NullPointerException, ParseException {
		StudentResponse studentResponse = new StudentResponse();
		assertEquals(TestData.getFeedbackReport(), FeedbackReportGenerator.generator(TestData.getAssessmentDetails(), TestData.getStudentResponseDetails(), studentResponse));
	}
	

}
