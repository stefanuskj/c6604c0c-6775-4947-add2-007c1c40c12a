/**
 * 
 */
package acer.coding.challenge.beans.json;

/**
 * @author stefanuskj
 *
 */
public class Response {
	private String questionId;
	private String response;
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
	 * @return the _response
	 */
	public String getResponse() {
		return response;
	}
	/**
	 * @param _response the _response to set
	 */
	public void setResponse(String response) {
		this.response = response;
	}
	@Override
	public String toString() {
		return "Response [_questionId=" + questionId + ", _response=" + response + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((questionId == null) ? 0 : questionId.hashCode());
		result = prime * result + ((response == null) ? 0 : response.hashCode());
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
		Response other = (Response) obj;
		if (questionId == null) {
			if (other.questionId != null)
				return false;
		} else if (!questionId.equals(other.questionId))
			return false;
		if (response == null) {
			if (other.response != null)
				return false;
		} else if (!response.equals(other.response))
			return false;
		return true;
	}
	
	
}
