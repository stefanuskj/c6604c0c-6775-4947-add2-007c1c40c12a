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
	private int _strandTotal;
	private List<String> _correctAnswer;
	private List<String> _wrongAnswer;
	
	public StrandDetails() {
		this._strandTotal = 0;
		this._correctAnswer = new ArrayList<String>();
		this._wrongAnswer = new ArrayList<String>();
	}
	
	/**
	 * @return the _strandTotal
	 */
	public int getStrandTotal() {
		return _strandTotal;
	}
	/**
	 * @param strandTotal the _strandTotal to set
	 */
	public void setStrandTotal(int strandTotal) {
		this._strandTotal = strandTotal;
	}
	/**
	 * @return the _correctAnswer
	 */
	public List<String> getCorrectAnswer() {
		return _correctAnswer;
	}
	/**
	 * @param correctAnswer the _correctAnswer to set
	 */
	public void setCorrectAnswer(List<String> correctAnswer) {
		this._correctAnswer = correctAnswer;
	}
	/**
	 * @return the _wrongAnswer
	 */
	public List<String> getWrongAnswer() {
		return _wrongAnswer;
	}
	/**
	 * @param wrongAnswer the _wrongAnswer to set
	 */
	public void setWrongAnswer(List<String> wrongAnswer) {
		this._wrongAnswer = wrongAnswer;
	}
	/**
	 * @param questionId the _correctAnswer to set
	 */
	public void addCorrectAnswer(String questionId) {
		this._correctAnswer.add(questionId);
	}
	/**
	 * @param questionId the _wrongAnswer to set
	 */
	public void addWrongAnswer(String questionId) {
		this._wrongAnswer.add(questionId);
	}
	@Override
	public String toString() {
		return "StrandDetails [_strandTotal=" + _strandTotal + ", _correctAnswer="
				+ _correctAnswer + ", _wrongAnswer=" + _wrongAnswer + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_correctAnswer == null) ? 0 : _correctAnswer.hashCode());
		result = prime * result + _strandTotal;
		result = prime * result + ((_wrongAnswer == null) ? 0 : _wrongAnswer.hashCode());
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
		if (_correctAnswer == null) {
			if (other._correctAnswer != null)
				return false;
		} else if (!_correctAnswer.equals(other._correctAnswer))
			return false;
		if (_strandTotal != other._strandTotal)
			return false;
		if (_wrongAnswer == null) {
			if (other._wrongAnswer != null)
				return false;
		} else if (!_wrongAnswer.equals(other._wrongAnswer))
			return false;
		return true;
	}
	
}
