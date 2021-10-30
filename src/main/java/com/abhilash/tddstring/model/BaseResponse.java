package com.abhilash.tddstring.model;

/**Base response structure
 * @author abhilashgupta
 *
 */
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