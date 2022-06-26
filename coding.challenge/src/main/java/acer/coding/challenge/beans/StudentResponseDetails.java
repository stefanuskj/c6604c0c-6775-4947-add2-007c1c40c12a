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
	private List<StudentResponse> listOfStudentResponse;
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
	public List<StudentResponse> getListOfStudentResponse() {
		return listOfStudentResponse;
	}
	/**
	 * @param listOfStudentResponse the listOfStudentResponse to set
	 */
	public void setListOfStudentResponse(List<StudentResponse> listOfStudentResponse) {
		this.listOfStudentResponse = listOfStudentResponse;
	}
	@Override
	public String toString() {
		return "StudentResponseDetails [student=" + student + ", listOfStudentResponse=" + listOfStudentResponse + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listOfStudentResponse == null) ? 0 : listOfStudentResponse.hashCode());
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
		if (listOfStudentResponse == null) {
			if (other.listOfStudentResponse != null)
				return false;
		} else if (!listOfStudentResponse.equals(other.listOfStudentResponse))
			return false;
		if (student == null) {
			if (other.student != null)
				return false;
		} else if (!student.equals(other.student))
			return false;
		return true;
	}
	
}
