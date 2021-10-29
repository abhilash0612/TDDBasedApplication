/**
 * 
 */
package com.abhilash.tddstring.model;

import com.abhilash.tddstring.utility.ErrorCodes;

/**
 * @author abhilashgupta
 *
 */
public class ErrorResponse{
	
	private ErrorCodes errorCode;
	private String errorMsg;
	
	
	
	public ErrorResponse(ErrorCodes errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public ErrorCodes getErrorCode() {
		return errorCode;
	}
	
	public void setErrorCode(ErrorCodes code) {
		this.errorCode=code;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}