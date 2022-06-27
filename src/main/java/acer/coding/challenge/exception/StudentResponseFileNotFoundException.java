/**
 * 
 */
package acer.coding.challenge.exception;

import java.io.IOException;

/**
 * @author stefanuskj
 *
 */
public class StudentResponseFileNotFoundException extends IOException {

	private static final long serialVersionUID = 1L;
	public StudentResponseFileNotFoundException (String errorMessage) {
		super (errorMessage);
	}
}
