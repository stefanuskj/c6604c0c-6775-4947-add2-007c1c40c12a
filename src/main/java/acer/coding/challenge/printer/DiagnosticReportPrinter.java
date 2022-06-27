/**
 * 
 */
package acer.coding.challenge.printer;

import java.util.List;

import acer.coding.challenge.beans.StrandDetails;
import acer.coding.challenge.beans.report.DiagnosticReport;

/**
 * @author stefanuskj
 *
 */
public class DiagnosticReportPrinter {
	public static String printDiagnosticReport(DiagnosticReport diagnosticReport) {
		StrandDetails strandDetails = new StrandDetails();
		List<StrandDetails> listOfStrandDetails = diagnosticReport.getListOfStrandDetails();
		StringBuilder builder = new StringBuilder();
		builder.append(diagnosticReport.getFirstName()+" "+diagnosticReport.getLastName()+" recently completed "+diagnosticReport.getAssessmentName()+" assessment on " + diagnosticReport.getCompletedDate());
		builder.append(System.getProperty("line.separator"));
		builder.append("He got "+ diagnosticReport.getRawScore() + " questions right out of "+ diagnosticReport.getTotalQuestion()+".  Details by strand given below:\n");	
		builder.append(System.getProperty("line.separator"));
		for (int i = 0;i < listOfStrandDetails.size(); i++) {
			strandDetails = listOfStrandDetails.get(i);
			builder.append(strandDetails.getStrandName() + ": "+strandDetails.getCorrectAnswer().size()+ " out of "+strandDetails.getStrandTotal() +" correct");
			builder.append(System.getProperty("line.separator"));
		}
		return builder.toString();
	}
}
