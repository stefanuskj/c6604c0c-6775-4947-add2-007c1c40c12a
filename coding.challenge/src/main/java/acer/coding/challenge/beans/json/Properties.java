/**
 * 
 */
package acer.coding.challenge.beans.json;

/**
 * @author stefanuskj
 *
 */
public class Properties {
	private String _studentDataFilePath;
	private String _assessmentDataFilePath;
	private String _questionDataFilePath;
	private String _studentResponseDataFilePath;
	/**
	 * @return the _studentDataFilePath
	 */
	public String getStudentDataFilePath() {
		return _studentDataFilePath;
	}
	/**
	 * @param studentDataFilePath the _studentDataFilePath to set
	 */
	public void setStudentDataFilePath(String studentDataFilePath) {
		this._studentDataFilePath = studentDataFilePath;
	}
	/**
	 * @return the _assessmentDataFilePath
	 */
	public String getAssessmentDataFilePath() {
		return _assessmentDataFilePath;
	}
	/**
	 * @param assessmentDataFilePath the _assessmentDataFilePath to set
	 */
	public void setAssessmentDataFilePath(String assessmentDataFilePath) {
		this._assessmentDataFilePath = assessmentDataFilePath;
	}
	/**
	 * @return the _questionDataFilePath
	 */
	public String getQuestionDataFilePath() {
		return _questionDataFilePath;
	}
	/**
	 * @param questionDataFilePath the _questionDataFilePath to set
	 */
	public void setQuestionDataFilePath(String questionDataFilePath) {
		this._questionDataFilePath = questionDataFilePath;
	}
	/**
	 * @return the _studentResponseDataFilePath
	 */
	public String getStudentResponseDataFilePath() {
		return _studentResponseDataFilePath;
	}
	/**
	 * @param studentResponseDataFilePath the _studentResponseDataFilePath to set
	 */
	public void setStudentResponseDataFilePath(String studentResponseDataFilePath) {
		this._studentResponseDataFilePath = studentResponseDataFilePath;
	}
	@Override
	public String toString() {
		return "Properties [_studentDataFilePath=" + _studentDataFilePath + ", _assessmentDataFilePath="
				+ _assessmentDataFilePath + ", _questionDataFilePath=" + _questionDataFilePath
				+ ", _studentResponseDataFilePath=" + _studentResponseDataFilePath + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_assessmentDataFilePath == null) ? 0 : _assessmentDataFilePath.hashCode());
		result = prime * result + ((_questionDataFilePath == null) ? 0 : _questionDataFilePath.hashCode());
		result = prime * result + ((_studentDataFilePath == null) ? 0 : _studentDataFilePath.hashCode());
		result = prime * result
				+ ((_studentResponseDataFilePath == null) ? 0 : _studentResponseDataFilePath.hashCode());
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
		Properties other = (Properties) obj;
		if (_assessmentDataFilePath == null) {
			if (other._assessmentDataFilePath != null)
				return false;
		} else if (!_assessmentDataFilePath.equals(other._assessmentDataFilePath))
			return false;
		if (_questionDataFilePath == null) {
			if (other._questionDataFilePath != null)
				return false;
		} else if (!_questionDataFilePath.equals(other._questionDataFilePath))
			return false;
		if (_studentDataFilePath == null) {
			if (other._studentDataFilePath != null)
				return false;
		} else if (!_studentDataFilePath.equals(other._studentDataFilePath))
			return false;
		if (_studentResponseDataFilePath == null) {
			if (other._studentResponseDataFilePath != null)
				return false;
		} else if (!_studentResponseDataFilePath.equals(other._studentResponseDataFilePath))
			return false;
		return true;
	}
	
}
