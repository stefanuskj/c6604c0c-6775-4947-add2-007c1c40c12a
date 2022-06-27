/**
 * 
 */
package acer.coding.challenge.beans.json;

import java.util.List;

/**
 * @author stefanuskj
 *
 */
public class QuestionConfig {
	private List<QuestionOption> options;
	private String key;
	private String hint;
	
	/**
	 * @return the _listOfOptions
	 */
	public List<QuestionOption> getListOfOptions() {
		return options;
	}
	/**
	 * @param listOfOptions the _listOfOptions to set
	 */
	public void setListOfOptions(List<QuestionOption> listOfOptions) {
		this.options = listOfOptions;
	}
	/**
	 * @return the _questionKey
	 */
	public String getQuestionKey() {
		return key;
	}
	/**
	 * @param questionKey the _questionKey to set
	 */
	public void setQuestionKey(String questionKey) {
		this.key = questionKey;
	}
	/**
	 * @return the _questionHint
	 */
	public String getQuestionHint() {
		return hint;
	}
	/**
	 * @param questionHint the _questionHint to set
	 */
	public void setQuestionHint(String questionHint) {
		this.hint = questionHint;
	}
	@Override
	public String toString() {
		return "QuestionConfig [_options=" + options + ", _questionKey=" + key + ", _questionHint="
				+ hint + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((options == null) ? 0 : options.hashCode());
		result = prime * result + ((hint == null) ? 0 : hint.hashCode());
		result = prime * result + ((key == null) ? 0 : key.hashCode());
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
		QuestionConfig other = (QuestionConfig) obj;
		if (options == null) {
			if (other.options != null)
				return false;
		} else if (!options.equals(other.options))
			return false;
		if (hint == null) {
			if (other.hint != null)
				return false;
		} else if (!hint.equals(other.hint))
			return false;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}
	
	
	
	
}
