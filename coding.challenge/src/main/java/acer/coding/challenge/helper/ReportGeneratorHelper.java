/**
 * 
 */
package acer.coding.challenge.helper;

import java.util.ArrayList;
import java.util.List;

import acer.coding.challenge.beans.AssessmentDetails;
import acer.coding.challenge.beans.StudentResponseDetails;
import acer.coding.challenge.beans.json.Assessment;
import acer.coding.challenge.beans.json.AssessmentQuestion;
import acer.coding.challenge.beans.json.Question;
import acer.coding.challenge.beans.json.Student;
import acer.coding.challenge.exception.DataNotFoundException;
import acer.coding.challenge.exception.QuestionFileNotFoundException;
import acer.coding.challenge.exception.StudentResponseFileNotFoundException;


/**
 * @author stefanuskj
 *
 */
public class ReportGeneratorHelper {
	public static AssessmentDetails getAssessmentDetails(Assessment assessment, String questionDataFilePath) throws DataNotFoundException, QuestionFileNotFoundException {
		AssessmentDetails assessmentDetails = new AssessmentDetails();
		List<Question> listOfQuestions = new ArrayList<Question>();
		List<AssessmentQuestion> listOfAssessmentQuestions = assessment.getListOfQuestions();
		if (listOfAssessmentQuestions.size() < 1) {
			throw new DataNotFoundException("Assessment Questions data not found for AssessmentID: "+assessment.getAssessmentId());
		}
		for (int i = 0; i < listOfAssessmentQuestions.size(); i++) {
			Question question = new Question();
			question =  JsonHelper.getQuestionById(listOfAssessmentQuestions.get(i).getQuestionId(), questionDataFilePath);
			listOfQuestions.add(question);
		}
		assessmentDetails.setAssessment(assessment);
		assessmentDetails.setListOfQuestions(listOfQuestions);
		return assessmentDetails;
	}
	
	public static StudentResponseDetails getStudentResponseDetails(Student student, String studentResponseDataFilePath) throws DataNotFoundException, StudentResponseFileNotFoundException {
		StudentResponseDetails studentResponseDetails = new StudentResponseDetails();
		studentResponseDetails.setStudent(student);
		studentResponseDetails.setListOfStudentResponses(JsonHelper.getStudentResponseByStudentId(student.getStudentId(), studentResponseDataFilePath));
		return studentResponseDetails;
	} 
}
