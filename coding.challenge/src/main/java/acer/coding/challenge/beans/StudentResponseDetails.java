/**
 * 
 */
package acer.coding.challenge.beans;

import java.util.List;

import acer.coding.challenge.beans.json.Student;
import acer.coding.challenge.beans.json.StudentResponse;

/**
 * @author stefanuskj
 *
 */
public class StudentResponseDetails {
	private Student student;
	private List<StudentResponse> listOfStudentResponses;
	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}
	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
	/**
	 * @return the listOfStudentResponse
	 */
	public List<StudentResponse> getListOfStudentResponses() {
		return listOfStudentResponses;
	}
	/**
	 * @param listOfStudentResponse the listOfStudentResponse to set
	 */
	public void setListOfStudentResponses(List<StudentResponse> listOfStudentResponses) {
		this.listOfStudentResponses = listOfStudentResponses;
	}
	@Override
	public String toString() {
		return "StudentResponseDetails [student=" + student + ", listOfStudentResponses=" + listOfStudentResponses + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listOfStudentResponses == null) ? 0 : listOfStudentResponses.hashCode());
		result = prime * result + ((student == null) ? 0 : student.hashCode());
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
		StudentResponseDetails other = (StudentResponseDetails) obj;
		if (listOfStudentResponses == null) {
			if (other.listOfStudentResponses != null)
				return false;
		} else if (!listOfStudentResponses.equals(other.listOfStudentResponses))
			return false;
		if (student == null) {
			if (other.student != null)
				return false;
		} else if (!student.equals(other.student))
			return false;
		return true;
	}
	
}
