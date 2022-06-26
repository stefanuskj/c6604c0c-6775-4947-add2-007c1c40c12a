package acer.coding.challenge.beans.report;

import java.util.List;

/**
 * @author stefanuskj
 *
 */
public class FeedbackReport {
	private String firstName;
	private String lastName;
	private String assessmentName;
	private String completedDate;
	private int rawScore;
	private int totalQuestion;
	private List<FeedbackReportDetails> listOfFeedbackReportDetails;
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the assessmentName
	 */
	public String getAssessmentName() {
		return assessmentName;
	}
	/**
	 * @param assessmentName the assessmentName to set
	 */
	public void setAssessmentName(String assessmentName) {
		this.assessmentName = assessmentName;
	}
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
	/**
	 * @return the listOfFeedbackReportDetails
	 */
	public List<FeedbackReportDetails> getListOfFeedbackReportDetails() {
		return listOfFeedbackReportDetails;
	}
	/**
	 * @param listOfFeedbackReportDetails the listOfFeedbackReportDetails to set
	 */
	public void setListOfFeedbackReportDetails(List<FeedbackReportDetails> listOfFeedbackReportDetails) {
		this.listOfFeedbackReportDetails = listOfFeedbackReportDetails;
	}
	@Override
	public String toString() {
		return "FeedbackReport [firstName=" + firstName + ", lastName=" + lastName + ", assessmentName="
				+ assessmentName + ", completedDate=" + completedDate + ", rawScore=" + rawScore + ", totalQuestion="
				+ totalQuestion + ", listOfFeedbackReportDetails=" + listOfFeedbackReportDetails + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assessmentName == null) ? 0 : assessmentName.hashCode());
		result = prime * result + ((completedDate == null) ? 0 : completedDate.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((listOfFeedbackReportDetails == null) ? 0 : listOfFeedbackReportDetails.hashCode());
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
		FeedbackReport other = (FeedbackReport) obj;
		if (assessmentName == null) {
			if (other.assessmentName != null)
				return false;
		} else if (!assessmentName.equals(other.assessmentName))
			return false;
		if (completedDate == null) {
			if (other.completedDate != null)
				return false;
		} else if (!completedDate.equals(other.completedDate))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (listOfFeedbackReportDetails == null) {
			if (other.listOfFeedbackReportDetails != null)
				return false;
		} else if (!listOfFeedbackReportDetails.equals(other.listOfFeedbackReportDetails))
			return false;
		if (rawScore != other.rawScore)
			return false;
		if (totalQuestion != other.totalQuestion)
			return false;
		return true;
	}
	
	
}
