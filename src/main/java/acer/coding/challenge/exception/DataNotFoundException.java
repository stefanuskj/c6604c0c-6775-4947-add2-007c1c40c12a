/**
 * 
 */
package acer.coding.challenge.exception;

/**
 * @author stefanuskj
 *
 */
public class DataNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;
	public DataNotFoundException (String errorMessage) {
		super(errorMessage);
	}
}
