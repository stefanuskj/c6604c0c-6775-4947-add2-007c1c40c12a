/**
 * 
 */
package acer.coding.challenge.generator;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

import acer.coding.challenge.TestData;
import acer.coding.challenge.beans.report.Report;
import acer.coding.challenge.exception.AssessmentFileNotFoundException;
import acer.coding.challenge.exception.DataNotFoundException;
import acer.coding.challenge.exception.QuestionFileNotFoundException;
import acer.coding.challenge.exception.StudentFileNotFoundException;
import acer.coding.challenge.exception.StudentResponseFileNotFoundException;

/**
 * @author stefanuskj
 *
 */
public class ReportGeneratorTest {

	/**
	 * Test method for {@link acer.coding.challenge.generator.ReportGenerator#generator(java.lang.String, int, acer.coding.challenge.beans.json.Properties)}.
	 */
	@Test
	public void reportGeneratorTest_shouldReturnReportClass() {
		Report report = new Report();
		report.setDiagnosticReport(TestData.getDiagnosticReport());
		try {
			assertEquals(report.getDiagnosticReport(),ReportGenerator.generator("student1",1,TestData.getProperties()).getDiagnosticReport());
		} catch (NumberFormatException | AssessmentFileNotFoundException | QuestionFileNotFoundException
				| StudentFileNotFoundException | StudentResponseFileNotFoundException | NullPointerException
				| DataNotFoundException | ParseException e) {
			System.out.println(e.getMessage());
		}
	}
	@Test(expected = DataNotFoundException.class)
	public void reportGeneratorTest_shouldReturnDataNotFoundException() throws NumberFormatException, AssessmentFileNotFoundException, QuestionFileNotFoundException, StudentFileNotFoundException, StudentResponseFileNotFoundException, NullPointerException, DataNotFoundException, ParseException {
		ReportGenerator.generator("student1",4,TestData.getProperties()).getDiagnosticReport();
		
	}

}
