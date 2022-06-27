/**
 * 
 */
package acer.coding.challenge.helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import acer.coding.challenge.beans.json.Assessment;
import acer.coding.challenge.beans.json.Question;
import acer.coding.challenge.beans.json.Student;
import acer.coding.challenge.beans.json.StudentResponse;
import acer.coding.challenge.exception.AssessmentFileNotFoundException;
import acer.coding.challenge.exception.DataNotFoundException;
import acer.coding.challenge.exception.QuestionFileNotFoundException;
import acer.coding.challenge.exception.StudentFileNotFoundException;
import acer.coding.challenge.exception.StudentResponseFileNotFoundException;



/**
 * @author stefanuskj
 *
 */
public class JsonHelper {
	public static Assessment getAssessmentById (String assessmentId, String assessmentDataFilePath) throws AssessmentFileNotFoundException, DataNotFoundException {
		Assessment assessment = null;
		JsonReader reader = null;
		Gson gson = null;
		try {
			reader = new JsonReader(new InputStreamReader(new FileInputStream(assessmentDataFilePath)));
			reader.beginArray();
			gson = new Gson();
			while (reader.hasNext()) {
				Assessment temp = gson.fromJson(reader, Assessment.class);
				if (temp.getAssessmentId().equals(assessmentId)) {
					assessment = temp;
					break;
				}
			}
		} catch (IOException e) {
			throw new AssessmentFileNotFoundException("Assessment data file not found");
		} finally {
			try {
				reader.close();
			} catch (IOException | NullPointerException e) {
				throw new AssessmentFileNotFoundException("Assessment data file not found");
			}
		}
		if (assessment==null) {
			throw new DataNotFoundException("Assessment data for Assessment Id: "+ assessmentId +" not found");
		}
		return assessment;
	}
	
	public static Student getStudentById (String studentId, String studentDataFilePath) throws StudentFileNotFoundException, DataNotFoundException {
		Student student = null;
		JsonReader reader = null;
		Gson gson = null;
		try {
			reader = new JsonReader(new InputStreamReader(new FileInputStream(studentDataFilePath)));
			reader.beginArray();
			gson = new Gson();
			while (reader.hasNext()) {
				Student temp = gson.fromJson(reader, Student.class);
				if (temp.getStudentId().equals(studentId)) {
					student = temp;
					break;
				}
			}
		}  catch (IOException e) {
			throw new StudentFileNotFoundException("Student data file not found");
		} finally {
			try {
				reader.close();
			} catch (IOException | NullPointerException e) {
				throw new StudentFileNotFoundException("Student data file not found");
			}
		}
		if (student==null) {
			throw new DataNotFoundException("Student data for Student Id: "+ studentId +" not found");
		}
		return student;
	}
	
	public static Question getQuestionById (String questionId, String questionDataFilePath) throws QuestionFileNotFoundException, DataNotFoundException {
		Question question = null;
		JsonReader reader = null;
		Gson gson = null;
		try {
			reader = new JsonReader(new InputStreamReader(new FileInputStream(questionDataFilePath)));
			reader.beginArray();
			gson = new Gson();
			while (reader.hasNext()) {
				Question temp = gson.fromJson(reader, Question.class);
				if (temp.getQuestionId().equals(questionId)) {
					question = temp;
					break;
				}
			}
		}  catch (IOException e) {
			throw new QuestionFileNotFoundException("Question data file not found");
		} finally {
			try {
				reader.close();
			} catch (IOException | NullPointerException e) {
				throw new QuestionFileNotFoundException("Question data file not found");
			}
		}
		if (question==null) {
			throw new DataNotFoundException("Question data for Question Id: "+ questionId +" not found");
		}
		return question;
	}
	
	public static List<StudentResponse> getStudentResponseByStudentId (String studentId, String studentResponseDataFilePath) throws StudentResponseFileNotFoundException, DataNotFoundException{
		List<StudentResponse> listOfStudentResponse = new ArrayList<StudentResponse>();
		JsonReader reader = null;
		Gson gson = null;
		try {
			reader = new JsonReader(new InputStreamReader(new FileInputStream(studentResponseDataFilePath)));
			reader.beginArray();
			gson = new Gson();
			while (reader.hasNext()) {
				StudentResponse studentResponse = gson.fromJson(reader, StudentResponse.class);
				if (studentResponse.getCompleted() != null) {
					if (studentResponse.getStudent().getStudentId().equals(studentId)) {
						listOfStudentResponse.add(studentResponse);
					}
				}
			}
		}  catch (IOException e) {
			throw new StudentResponseFileNotFoundException("Student Response data file not found");
		} finally {
			try {
				reader.close();
			} catch (IOException | NullPointerException e) {
				throw new StudentResponseFileNotFoundException("Student Response data file not found");
			}
		}
		if (listOfStudentResponse.size()<1) {
			throw new DataNotFoundException("Student Response data for Student Id: "+ studentId +" not found");
		}
		return listOfStudentResponse;
	}
		
}
