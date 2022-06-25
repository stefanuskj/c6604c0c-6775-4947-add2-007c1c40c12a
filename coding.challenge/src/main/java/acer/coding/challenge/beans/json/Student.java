/**
 * 
 */
package acer.coding.challenge.beans.json;

/**
 * @author stefanuskj
 *
 */
public class Student {
	private String id;
	private String firstName;
	private String lastName;
	private int yearLevel;
	
	/**
	 * @return the _studentId
	 */
	public String getStudentId() {
		return id;
	}
	/**
	 * @param studentId the _studentId to set
	 */
	public void setStudentId(String studentId) {
		this.id = studentId;
	}
	/**
	 * @return the _firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the _firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the _lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the _lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the _yearLevel
	 */
	public int getYearLevel() {
		return yearLevel;
	}
	/**
	 * @param yearLevel the _yearLevel to set
	 */
	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}
	@Override
	public String toString() {
		return "Student [_studentId=" + id + ", _firstName=" + firstName + ", _lastName=" + lastName
				+ ", _yearLevel=" + yearLevel + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + yearLevel;
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
		Student other = (Student) obj;
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (yearLevel != other.yearLevel)
			return false;
		return true;
	}
	
	
}
