/**
 * 
 */
package acer.coding.challenge.beans;

import java.util.List;

import acer.coding.challenge.beans.json.Assessment;
import acer.coding.challenge.beans.json.Question;

/**
 * @author stefanuskj
 *
 */
public class AssessmentDetails {
	private Assessment assessment;
	private List<Question> listOfQuestions;
	/**
	 * @return the assessment
	 */
	public Assessment getAssessment() {
		return assessment;
	}
	/**
	 * @param assessment the assessment to set
	 */
	public void setAssessment(Assessment assessment) {
		this.assessment = assessment;
	}
	/**
	 * @return the listOfQuestions
	 */
	public List<Question> getListOfQuestions() {
		return listOfQuestions;
	}
	/**
	 * @param listOfQuestions the listOfQuestions to set
	 */
	public void setListOfQuestions(List<Question> listOfQuestions) {
		this.listOfQuestions = listOfQuestions;
	}
	@Override
	public String toString() {
		return "AssessmentDetails [assessment=" + assessment + ", listOfQuestions=" + listOfQuestions + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assessment == null) ? 0 : assessment.hashCode());
		result = prime * result + ((listOfQuestions == null) ? 0 : listOfQuestions.hashCode());
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
		AssessmentDetails other = (AssessmentDetails) obj;
		if (assessment == null) {
			if (other.assessment != null)
				return false;
		} else if (!assessment.equals(other.assessment))
			return false;
		if (listOfQuestions == null) {
			if (other.listOfQuestions != null)
				return false;
		} else if (!listOfQuestions.equals(other.listOfQuestions))
			return false;
		return true;
	}
	
}
