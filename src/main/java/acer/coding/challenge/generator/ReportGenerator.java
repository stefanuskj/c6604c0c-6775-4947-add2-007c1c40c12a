/**
 * 
 */
package acer.coding.challenge.generator;

import java.text.ParseException;


import acer.coding.challenge.beans.AssessmentDetails;
import acer.coding.challenge.beans.StudentResponseDetails;
import acer.coding.challenge.beans.json.Assessment;
import acer.coding.challenge.beans.json.Properties;
import acer.coding.challenge.beans.json.Student;
import acer.coding.challenge.beans.json.StudentResponse;
import acer.coding.challenge.beans.report.Report;
import acer.coding.challenge.exception.AssessmentFileNotFoundException;
import acer.coding.challenge.exception.DataNotFoundException;
import acer.coding.challenge.exception.QuestionFileNotFoundException;
import acer.coding.challenge.exception.StudentFileNotFoundException;
import acer.coding.challenge.exception.StudentResponseFileNotFoundException;
import acer.coding.challenge.helper.JsonHelper;
import acer.coding.challenge.helper.ReportGeneratorHelper;
import acer.coding.challenge.utils.ReportGeneratorUtils;



/**
 * @author stefanuskj
 *
 */
public class ReportGenerator {
	public static Report generator(String studentId, int reportToGenerate, Properties properties) throws DataNotFoundException, NumberFormatException, ParseException, AssessmentFileNotFoundException, QuestionFileNotFoundException, StudentFileNotFoundException, StudentResponseFileNotFoundException, NullPointerException {
		Report report = new Report();
		Student student = JsonHelper.getStudentById(studentId, properties.getStudentDataFilePath());
		StudentResponseDetails studentResponseDetails = ReportGeneratorHelper.getStudentResponseDetails(student, properties.getStudentResponseDataFilePath());
		StudentResponse latestStudentResponse = ReportGeneratorUtils.getStudentResponseById(ReportGeneratorUtils.getIdByLatestCompletedDate(studentResponseDetails.getListOfStudentResponses()),studentResponseDetails.getListOfStudentResponses());
		Assessment assessment = JsonHelper.getAssessmentById(latestStudentResponse.getAssessmentId(), properties.getAssessmentDataFilePath());
		AssessmentDetails assessmentDetails = ReportGeneratorHelper.getAssessmentDetails(assessment, properties.getQuestionDataFilePath());
		if (reportToGenerate == 1) {
			report.setDiagnosticReport(DiagnosticReportGenerator.generator(assessmentDetails, studentResponseDetails, latestStudentResponse));
		}
		else if (reportToGenerate == 2) {
			assessment = JsonHelper.getAssessmentById(properties.getAssessmentId(), properties.getAssessmentDataFilePath());
			assessmentDetails = ReportGeneratorHelper.getAssessmentDetails(assessment, properties.getQuestionDataFilePath());
			report.setProgressReport(ProgressReportGenerator.generator(assessmentDetails, studentResponseDetails));
		}
		else if (reportToGenerate == 3) {
			report.setFeedbackReport(FeedbackReportGenerator.generator(assessmentDetails, studentResponseDetails, latestStudentResponse));
		}
		else {
			throw new DataNotFoundException("Report is not available");
		}
		return report;
	}
}
