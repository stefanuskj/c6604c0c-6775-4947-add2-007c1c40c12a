/**
 * 
 */
package acer.coding.challenge.beans.report;

/**
 * @author stefanuskj
 *
 */
public class ProgressReportDetails {
	private String completedDate;
	private int rawScore;
	private int totalQuestion;
	/**
	 * @return the completedDate
	 */
	public String getCompletedDate() {
		return completedDate;
	}
	/**
	 * @param completedDate the completedDate to set
	 */
	public void setCompletedDate(String completedDate) {
		this.completedDate = completedDate;
	}
	/**
	 * @return the rawScore
	 */
	public int getRawScore() {
		return rawScore;
	}
	/**
	 * @param rawScore the rawScore to set
	 */
	public void setRawScore(int rawScore) {
		this.rawScore = rawScore;
	}
	/**
	 * @return the totalQuestion
	 */
	public int getTotalQuestion() {
		return totalQuestion;
	}
	/**
	 * @param totalQuestion the totalQuestion to set
	 */
	public void setTotalQuestion(int totalQuestion) {
		this.totalQuestion = totalQuestion;
	}
	@Override
	public String toString() {
		return "ProgressReportDetails [completedDate=" + completedDate + ", rawScore=" + rawScore + ", totalQuestion="
				+ totalQuestion + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((completedDate == null) ? 0 : completedDate.hashCode());
		result = prime * result + rawScore;
		result = prime * result + totalQuestion;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProgressReportDetails other = (ProgressReportDetails) obj;
		if (completedDate == null) {
			if (other.completedDate != null)
				return false;
		} else if (!completedDate.equals(other.completedDate))
			return false;
		if (rawScore != other.rawScore)
			return false;
		if (totalQuestion != other.totalQuestion)
			return false;
		return true;
	}
	
}
