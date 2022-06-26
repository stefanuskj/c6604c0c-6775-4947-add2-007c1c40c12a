/**
 * 
 */
package acer.coding.challenge.beans.report;

/**
 * @author stefanuskj
 *
 */
public class Report {
	private DiagnosticReport diagnosticReport;
	private FeedbackReport feedbackReport;
	private ProgressReport progressReport;
	/**
	 * @return the diagnosticReport
	 */
	public DiagnosticReport getDiagnosticReport() {
		return diagnosticReport;
	}
	/**
	 * @param diagnosticReport the diagnosticReport to set
	 */
	public void setDiagnosticReport(DiagnosticReport diagnosticReport) {
		this.diagnosticReport = diagnosticReport;
	}
	/**
	 * @return the feedbackReport
	 */
	public FeedbackReport getFeedbackReport() {
		return feedbackReport;
	}
	/**
	 * @param feedbackReport the feedbackReport to set
	 */
	public void setFeedbackReport(FeedbackReport feedbackReport) {
		this.feedbackReport = feedbackReport;
	}
	/**
	 * @return the progressReport
	 */
	public ProgressReport getProgressReport() {
		return progressReport;
	}
	/**
	 * @param progressReport the progressReport to set
	 */
	public void setProgressReport(ProgressReport progressReport) {
		this.progressReport = progressReport;
	}
	
}
