/**
 * 
 */
package acer.coding.challenge.beans.json;

/**
 * @author stefanuskj
 *
 */
public class AssessmentQuestion {
	private String questionId;
	private int position;
	/**
	 * @return the _questionId
	 */
	public String getQuestionId() {
		return questionId;
	}
	/**
	 * @param _questionId the _questionId to set
	 */
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	/**
	 * @return the _position
	 */
	public int getPosition() {
		return position;
	}
	/**
	 * @param _position the _position to set
	 */
	public void setPosition(int position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "AssessmentQuestion [_questionId=" + questionId + ", _position=" + position + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + position;
		result = prime * result + ((questionId == null) ? 0 : questionId.hashCode());
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
		AssessmentQuestion other = (AssessmentQuestion) obj;
		if (position != other.position)
			return false;
		if (questionId == null) {
			if (other.questionId != null)
				return false;
		} else if (!questionId.equals(other.questionId))
			return false;
		return true;
	}
	
	
}
