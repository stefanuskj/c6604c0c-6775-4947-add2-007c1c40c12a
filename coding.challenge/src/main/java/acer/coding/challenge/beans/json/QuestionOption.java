/**
 * 
 */
package acer.coding.challenge.beans.json;

/**
 * @author stefanuskj
 *
 */
public class QuestionOption {
	private String id;
	private String label;
	private String value;
	
	/**
	 * @return the _optionId
	 */
	public String getOptionId() {
		return id;
	}
	/**
	 * @param optionId the _optionId to set
	 */
	public void setOptionId(String optionId) {
		this.id = optionId;
	}
	/**
	 * @return the _optionLabel
	 */
	public String getOptionLabel() {
		return label;
	}
	/**
	 * @param optionLabel the _optionLabel to set
	 */
	public void setOptionLabel(String optionLabel) {
		this.label = optionLabel;
	}
	/**
	 * @return the _optionValue
	 */
	public String getOptionValue() {
		return value;
	}
	/**
	 * @param optionValue the _optionValue to set
	 */
	public void setOptionValue(String optionValue) {
		this.value = optionValue;
	}
	@Override
	public String toString() {
		return "QuestionOption [_optionId=" + id + ", _optionLabel=" + label + ", _optionValue="
				+ value + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		QuestionOption other = (QuestionOption) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
	
}
