/**
 * 
 */
package acer.coding.challenge.beans.report;

import java.util.List;

/**
 * @author stefanuskj
 *
 */
public class ProgressReport {
	private String firstName;
	private String lastName;
	private String assessmentName;
	private int completedAssessment;
	private List<ProgressReportDetails> listOfProgressReportDetails;
	private int scoreDifferences;
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
	 * @return the completedAssessment
	 */
	public int getCompletedAssessment() {
		return completedAssessment;
	}
	/**
	 * @param completedAssessment the completedAssessment to set
	 */
	public void setCompletedAssessment(int completedAssessment) {
		this.completedAssessment = completedAssessment;
	}
	/**
	 * @return the listOfProgressReportDetails
	 */
	public List<ProgressReportDetails> getListOfProgressReportDetails() {
		return listOfProgressReportDetails;
	}
	/**
	 * @param listOfProgressReportDetails the listOfProgressReportDetails to set
	 */
	public void setListOfProgressReportDetails(List<ProgressReportDetails> listOfProgressReportDetails) {
		this.listOfProgressReportDetails = listOfProgressReportDetails;
	}
	/**
	 * @return the scoreDifferences
	 */
	public int getScoreDifferences() {
		return scoreDifferences;
	}
	/**
	 * @param scoreDifferences the scoreDifferences to set
	 */
	public void setScoreDifferences(int scoreDifferences) {
		this.scoreDifferences = scoreDifferences;
	}
	@Override
	public String toString() {
		return "ProgressReport [firstName=" + firstName + ", lastName=" + lastName + ", assessmentName="
				+ assessmentName + ", listOfProgressReportDetails=" + listOfProgressReportDetails
				+ ", scoreDifferences=" + scoreDifferences + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assessmentName == null) ? 0 : assessmentName.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + completedAssessment;
		result = prime * result + ((listOfProgressReportDetails == null) ? 0 : listOfProgressReportDetails.hashCode());
		result = prime * result + scoreDifferences;
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
		ProgressReport other = (ProgressReport) obj;
		if (assessmentName == null) {
			if (other.assessmentName != null)
				return false;
		} else if (!assessmentName.equals(other.assessmentName))
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
		if (completedAssessment != other.completedAssessment)
			return false;
		if (listOfProgressReportDetails == null) {
			if (other.listOfProgressReportDetails != null)
				return false;
		} else if (!listOfProgressReportDetails.equals(other.listOfProgressReportDetails))
			return false;
		if (scoreDifferences != other.scoreDifferences)
			return false;
		return true;
	}
	
}
