/**
 * 
 */
package acer.coding.challenge.printer;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import acer.coding.challenge.TestData;
import acer.coding.challenge.beans.report.ProgressReportDetails;

/**
 * @author stefanuskj
 *
 */
public class ProgressReportPrinterTest {

	/**
	 * Test method for {@link acer.coding.challenge.printer.ProgressReportPrinter#printProgressReport(acer.coding.challenge.beans.report.ProgressReport)}.
	 */
	@Test
	public void testPrintProgressReport() {
		StringBuilder builder = new StringBuilder();
		ProgressReportDetails progressReportDetails = new ProgressReportDetails();
		List<ProgressReportDetails> listOfProgressReportDetails = TestData.getProgressReport().getListOfProgressReportDetails();
		builder.append(TestData.getProgressReport().getFirstName()+" "+TestData.getProgressReport().getLastName()+" has completed "+TestData.getProgressReport().getAssessmentName()+" assessment "+TestData.getProgressReport().getCompletedAssessment()+" times in total. Date and raw score given below:\n");
		builder.append(System.getProperty("line.separator"));
		for (int i = 0;i < listOfProgressReportDetails.size(); i++) {
			progressReportDetails = listOfProgressReportDetails.get(i);
			builder.append("Date: "+progressReportDetails.getCompletedDate()+ ", Raw Score: "+progressReportDetails.getRawScore()+ " out of "+ progressReportDetails.getTotalQuestion());
			builder.append(System.getProperty("line.separator"));
		}
		builder.append("\n"+TestData.getProgressReport().getFirstName()+" "+TestData.getProgressReport().getLastName()+" got "+TestData.getProgressReport().getScoreDifferences()+" more correct in the recent completed assessment than the oldest");
		builder.append(System.getProperty("line.separator"));
		assertEquals(builder.toString(), ProgressReportPrinter.printProgressReport(TestData.getProgressReport()));
	}

}
