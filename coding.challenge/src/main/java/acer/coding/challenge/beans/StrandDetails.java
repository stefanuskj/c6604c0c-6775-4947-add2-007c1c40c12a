/**
 * 
 */
package acer.coding.challenge.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author stefanuskj
 *
 */
public class StrandDetails {
	private String strandName;
	private int strandTotal;
	private List<String> correctAnswer;
	private List<String> wrongAnswer;
	
	public StrandDetails() {
		this.setStrandName("");
		this.strandTotal = 0;
		this.correctAnswer = new ArrayList<String>();
		this.wrongAnswer = new ArrayList<String>();
	}
	/**
	 * @return the strandName
	 */
	public String getStrandName() {
		return strandName;
	}

	/**
	 * @param strandName the strandName to set
	 */
	public void setStrandName(String strandName) {
		this.strandName = strandName;
	}
	/**
	 * @return the strandTotal
	 */
	public int getStrandTotal() {
		return strandTotal;
	}
	/**
	 * @param strandTotal the strandTotal to set
	 */
	public void setStrandTotal(int strandTotal) {
		this.strandTotal = strandTotal;
	}
	/**
	 * @return the correctAnswer
	 */
	public List<String> getCorrectAnswer() {
		return correctAnswer;
	}
	/**
	 * @param correctAnswer the correctAnswer to set
	 */
	public void setCorrectAnswer(List<String> correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	/**
	 * @return the wrongAnswer
	 */
	public List<String> getWrongAnswer() {
		return wrongAnswer;
	}
	/**
	 * @param wrongAnswer the wrongAnswer to set
	 */
	public void setWrongAnswer(List<String> wrongAnswer) {
		this.wrongAnswer = wrongAnswer;
	}
	/**
	 * @param questionId the correctAnswer to set
	 */
	public void addCorrectAnswer(String questionId) {
		this.correctAnswer.add(questionId);
	}
	/**
	 * @param questionId the wrongAnswer to set
	 */
	public void addWrongAnswer(String questionId) {
		this.wrongAnswer.add(questionId);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((correctAnswer == null) ? 0 : correctAnswer.hashCode());
		result = prime * result + ((strandName == null) ? 0 : strandName.hashCode());
		result = prime * result + strandTotal;
		result = prime * result + ((wrongAnswer == null) ? 0 : wrongAnswer.hashCode());
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
		StrandDetails other = (StrandDetails) obj;
		if (correctAnswer == null) {
			if (other.correctAnswer != null)
				return false;
		} else if (!correctAnswer.equals(other.correctAnswer))
			return false;
		if (strandName == null) {
			if (other.strandName != null)
				return false;
		} else if (!strandName.equals(other.strandName))
			return false;
		if (strandTotal != other.strandTotal)
			return false;
		if (wrongAnswer == null) {
			if (other.wrongAnswer != null)
				return false;
		} else if (!wrongAnswer.equals(other.wrongAnswer))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "StrandDetails [strandName=" + strandName + ", strandTotal=" + strandTotal + ", correctAnswer="
				+ correctAnswer + ", wrongAnswer=" + wrongAnswer + "]";
	}
	
	
}
