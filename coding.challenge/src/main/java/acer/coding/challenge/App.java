package acer.coding.challenge;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import acer.coding.challenge.beans.StrandDetails;
import acer.coding.challenge.beans.report.DiagnosticReport;
import acer.coding.challenge.beans.report.FeedbackReport;
import acer.coding.challenge.beans.report.FeedbackReportDetails;
import acer.coding.challenge.beans.report.ProgressReport;
import acer.coding.challenge.beans.report.ProgressReportDetails;
import acer.coding.challenge.beans.report.Report;
import acer.coding.challenge.exception.AssessmentFileNotFoundException;
import acer.coding.challenge.exception.DataNotFoundException;
import acer.coding.challenge.exception.MissingPropertiesException;
import acer.coding.challenge.exception.QuestionFileNotFoundException;
import acer.coding.challenge.exception.StudentFileNotFoundException;
import acer.coding.challenge.exception.StudentResponseFileNotFoundException;
import acer.coding.challenge.generator.ReportGenerator;

/**
 * @author stefanuskj
 *
 */
public class App 
{
	public static void main( String[] args ) {
    	Report report = new Report();
		Scanner userInput = null;
    	String studentId = "";
    	int reportToGenerate = 0;
    	boolean exit = false;
    	while (exit==false) {
    		try {
        		System.out.println( "Please enter the following" );
                System.out.print( "Student ID: " );
                userInput = new Scanner(System.in);
                studentId = userInput.nextLine();
                System.out.println();
                System.out.print( "Report to generate (1 for Diagnostic, 2 for Progress, 3 for Feedback, 4 for Exit): " );
                reportToGenerate = userInput.nextInt();
                if (reportToGenerate == 4) {
                	exit = true;
                	break;
                }
                report = ReportGenerator.generator(studentId, reportToGenerate, AppConfiguration.initProperties());
                if (reportToGenerate == 1) {
                	printDiagnosticReport(report.getDiagnosticReport());
                }
                else if (reportToGenerate == 2) {
                	printProgressReport(report.getProgressReport());
                }
                else if (reportToGenerate == 3) {
                	printFeedbackReport(report.getFeedbackReport());
                }
                System.out.println();
                
        	} catch (MissingPropertiesException | DataNotFoundException | AssessmentFileNotFoundException | QuestionFileNotFoundException | StudentFileNotFoundException | StudentResponseFileNotFoundException e) {
            	System.out.println(e.getMessage());
            } catch (FileNotFoundException e) {
            	System.out.println("File not found\n" +e.getMessage());
            } catch (NumberFormatException e) {
    			System.out.println("Wrong number formnat \n"+e.getMessage());
    		} catch (ParseException e) {
    			System.out.println("Wrong format to parse \n"+e.getMessage());
    		} catch (InputMismatchException e) {
    			System.out.println("Please enter numeric character only \n");
    		}
    	}
    	userInput.close();
    }
	
	private static void printDiagnosticReport(DiagnosticReport diagnosticReport) {
		StrandDetails strandDetails = new StrandDetails();
		List<StrandDetails> listOfStrandDetails = diagnosticReport.getListOfStrandDetails();
		System.out.println(diagnosticReport.getFirstName()+" "+diagnosticReport.getLastName()+" recently completed "+diagnosticReport.getAssessmentName()+" assessment on " + diagnosticReport.getCompletedDate());
		System.out.println("He got "+ diagnosticReport.getRawScore() + " questions right out of "+ diagnosticReport.getTotalQuestion()+".  Details by strand given below:\n");	
		for (int i = 0;i < listOfStrandDetails.size(); i++) {
			strandDetails = listOfStrandDetails.get(i);
			System.out.println(strandDetails.getStrandName() + ": "+strandDetails.getCorrectAnswer().size()+ " out of "+strandDetails.getStrandTotal() +" correct");
		}
	}
	
	private static void printProgressReport(ProgressReport progressReport) {
		ProgressReportDetails progressReportDetails = new ProgressReportDetails();
		List<ProgressReportDetails> listOfProgressReportDetails = progressReport.getListOfProgressReportDetails();
		System.out.println(progressReport.getFirstName()+" "+progressReport.getLastName()+" has completed "+progressReport.getAssessmentName()+" assessment "+progressReport.getCompletedAssessment()+" times in total. Date and raw score given below:\n");
		for (int i = 0;i < listOfProgressReportDetails.size(); i++) {
			progressReportDetails = listOfProgressReportDetails.get(i);
			System.out.println("Date: "+progressReportDetails.getCompletedDate()+ ", Raw Score: "+progressReportDetails.getRawScore()+ " out of "+ progressReportDetails.getTotalQuestion());
		}
		System.out.println("\n"+progressReport.getFirstName()+" "+progressReport.getLastName()+" got "+progressReport.getScoreDifferences()+" more correct in the recent completed assessment than the oldest");
	}
	
	private static void printFeedbackReport(FeedbackReport feedbackReport) {
		FeedbackReportDetails feedbackReportDetails = new FeedbackReportDetails();
		List<FeedbackReportDetails> listOfFeedbackReportDetails = feedbackReport.getListOfFeedbackReportDetails();
		System.out.println(feedbackReport.getFirstName()+" "+feedbackReport.getLastName()+" recently completed "+feedbackReport.getAssessmentName()+" assessment on " + feedbackReport.getCompletedDate());
		System.out.println("He got "+ feedbackReport.getRawScore() + " questions right out of "+ feedbackReport.getTotalQuestion()+". Feedback for wrong answers given below:\n");
		for (int i = 0; i < listOfFeedbackReportDetails.size(); i++) {
			feedbackReportDetails = listOfFeedbackReportDetails.get(i);
			System.out.println("Question: "+ feedbackReportDetails.getQuestion());
			System.out.println("Your answer: "+ feedbackReportDetails.getStudentAnswerLabel()+" with value "+ feedbackReportDetails.getStudentAnswerValue());
			System.out.println("Right answer: "+ feedbackReportDetails.getCorrectAnswerLabel()+" with value "+feedbackReportDetails.getCorrectAnswerValue());
			System.out.println("Hint: "+ feedbackReportDetails.getQuestionHint());
			System.out.println("");
		}
	}
}