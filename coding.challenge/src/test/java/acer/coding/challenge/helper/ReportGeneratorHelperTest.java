/**
 * 
 */
package acer.coding.challenge.helper;

import static org.junit.Assert.*;

import org.junit.Test;

import acer.coding.challenge.TestData;
import acer.coding.challenge.beans.json.Assessment;
import acer.coding.challenge.beans.json.Student;
import acer.coding.challenge.exception.DataNotFoundException;
import acer.coding.challenge.exception.QuestionFileNotFoundException;
import acer.coding.challenge.exception.StudentResponseFileNotFoundException;

/**
 * @author stefanuskj
 *
 */
public class ReportGeneratorHelperTest {

	/**
	 * Test method for {@link acer.coding.challenge.helper.ReportGeneratorHelper#getAssessmentDetails(acer.coding.challenge.beans.json.Assessment, java.lang.String)}.
	 */
	@Test
	public void getAssessmentDetailsTest_shouldReturnAssessmentDetails() {
		try {
			assertEquals(TestData.getAssessmentDetails(),ReportGeneratorHelper.getAssessmentDetails(TestData.getAssessmentDetails().getAssessment(),TestData.getProperties().getQuestionDataFilePath()));
		} catch (QuestionFileNotFoundException | DataNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	@Test(expected = DataNotFoundException.class)
	public void getAssessmentDetailsTest_shouldReturnDataNotFoundException() throws QuestionFileNotFoundException, DataNotFoundException {
		Assessment assessment = new Assessment();
		ReportGeneratorHelper.getAssessmentDetails(assessment,TestData.getProperties().getQuestionDataFilePath());
		
	}

	/**
	 * Test method for {@link acer.coding.challenge.helper.ReportGeneratorHelper#getStudentResponseDetails(acer.coding.challenge.beans.json.Student, java.lang.String)}.
	 */
	@Test
	public void getStudentResponseDetailsTest_shouldReturnStudentResponseDetails() {
		try {
			assertEquals(TestData.getStudentResponseDetails(),ReportGeneratorHelper.getStudentResponseDetails(TestData.getStudentResponseDetails().getStudent(),TestData.getProperties().getStudentResponseDataFilePath()));
		} catch (StudentResponseFileNotFoundException | DataNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	@Test(expected = DataNotFoundException.class)
	public void getStudentResponseDetailsTest_shouldReturnDataNotFoundException() throws DataNotFoundException, StudentResponseFileNotFoundException {
		Student student = new Student();
		ReportGeneratorHelper.getStudentResponseDetails(student,TestData.getProperties().getStudentResponseDataFilePath());
	}

}
