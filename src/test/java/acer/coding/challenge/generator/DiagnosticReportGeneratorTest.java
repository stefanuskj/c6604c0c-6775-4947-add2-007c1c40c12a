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
public class DiagnosticReportGeneratorTest {

	/**
	 * Test method for {@link acer.coding.challenge.generator.DiagnosticReportGenerator#generator(acer.coding.challenge.beans.AssessmentDetails, acer.coding.challenge.beans.StudentResponseDetails, acer.coding.challenge.beans.json.StudentResponse)}.
	 * @throws ParseException 
	 */
	@Test
	public void diagnosticReportGeneratorTest_shouldReturnEquals() throws ParseException {
		assertEquals(TestData.getDiagnosticReport(),DiagnosticReportGenerator.generator(TestData.getAssessmentDetails(), TestData.getStudentResponseDetails(), TestData.getLatestStudentResponse()));
	}
	@Test(expected = NullPointerException.class)
	public void diagnosticReportGeneratorTest_shouldReturnNotEquals() throws ParseException, NullPointerException {
		StudentResponse studentResponse = new StudentResponse();
		DiagnosticReportGenerator.generator(TestData.getAssessmentDetails(), TestData.getStudentResponseDetails(), studentResponse);
	}

}
