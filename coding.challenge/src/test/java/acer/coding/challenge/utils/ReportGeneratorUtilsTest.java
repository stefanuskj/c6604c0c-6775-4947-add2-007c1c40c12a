/**
 * 
 */
package acer.coding.challenge.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import acer.coding.challenge.TestData;
import acer.coding.challenge.beans.json.Question;
import acer.coding.challenge.beans.json.Response;

/**
 * @author stefanuskj
 *
 */
public class ReportGeneratorUtilsTest {

	/**
	 * Test method for {@link acer.coding.challenge.utils.ReportGeneratorUtils#getQuestionDetailsById(java.lang.String, java.util.List)}.
	 */
	@Test
	public void getQuestionDetailsByIdTest_shouldReturnQuestionClass() {
		assertEquals(TestData.getAssessmentDetails().getListOfQuestions().get(0),ReportGeneratorUtils.getQuestionDetailsById("numeracy1",TestData.getAssessmentDetails().getListOfQuestions()));
	}
	@Test
	public void getQuestionDetailsByIdTest_shouldReturnQuestionClassWithNullValue() {
		Question question = new Question();
		assertEquals(question,ReportGeneratorUtils.getQuestionDetailsById("numeracy100",TestData.getAssessmentDetails().getListOfQuestions()));
	}

	/**
	 * Test method for {@link acer.coding.challenge.utils.ReportGeneratorUtils#getResponseDetailsById(java.lang.String, java.util.List)}.
	 */
	@Test
	public void getResponseDetailsById_shouldReturnResponeClass() {
		assertEquals(TestData.getLatestStudentResponse().getListOfResponses().get(0),ReportGeneratorUtils.getResponseDetailsById("numeracy1",TestData.getLatestStudentResponse().getListOfResponses()));
	}
	@Test
	public void getResponseDetailsById_shouldReturnResponeClassWithNullValue() {
		Response response = new Response();
		assertEquals(response,ReportGeneratorUtils.getResponseDetailsById("numeracy100",TestData.getLatestStudentResponse().getListOfResponses()));
	}
	/**
	 * Test method for {@link acer.coding.challenge.utils.ReportGeneratorUtils#getStudentResponseById(java.lang.String, java.util.List)}.
	 */
	@Test
	public void testGetStudentResponseById() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link acer.coding.challenge.utils.ReportGeneratorUtils#getOptionDetailsById(acer.coding.challenge.beans.json.Question, java.lang.String)}.
	 */
	@Test
	public void testGetOptionDetailsById() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link acer.coding.challenge.utils.ReportGeneratorUtils#getStudentResponseByAssessmentId(java.lang.String, java.util.List)}.
	 */
	@Test
	public void testGetStudentResponseByAssessmentId() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link acer.coding.challenge.utils.ReportGeneratorUtils#getIdByLatestCompletedDate(java.util.List)}.
	 */
	@Test
	public void testGetIdByLatestCompletedDate() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link acer.coding.challenge.utils.ReportGeneratorUtils#getScoreEvaluation(java.util.List, java.util.List)}.
	 */
	@Test
	public void testGetScoreEvaluation() {
		fail("Not yet implemented");
	}

}
