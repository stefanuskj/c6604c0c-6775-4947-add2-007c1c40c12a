/**
 * 
 */
package acer.coding.challenge;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import acer.coding.challenge.beans.AssessmentDetails;
import acer.coding.challenge.beans.StrandDetails;
import acer.coding.challenge.beans.StudentResponseDetails;
import acer.coding.challenge.beans.json.Assessment;
import acer.coding.challenge.beans.json.AssessmentQuestion;
import acer.coding.challenge.beans.json.Properties;
import acer.coding.challenge.beans.json.Question;
import acer.coding.challenge.beans.json.Student;
import acer.coding.challenge.beans.json.StudentResponse;
import acer.coding.challenge.beans.report.DiagnosticReport;
import acer.coding.challenge.beans.report.FeedbackReport;
import acer.coding.challenge.beans.report.FeedbackReportDetails;
import acer.coding.challenge.beans.report.ProgressReport;
import acer.coding.challenge.beans.report.ProgressReportDetails;


/**
 * @author stefanuskj
 *
 */
public class TestData {
	public static Properties getProperties() {
		Properties properties = new Properties();
		properties.setStudentDataFilePath("./data/students.json");
		properties.setAssessmentDataFilePath("./data/assessments.json");
		properties.setQuestionDataFilePath("./data/questions.json");
		properties.setStudentResponseDataFilePath("./data/student-responses.json");
		properties.setAssessmentId("assessment1");
		return properties;
	}
	
	public static AssessmentDetails getAssessmentDetails() {
		AssessmentDetails assessmentDetails = new AssessmentDetails();
		Assessment assessment = new Assessment();
		Question question = new Question();
		List<AssessmentQuestion> listOfAssessmentQuestions = new ArrayList<AssessmentQuestion>();
		List<Question> listOfQuestions = new ArrayList<Question>();
		for(int i=1;i<=16;i++) {
			AssessmentQuestion assessmentQuestion = new AssessmentQuestion();
			assessmentQuestion.setQuestionId("numeracy"+i);
			assessmentQuestion.setPosition(i);
			listOfAssessmentQuestions.add(assessmentQuestion);
		}
		assessment.setAssessmentId("assessment1");
		assessment.setAssessmentName("Numeracy");
		assessment.setListOfQuestions(listOfAssessmentQuestions);
		assessmentDetails.setAssessment(assessment);
		JsonReader reader = null;
		Gson gson = null;
		try {
			reader = new JsonReader(new InputStreamReader(new FileInputStream("./data/questions.json")));
			reader.beginArray();
			gson = new Gson();
			while (reader.hasNext()) {
				question = gson.fromJson(reader, Question.class);
				listOfQuestions.add(question);
			}
		}  catch (IOException e) {
			
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				
			}
		}
		listOfQuestions.remove(9);
		assessmentDetails.setListOfQuestions(listOfQuestions);
		return assessmentDetails;
	}
	
	public static StudentResponse getLatestStudentResponse() {
		return getStudentResponseDetails().getListOfStudentResponses().get(2);
	}
	
	public static StudentResponseDetails getStudentResponseDetails() {
		StudentResponseDetails studentResponseDetails = new StudentResponseDetails();
		List<StudentResponse> listOfStudentResponses = new ArrayList<StudentResponse>();
		StudentResponse studentResponse = new StudentResponse();
		Student student = new Student();
		student.setStudentId("student1");
		student.setFirstName("Tony");
		student.setLastName("Stark");
		student.setYearLevel(6);
		studentResponseDetails.setStudent(student);
		JsonReader reader = null;
		Gson gson = null;
		try {
			reader = new JsonReader(new InputStreamReader(new FileInputStream("./data/student-responses.json")));
			reader.beginArray();
			gson = new Gson();
			while (reader.hasNext()) {
				studentResponse = gson.fromJson(reader, StudentResponse.class);
				if (studentResponse.getStudent().getStudentId().equals("student1")&&studentResponse.getListOfResponses().size()==16) {
					listOfStudentResponses.add(studentResponse);
				}
			}
		}  catch (IOException e) {
			
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				
			}
		}
		studentResponseDetails.setListOfStudentResponses(listOfStudentResponses);
		return studentResponseDetails;
	}
	
	public static DiagnosticReport getDiagnosticReport() {
		DiagnosticReport diagnosticReport = new DiagnosticReport();
		List<StrandDetails> listOfStrandDetails = new ArrayList<StrandDetails>();
		List<String> stringDummy = new ArrayList<String>();
		StrandDetails strandDetails = new StrandDetails();
		
		strandDetails.setStrandName("Measurement and Geometry");
		stringDummy.add("numeracy6");
		stringDummy.add("numeracy7");
		stringDummy.add("numeracy8");
		stringDummy.add("numeracy9");
		stringDummy.add("numeracy10");
		stringDummy.add("numeracy11");
		stringDummy.add("numeracy12");
		strandDetails.setCorrectAnswer(stringDummy);
		strandDetails.setStrandTotal(7);
		listOfStrandDetails.add(strandDetails);
		strandDetails = new StrandDetails();
		strandDetails.setStrandName("Number and Algebra");
		stringDummy = new ArrayList<String>();
		stringDummy.add("numeracy1");
		stringDummy.add("numeracy2");
		stringDummy.add("numeracy3");
		stringDummy.add("numeracy4");
		stringDummy.add("numeracy5");
		strandDetails.setCorrectAnswer(stringDummy);
		strandDetails.setStrandTotal(5);
		listOfStrandDetails.add(strandDetails);
		strandDetails = new StrandDetails();
		strandDetails.setStrandName("Statistics and Probability");
		stringDummy = new ArrayList<String>();
		stringDummy.add("numeracy13");
		stringDummy.add("numeracy14");
		stringDummy.add("numeracy15");
		strandDetails.setCorrectAnswer(stringDummy);
		stringDummy = new ArrayList<String>();
		stringDummy.add("numeracy16");
		strandDetails.setWrongAnswer(stringDummy);
		strandDetails.setStrandTotal(4);
		listOfStrandDetails.add(strandDetails);
		
		diagnosticReport.setFirstName("Tony");
		diagnosticReport.setLastName("Stark");
		diagnosticReport.setAssessmentName("Numeracy");
		diagnosticReport.setRawScore(15);
		diagnosticReport.setTotalQuestion(16);
		diagnosticReport.setCompletedDate("16th December 2021 10:46 AM"); 
		diagnosticReport.setListOfStrandDetails(listOfStrandDetails);
		
		return diagnosticReport;
		
	}
	public static FeedbackReport getFeedbackReport() {
		FeedbackReport feedbackReport = new FeedbackReport();
		List<FeedbackReportDetails> list = new ArrayList<FeedbackReportDetails>();
		FeedbackReportDetails details = new FeedbackReportDetails();
		
		details.setQuestion("What is the 'median' of the following group of numbers 5, 21, 7, 18, 9?");
		details.setStudentAnswerLabel("A");
		details.setStudentAnswerValue("7");
		details.setCorrectAnswerLabel("B");
		details.setCorrectAnswerValue("9");
		details.setQuestionHint("You must first arrange the numbers in ascending order. The median is the middle term, which in this case is 9");
		list.add(details);
		feedbackReport.setFirstName("Tony");
		feedbackReport.setLastName("Stark");
		feedbackReport.setAssessmentName("Numeracy");
		feedbackReport.setRawScore(15);
		feedbackReport.setTotalQuestion(16);
		feedbackReport.setCompletedDate("16th December 2021 10:46 AM");
		feedbackReport.setListOfFeedbackReportDetails(list);
		
		return feedbackReport;
	}
	public static ProgressReport getProgressReport() {
		ProgressReport progressReport = new ProgressReport();
		List<ProgressReportDetails> listOfProgressReportDetails = new ArrayList<ProgressReportDetails>();
		progressReport.setFirstName("Tony");
		progressReport.setLastName("Stark");
		progressReport.setAssessmentName("Numeracy");
		progressReport.setCompletedAssessment(3);
		
		ProgressReportDetails progressReportDetails = new ProgressReportDetails();
		progressReportDetails.setCompletedDate("14th December 2019 ");
		progressReportDetails.setRawScore(6);
		progressReportDetails.setTotalQuestion(16);
		listOfProgressReportDetails.add(progressReportDetails);
		
		progressReportDetails = new ProgressReportDetails();
		progressReportDetails.setCompletedDate("14th December 2020 ");
		progressReportDetails.setRawScore(10);
		progressReportDetails.setTotalQuestion(16);
		listOfProgressReportDetails.add(progressReportDetails);
		
		progressReportDetails = new ProgressReportDetails();
		progressReportDetails.setCompletedDate("14th December 2021 ");
		progressReportDetails.setRawScore(15);
		progressReportDetails.setTotalQuestion(16);
		listOfProgressReportDetails.add(progressReportDetails);
		progressReport.setScoreDifferences(9);
		progressReport.setListOfProgressReportDetails(listOfProgressReportDetails);
		return progressReport;
	}

}
