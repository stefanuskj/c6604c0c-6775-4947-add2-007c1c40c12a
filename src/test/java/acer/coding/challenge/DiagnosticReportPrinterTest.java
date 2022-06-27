package acer.coding.challenge.printer;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import acer.coding.challenge.TestData;
import acer.coding.challenge.beans.StrandDetails;

/**
 * @author stefanuskj
 *
 */

public class DiagnosticReportPrinterTest {

	@Test
	public void printDiagnosticReportTest_shouldReturnString() {
		StrandDetails strandDetails = new StrandDetails();
		List<StrandDetails> listOfStrandDetails = TestData.getDiagnosticReport().getListOfStrandDetails();
		StringBuilder builder = new StringBuilder();
		builder.append(TestData.getDiagnosticReport().getFirstName()+" "+TestData.getDiagnosticReport().getLastName()+" recently completed "+TestData.getDiagnosticReport().getAssessmentName()+" assessment on " + TestData.getDiagnosticReport().getCompletedDate());
		builder.append(System.getProperty("line.separator"));
		builder.append("He got "+ TestData.getDiagnosticReport().getRawScore() + " questions right out of "+ TestData.getDiagnosticReport().getTotalQuestion()+".  Details by strand given below:\n");	
		builder.append(System.getProperty("line.separator"));
		for (int i = 0;i < listOfStrandDetails.size(); i++) {
			strandDetails = listOfStrandDetails.get(i);
			builder.append(strandDetails.getStrandName() + ": "+strandDetails.getCorrectAnswer().size()+ " out of "+strandDetails.getStrandTotal() +" correct");
			builder.append(System.getProperty("line.separator"));
		}
		assertEquals(builder.toString(),DiagnosticReportPrinter.printDiagnosticReport(TestData.getDiagnosticReport()));
	}

}
