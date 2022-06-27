/**
 * 
 */
package acer.coding.challenge.beans.json;

import java.util.List;

/**
 * @author stefanuskj
 *
 */
public class StudentResponse {
	private String id;
	private String assessmentId;
	private String assigned;
	private String started;
	private String completed;
	private Student student;
	private List<Response> responses;
	private ResponseResult results;
	/**
	 * @return the _studentResponseId
	 */
	public String getStudentResponseId() {
		return id;
	}
	/**
	 * @param studentResponseId the _studentResponseId to set
	 */
	public void setStudentResponseId(String studentResponseId) {
		this.id = studentResponseId;
	}
	/**
	 * @return the _assessmentId
	 */
	public String getAssessmentId() {
		return assessmentId;
	}
	/**
	 * @param assessmentId the _assessmentId to set
	 */
	public void setAssessmentId(String assessmentId) {
		this.assessmentId = assessmentId;
	}
	/**
	 * @return the _assigned
	 */
	public String getAssigned() {
		return assigned;
	}
	/**
	 * @param assigned the _assigned to set
	 */
	public void setAssigned(String assigned) {
		this.assigned = assigned;
	}
	/**
	 * @return the _started
	 */
	public String getStarted() {
		return started;
	}
	/**
	 * @param started the _started to set
	 */
	public void setStarted(String started) {
		this.started = started;
	}
	/**
	 * @return the _completed
	 */
	public String getCompleted() {
		return completed;
	}
	/**
	 * @param completed the _completed to set
	 */
	public void setCompleted(String completed) {
		this.completed = completed;
	}
	/**
	 * @return the _student
	 */
	public Student getStudent() {
		return student;
	}
	/**
	 * @param student the _student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
	/**
	 * @return the _listOfResponses
	 */
	public List<Response> getListOfResponses() {
		return responses;
	}
	/**
	 * @param listOfResponses the _listOfResponses to set
	 */
	public void setListOfResponses(List<Response> listOfResponses) {
		this.responses = listOfResponses;
	}
	/**
	 * @return the _responseResult
	 */
	public ResponseResult getResponseResult() {
		return results;
	}
	/**
	 * @param responseResult the _responseResult to set
	 */
	public void setResponseResult(ResponseResult responseResult) {
		this.results = responseResult;
	}
	@Override
	public String toString() {
		return "StudentResponse [_studentResponseId=" + id + ", _assessmentId=" + assessmentId
				+ ", _assigned=" + assigned + ", _started=" + started + ", _completed=" + completed + ", _student="
				+ student + ", _listOfResponses=" + responses + ", _responseResult=" + results + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assessmentId == null) ? 0 : assessmentId.hashCode());
		result = prime * result + ((assigned == null) ? 0 : assigned.hashCode());
		result = prime * result + ((completed == null) ? 0 : completed.hashCode());
		result = prime * result + ((responses == null) ? 0 : responses.hashCode());
		result = prime * result + ((this.results == null) ? 0 : this.results.hashCode());
		result = prime * result + ((started == null) ? 0 : started.hashCode());
		result = prime * result + ((student == null) ? 0 : student.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		StudentResponse other = (StudentResponse) obj;
		if (assessmentId == null) {
			if (other.assessmentId != null)
				return false;
		} else if (!assessmentId.equals(other.assessmentId))
			return false;
		if (assigned == null) {
			if (other.assigned != null)
				return false;
		} else if (!assigned.equals(other.assigned))
			return false;
		if (completed == null) {
			if (other.completed != null)
				return false;
		} else if (!completed.equals(other.completed))
			return false;
		if (responses == null) {
			if (other.responses != null)
				return false;
		} else if (!responses.equals(other.responses))
			return false;
		if (results == null) {
			if (other.results != null)
				return false;
		} else if (!results.equals(other.results))
			return false;
		if (started == null) {
			if (other.started != null)
				return false;
		} else if (!started.equals(other.started))
			return false;
		if (student == null) {
			if (other.student != null)
				return false;
		} else if (!student.equals(other.student))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
