package acer.coding.challenge;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;


import acer.coding.challenge.beans.report.Report;
import acer.coding.challenge.exception.AssessmentFileNotFoundException;
import acer.coding.challenge.exception.DataNotFoundException;
import acer.coding.challenge.exception.MissingPropertiesException;
import acer.coding.challenge.exception.QuestionFileNotFoundException;
import acer.coding.challenge.exception.StudentFileNotFoundException;
import acer.coding.challenge.exception.StudentResponseFileNotFoundException;
import acer.coding.challenge.generator.ReportGenerator;
import acer.coding.challenge.printer.DiagnosticReportPrinter;
import acer.coding.challenge.printer.FeedbackReportPrinter;
import acer.coding.challenge.printer.ProgressReportPrinter;

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
                	System.out.println(DiagnosticReportPrinter.printDiagnosticReport(report.getDiagnosticReport()));
                }
                else if (reportToGenerate == 2) {
                	System.out.println(ProgressReportPrinter.printProgressReport(report.getProgressReport()));
                }
                else if (reportToGenerate == 3) {
                	System.out.println(FeedbackReportPrinter.printFeedbackReport(report.getFeedbackReport()));
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
}