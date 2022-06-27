/**
 * 
 */
package acer.coding.challenge.printer;

import java.util.List;

import acer.coding.challenge.beans.report.ProgressReport;
import acer.coding.challenge.beans.report.ProgressReportDetails;

/**
 * @author stefanuskj
 *
 */
public class ProgressReportPrinter {
	public static String printProgressReport(ProgressReport progressReport) {
		StringBuilder builder = new StringBuilder();
		ProgressReportDetails progressReportDetails = new ProgressReportDetails();
		List<ProgressReportDetails> listOfProgressReportDetails = progressReport.getListOfProgressReportDetails();
		builder.append(progressReport.getFirstName()+" "+progressReport.getLastName()+" has completed "+progressReport.getAssessmentName()+" assessment "+progressReport.getCompletedAssessment()+" times in total. Date and raw score given below:\n");
		builder.append(System.getProperty("line.separator"));
		for (int i = 0;i < listOfProgressReportDetails.size(); i++) {
			progressReportDetails = listOfProgressReportDetails.get(i);
			builder.append("Date: "+progressReportDetails.getCompletedDate()+ ", Raw Score: "+progressReportDetails.getRawScore()+ " out of "+ progressReportDetails.getTotalQuestion());
			builder.append(System.getProperty("line.separator"));
		}
		builder.append("\n"+progressReport.getFirstName()+" "+progressReport.getLastName()+" got "+progressReport.getScoreDifferences()+" more correct in the recent completed assessment than the oldest");
		builder.append(System.getProperty("line.separator"));
		return builder.toString();
	}
}
