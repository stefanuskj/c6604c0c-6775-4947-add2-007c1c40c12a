/**
 * 
 */
package acer.coding.challenge.generator;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

import acer.coding.challenge.TestData;
import acer.coding.challenge.beans.AssessmentDetails;
import acer.coding.challenge.beans.json.Assessment;
import acer.coding.challenge.exception.DataNotFoundException;

/**
 * @author stefanuskj
 *
 */
public class ProgressReportGeneratorTest {

	/**
	 * Test method for {@link acer.coding.challenge.generator.ProgressReportGenerator#generator(acer.coding.challenge.beans.AssessmentDetails, acer.coding.challenge.beans.StudentResponseDetails)}.
	 */
	@Test
	public void progressReportGeneratorTest_shouldReturnEquals() {
		try {
			assertEquals(TestData.getProgressReport(), ProgressReportGenerator.generator(TestData.getAssessmentDetails(), TestData.getStudentResponseDetails()));
		} catch (NullPointerException | ParseException e) {
			System.out.println(e.getMessage());
		} catch (DataNotFoundException e) {
			
		}
	}
	@Test(expected = DataNotFoundException.class)
	public void progressReportGeneratorTest_shouldReturnNullPointerException() throws NullPointerException, ParseException, DataNotFoundException {
		AssessmentDetails assessmentDetails = TestData.getAssessmentDetails();
		Assessment temp = assessmentDetails.getAssessment();
		temp.setAssessmentId("assessment3");
		ProgressReportGenerator.generator(assessmentDetails, TestData.getStudentResponseDetails());
	}

}
