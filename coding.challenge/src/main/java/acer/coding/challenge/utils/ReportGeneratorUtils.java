/**
 * 
 */
package acer.coding.challenge.utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import acer.coding.challenge.beans.StrandDetails;
import acer.coding.challenge.beans.json.Question;
import acer.coding.challenge.beans.json.QuestionOption;
import acer.coding.challenge.beans.json.Response;
import acer.coding.challenge.beans.json.StudentResponse;
import acer.coding.challenge.exception.DataNotFoundException;

/**
 * @author stefanuskj
 *
 */
public class ReportGeneratorUtils {
	
	public static Question getQuestionDetailsById(String questionId, List<Question> listOfQuestion) {
		Question question = new Question();
		for (int i = 0; i < listOfQuestion.size(); i++) {
			if (listOfQuestion.get(i).getQuestionId().equals(questionId)) {
				question = listOfQuestion.get(i);
				break;
			}
		}
		return question;
	}
	
	public static Response getResponseDetailsById(String questionId, List<Response> listOfResponse) {
		Response response = new Response();
		for (int i = 0; i < listOfResponse.size(); i++) {
			if (listOfResponse.get(i).getQuestionId().equals(questionId)) {
				response = listOfResponse.get(i);
				break;
			}
		}
		return response;
	}
	
	public static StudentResponse getStudentResponseById(String studentResponseId, List<StudentResponse> listOfStudentResponse) {
		StudentResponse studentResponse = new StudentResponse();
		for (int i = 0; i < listOfStudentResponse.size(); i++) {
			if (listOfStudentResponse.get(i).getStudentResponseId().equals(studentResponseId)) {
				studentResponse = listOfStudentResponse.get(i);
				break;
			}
		}
		return studentResponse;
	}
	
	public static QuestionOption getOptionDetailsById(Question question, String response) {
		QuestionOption questionOption = new QuestionOption();
		List<QuestionOption> listOfOptions = question.getQuestionConfig().getListOfOptions();
		for (int j = 0; j < listOfOptions.size(); j++) {
			if (listOfOptions.get(j).getOptionId().equals(response)) {
				questionOption = listOfOptions.get(j);
				break;
			}
		}
		return questionOption;
	}
	
	public static List<StudentResponse> getStudentResponseByAssessmentId(String assessmentId, List<StudentResponse> listOfStudentResponses) throws DataNotFoundException {
		List<StudentResponse> filteredListOfStudentResponses = new ArrayList<StudentResponse>();
		StudentResponse studentResponse = new StudentResponse();
		for (int i = 0; i < listOfStudentResponses.size(); i++) {
			studentResponse = listOfStudentResponses.get(i);
			if (studentResponse.getAssessmentId().equals(assessmentId)) {
				filteredListOfStudentResponses.add(studentResponse);
			}
		}
		if (filteredListOfStudentResponses.size() < 1) {
			throw new DataNotFoundException("Student response not found for AssessmentID: "+ assessmentId);
		}
		return filteredListOfStudentResponses;
	}
	
	public static String getIdByLatestCompletedDate(List<StudentResponse> listOfStudentResponse) throws ParseException  {
		String studentResponseId = "";
		String completedDate = "";
		for(int i = 0; i < listOfStudentResponse.size(); i++) {
			StudentResponse temp = listOfStudentResponse.get(i);
			if (studentResponseId.equals("")) {
				studentResponseId = temp.getStudentResponseId();
				completedDate = temp.getCompleted();
			}
			else if (DateUtils.dateComparator(temp.getCompleted(), completedDate)) {
				completedDate = temp.getCompleted();
				studentResponseId = temp.getStudentResponseId();
			} 
			
		}
		return studentResponseId;
	}
	
	public static HashMap<String, StrandDetails> getScoreEvaluation(List<Question> listOfQuestion, List<Response> listOfResponse) {
		HashMap<String, StrandDetails> scoreMapping = new HashMap<String, StrandDetails>();
		StrandDetails strandDetails = new StrandDetails();
		for(int i = 0; i < listOfQuestion.size(); i++) {
			if(!scoreMapping.containsKey(listOfQuestion.get(i).getStrand())) {
				strandDetails = new StrandDetails();
				strandDetails.setStrandName(listOfQuestion.get(i).getStrand());
			}
			else {
				strandDetails = scoreMapping.get(listOfQuestion.get(i).getStrand());
			}
			strandDetails.setStrandTotal(strandDetails.getStrandTotal()+1);
			if (listOfQuestion.get(i).getQuestionConfig().getQuestionKey().equals(listOfResponse.get(i).getResponse())) {
				strandDetails.addCorrectAnswer(listOfResponse.get(i).getQuestionId());
			}
			else {
				strandDetails.addWrongAnswer(listOfResponse.get(i).getQuestionId());
			}
			scoreMapping.put(listOfQuestion.get(i).getStrand(), strandDetails);
		}
		return scoreMapping;
	}
}
