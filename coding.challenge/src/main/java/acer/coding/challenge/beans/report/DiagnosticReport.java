/**
 * 
 */
package acer.coding.challenge.beans.report;

import java.util.List;

import acer.coding.challenge.beans.StrandDetails;

/**
 * @author stefanuskj
 *
 */
public class DiagnosticReport {
	private String firstName;
	private String lastName;
	private String assessmentName;
	private String completedDate;
	private int rawScore;
	private int totalQuestion;
	private List<StrandDetails> listOfStrandDetails;
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
	 * @return the listOfStrandDetails
	 */
	public List<StrandDetails> getListOfStrandDetails() {
		return listOfStrandDetails;
	}
	/**
	 * @param listOfStrandDetails the listOfStrandDetails to set
	 */
	public void setListOfStrandDetails(List<StrandDetails> listOfStrandDetails) {
		this.listOfStrandDetails = listOfStrandDetails;
	}
	@Override
	public String toString() {
		return "DiagnosticReport [firstName=" + firstName + ", lastName=" + lastName + ", assessmentName="
				+ assessmentName + ", completedDate=" + completedDate + ", rawScore=" + rawScore + ", totalQuestion="
				+ totalQuestion + ", listOfStrandDetails=" + listOfStrandDetails + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assessmentName == null) ? 0 : assessmentName.hashCode());
		result = prime * result + ((completedDate == null) ? 0 : completedDate.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + rawScore;
		result = prime * result + ((listOfStrandDetails == null) ? 0 : listOfStrandDetails.hashCode());
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
		DiagnosticReport other = (DiagnosticReport) obj;
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
		if (rawScore != other.rawScore)
			return false;
		if (listOfStrandDetails == null) {
			if (other.listOfStrandDetails != null)
				return false;
		} else if (!listOfStrandDetails.equals(other.listOfStrandDetails))
			return false;
		if (totalQuestion != other.totalQuestion)
			return false;
		return true;
	}
	
}
