/**
 * 
 */
package acer.coding.challenge.beans.json;

/**
 * @author stefanuskj
 *
 */
public class ResponseResult {
	private int rawScore;

	/**
	 * @return the _rawScore
	 */
	public int getRawScore() {
		return rawScore;
	}

	/**
	 * @param _rawScore the _rawScore to set
	 */
	public void setRawScore(int rawScore) {
		this.rawScore = rawScore;
	}

	@Override
	public String toString() {
		return "ResponseResult [_rawScore=" + rawScore + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rawScore;
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
		ResponseResult other = (ResponseResult) obj;
		if (rawScore != other.rawScore)
			return false;
		return true;
	}
	
	
	
}
