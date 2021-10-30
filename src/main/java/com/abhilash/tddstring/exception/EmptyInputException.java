/**
 * 
 */
package com.abhilash.tddstring.exception;

import com.abhilash.tddstring.utility.ErrorCodes;

/**
 * @author abhilashgupta
 *
 */
public class EmptyInputException extends RuntimeException {
	

	private static final long serialVersionUID = 1L;

	private ErrorCodes errorCode;
	
	public EmptyInputException(ErrorCodes errorCode) {
		this.errorCode = errorCode;
	}

	public ErrorCodes getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(ErrorCodes errorCode) {
		this.errorCode = errorCode;
	}


	 
	
	

}
