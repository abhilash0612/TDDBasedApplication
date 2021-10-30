package com.abhilash.tddstring.utility;

public enum ErrorCodes {
	
	 
	ERR_500("something.wrong"),
	ERR_001("no.input"),
	ERR_002("no.pattern");
	

	private String message;
	
	
	private ErrorCodes(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
