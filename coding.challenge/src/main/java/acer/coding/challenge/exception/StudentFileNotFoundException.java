/**
 * 
 */
package acer.coding.challenge.exception;

import java.io.IOException;

/**
 * @author stefanuskj
 *
 */
public class StudentFileNotFoundException extends IOException {
	
	private static final long serialVersionUID = 1L;
	public StudentFileNotFoundException (String errorMessage) {
		super (errorMessage);
	}

}
