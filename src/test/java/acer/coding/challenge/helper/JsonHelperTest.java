/**
 * 
 */
package acer.coding.challenge.helper;

import static org.junit.Assert.*;

import org.junit.Test;

import acer.coding.challenge.TestData;
import acer.coding.challenge.exception.AssessmentFileNotFoundException;
import acer.coding.challenge.exception.DataNotFoundException;
import acer.coding.challenge.exception.QuestionFileNotFoundException;
import acer.coding.challenge.exception.StudentFileNotFoundException;
import acer.coding.challenge.exception.StudentResponseFileNotFoundException;

/**
 * @author stefanuskj
 *
 */
public class JsonHelperTest {

	/**
	 * Test method for {@link acer.coding.challenge.helper.JsonHelper#getAssessmentById(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void getAssessmentByIdTest_shouldReturnAssessmentClass() {
		try {
			assertEquals(TestData.getAssessmentDetails().getAssessment(),JsonHelper.getAssessmentById("assessment1",TestData.getProperties().getAssessmentDataFilePath()));
		} catch (AssessmentFileNotFoundException | DataNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	@Test(expected = DataNotFoundException.class)
	public void getAssessmentByIdTest_shouldReturnDataNotFoundException() throws AssessmentFileNotFoundException, DataNotFoundException {
		JsonHelper.getAssessmentById("assessment10",TestData.getProperties().getAssessmentDataFilePath());
	}
	@Test(expected = AssessmentFileNotFoundException.class)
	public void getAssessmentByIdTest_shouldReturnAssessmentFileNotFoundException() throws AssessmentFileNotFoundException, DataNotFoundException {
		JsonHelper.getAssessmentById("assessment1","");
	}
	@Test(expected = AssessmentFileNotFoundException.class)
	public void getAssessmentByIdWithNullValueTest_shouldReturnAssessmentFileNotFoundException() throws AssessmentFileNotFoundException, DataNotFoundException {
		JsonHelper.getAssessmentById("","");
	}
	/**
	 * Test method for {@link acer.coding.challenge.helper.JsonHelper#getStudentById(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void getStudentByIdTest_shouldReturnStudentClass() {
		try {
			assertEquals(TestData.getStudentResponseDetails().getStudent(),JsonHelper.getStudentById("student1",TestData.getProperties().getStudentDataFilePath()));
		} catch (StudentFileNotFoundException | DataNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	@Test(expected = DataNotFoundException.class)
	public void getStudentByIdTest_shouldReturnDataNotFoundException() throws StudentFileNotFoundException, DataNotFoundException {
		JsonHelper.getStudentById("student10",TestData.getProperties().getStudentDataFilePath());
	}
	@Test(expected = StudentFileNotFoundException.class)
	public void getStudentByIdTest_shouldReturnStudentFileNotFoundException() throws StudentFileNotFoundException, DataNotFoundException {
		JsonHelper.getStudentById("student10","");
	}
	/**
	 * Test method for {@link acer.coding.challenge.helper.JsonHelper#getQuestionById(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void getQuestionByIdTest_shouldReturnQuestionClass() {
		try {
			assertEquals(TestData.getAssessmentDetails().getListOfQuestions().get(0),JsonHelper.getQuestionById("numeracy1",TestData.getProperties().getQuestionDataFilePath()));
		} catch (QuestionFileNotFoundException | DataNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Test method for {@link acer.coding.challenge.helper.JsonHelper#getStudentResponseByStudentId(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void getStudentResponseByStudentIdTest_shouldReturnListOfStudentResponse() {
		try {
			assertEquals(TestData.getStudentResponseDetails().getListOfStudentResponses(),JsonHelper.getStudentResponseByStudentId("student1",TestData.getProperties().getStudentResponseDataFilePath()));
		} catch (StudentResponseFileNotFoundException | DataNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	

}
