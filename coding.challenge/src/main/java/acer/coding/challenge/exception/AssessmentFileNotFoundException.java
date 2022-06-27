/**
 * 
 */
package acer.coding.challenge.exception;

import java.io.IOException;

/**
 * @author stefanuskj
 *
 */
public class AssessmentFileNotFoundException extends IOException{

	private static final long serialVersionUID = 1L;
	public AssessmentFileNotFoundException (String errorMessage) {
		super (errorMessage);
	}

}
