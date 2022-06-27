/**
 * 
 */
package acer.coding.challenge.beans.json;

/**
 * @author stefanuskj
 *
 */
public class Question {
	private String id;
	private String stem;
	private String type;
	private String strand;
	private QuestionConfig config;
	
	/**
	 * @return the _questionId
	 */
	public String getQuestionId() {
		return id;
	}
	/**
	 * @param questionId the _questionId to set
	 */
	public void setQuestionId(String questionId) {
		this.id = questionId;
	}
	/**
	 * @return the _stem
	 */
	public String getStem() {
		return stem;
	}
	/**
	 * @param stem the _stem to set
	 */
	public void setStem(String stem) {
		this.stem = stem;
	}
	/**
	 * @return the _questionType
	 */
	public String getQuestionType() {
		return type;
	}
	/**
	 * @param questionType the _questionType to set
	 */
	public void setQuestionType(String questionType) {
		this.type = questionType;
	}
	/**
	 * @return the _strand
	 */
	public String getStrand() {
		return strand;
	}
	/**
	 * @param strand the _strand to set
	 */
	public void setStrand(String strand) {
		this.strand = strand;
	}
	/**
	 * @return the _questionConfig
	 */
	public QuestionConfig getQuestionConfig() {
		return config;
	}
	/**
	 * @param questionConfig the _questionConfig to set
	 */
	public void setQuestionConfig(QuestionConfig questionConfig) {
		this.config = questionConfig;
	}
	@Override
	public String toString() {
		return "Question [_questionId=" + id + ", _stem=" + stem + ", _questionType=" + type
				+ ", _strand=" + strand + ", _questionConfig=" + config + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((config == null) ? 0 : config.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((stem == null) ? 0 : stem.hashCode());
		result = prime * result + ((strand == null) ? 0 : strand.hashCode());
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
		Question other = (Question) obj;
		if (config == null) {
			if (other.config != null)
				return false;
		} else if (!config.equals(other.config))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (stem == null) {
			if (other.stem != null)
				return false;
		} else if (!stem.equals(other.stem))
			return false;
		if (strand == null) {
			if (other.strand != null)
				return false;
		} else if (!strand.equals(other.strand))
			return false;
		return true;
	}
	
	
}
