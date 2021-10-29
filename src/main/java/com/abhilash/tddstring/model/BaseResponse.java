package com.abhilash.tddstring.model;

public class BaseResponse {
	
	private ErrorResponse errors;

	public BaseResponse(){
	}

	public ErrorResponse getErrors() {
		return errors;
	}

	public void setErrors(ErrorResponse errors) {
		this.errors = errors;
	}
	
	
	
}