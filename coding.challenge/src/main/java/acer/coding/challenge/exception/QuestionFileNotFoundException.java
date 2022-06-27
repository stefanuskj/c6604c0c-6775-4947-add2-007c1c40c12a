/**
 * 
 */
package acer.coding.challenge.exception;

import java.io.IOException;

/**
 * @author stefanuskj
 *
 */
public class QuestionFileNotFoundException extends IOException {
	
	private static final long serialVersionUID = 1L;
	public QuestionFileNotFoundException (String errorMessage) {
		super (errorMessage);
	}

}
