/**
 * 
 */
package acer.coding.challenge.beans.report;

/**
 * @author stefanuskj
 *
 */
public class FeedbackReportDetails {
	private String question;
	private String studentAnswerLabel;
	private String studentAnswerValue;
	private String correctAnswerLabel;
	private String correctAnswerValue;
	private String questionHint;
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	/**
	 * @return the studentAnswerLabel
	 */
	public String getStudentAnswerLabel() {
		return studentAnswerLabel;
	}
	/**
	 * @param studentAnswerLabel the studentAnswerLabel to set
	 */
	public void setStudentAnswerLabel(String studentAnswerLabel) {
		this.studentAnswerLabel = studentAnswerLabel;
	}
	/**
	 * @return the studentAnswerValue
	 */
	public String getStudentAnswerValue() {
		return studentAnswerValue;
	}
	/**
	 * @param studentAnswerValue the studentAnswerValue to set
	 */
	public void setStudentAnswerValue(String studentAnswerValue) {
		this.studentAnswerValue = studentAnswerValue;
	}
	/**
	 * @return the correctAnswerLabel
	 */
	public String getCorrectAnswerLabel() {
		return correctAnswerLabel;
	}
	/**
	 * @param correctAnswerLabel the correctAnswerLabel to set
	 */
	public void setCorrectAnswerLabel(String correctAnswerLabel) {
		this.correctAnswerLabel = correctAnswerLabel;
	}
	/**
	 * @return the correctAnswerValue
	 */
	public String getCorrectAnswerValue() {
		return correctAnswerValue;
	}
	/**
	 * @param correctAnswerValue the correctAnswerValue to set
	 */
	public void setCorrectAnswerValue(String correctAnswerValue) {
		this.correctAnswerValue = correctAnswerValue;
	}
	/**
	 * @return the questionHint
	 */
	public String getQuestionHint() {
		return questionHint;
	}
	/**
	 * @param questionHint the questionHint to set
	 */
	public void setQuestionHint(String questionHint) {
		this.questionHint = questionHint;
	}
	@Override
	public String toString() {
		return "FeedbackReportDetails [question=" + question + ", studentAnswerLabel=" + studentAnswerLabel
				+ ", studentAnswerValue=" + studentAnswerValue + ", correctAnswerLabel=" + correctAnswerLabel
				+ ", correctAnswerValue=" + correctAnswerValue + ", questionHint=" + questionHint + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((correctAnswerLabel == null) ? 0 : correctAnswerLabel.hashCode());
		result = prime * result + ((correctAnswerValue == null) ? 0 : correctAnswerValue.hashCode());
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		result = prime * result + ((questionHint == null) ? 0 : questionHint.hashCode());
		result = prime * result + ((studentAnswerLabel == null) ? 0 : studentAnswerLabel.hashCode());
		result = prime * result + ((studentAnswerValue == null) ? 0 : studentAnswerValue.hashCode());
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
		FeedbackReportDetails other = (FeedbackReportDetails) obj;
		if (correctAnswerLabel == null) {
			if (other.correctAnswerLabel != null)
				return false;
		} else if (!correctAnswerLabel.equals(other.correctAnswerLabel))
			return false;
		if (correctAnswerValue == null) {
			if (other.correctAnswerValue != null)
				return false;
		} else if (!correctAnswerValue.equals(other.correctAnswerValue))
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		if (questionHint == null) {
			if (other.questionHint != null)
				return false;
		} else if (!questionHint.equals(other.questionHint))
			return false;
		if (studentAnswerLabel == null) {
			if (other.studentAnswerLabel != null)
				return false;
		} else if (!studentAnswerLabel.equals(other.studentAnswerLabel))
			return false;
		if (studentAnswerValue == null) {
			if (other.studentAnswerValue != null)
				return false;
		} else if (!studentAnswerValue.equals(other.studentAnswerValue))
			return false;
		return true;
	}
	
	
}
