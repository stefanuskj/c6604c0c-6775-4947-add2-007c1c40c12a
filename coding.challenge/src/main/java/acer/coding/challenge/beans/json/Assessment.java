/**
 * 
 */
package acer.coding.challenge.beans.json;

import java.util.List;



// Read assessment and questions -> AssessmentFileReader - (filename: string) => Assessment
// Assessment -> ID, Name, Questions
// Questions -> id, name strand, options etc
// StudentFileReader -> (studentId: string) => Student
// Student -> FirstName lastName + List<StudentResponse>

// StudentResponse
// - AssessmentId
// - Date completion etc


// DiagnosticReportGenerator => (Assessment, Student) => 

// DiagnosticReport
// List<{ strand: string, totalQuestion, rawScore)>
// Numeracy and Algebra: 5 out of 5 correct
// Measurement and Geometry: 7 out of 7 correct
// Statistics and Probability: 3 out of 4 correct  

/**
 * @author stefanuskj
 *
 */
public class Assessment {
	private String id;
	private String name;
	private List<AssessmentQuestion> questions;
	
	/**
	 * @return the _assessmentId
	 */
	public String getAssessmentId() {
		return id;
	}
	/**
	 * @param assessmentId the _assessmentId to set
	 */
	public void setAssessmentId(String assessmentId) {
		this.id = assessmentId;
	}
	/**
	 * @return the _assessmentName
	 */
	public String getAssessmentName() {
		return name;
	}
	/**
	 * @param assessmentName the _assessmentName to set
	 */
	public void set_assessmentName(String assessmentName) {
		this.name = assessmentName;
	}
	/**
	 * @return the _listOfQuestions
	 */
	public List<AssessmentQuestion> getListOfQuestions() {
		return questions;
	}
	/**
	 * @param listOfQuestions the _listOfQuestions to set
	 */
	public void setListOfQuestions(List<AssessmentQuestion> listOfQuestions) {
		this.questions = listOfQuestions;
	}
	@Override
	public String toString() {
		return "Assessment [_assessmentId=" + id + ", _assessmentName=" + name
				+ ", _listOfQuestions=" + questions + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((questions == null) ? 0 : questions.hashCode());
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
		Assessment other = (Assessment) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (questions == null) {
			if (other.questions != null)
				return false;
		} else if (!questions.equals(other.questions))
			return false;
		return true;
	}
	
	
	
	
	
}
