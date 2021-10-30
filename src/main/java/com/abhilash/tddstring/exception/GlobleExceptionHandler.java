/**
 * 
 */
package com.abhilash.tddstring.exception;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.abhilash.tddstring.model.ErrorResponse;
import com.abhilash.tddstring.model.Response;
import com.abhilash.tddstring.utility.ErrorCodes;

/**Global Exception handler for all user defined functions
 * @author abhilashgupta
 *
 */

@ControllerAdvice
public class GlobleExceptionHandler {

	@Autowired
	private MessageSource messageSource;

	/**handler for empty input exception
	 *  
	 *
	 */
	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<Response> handleEmptyInputException(EmptyInputException emptyUserIDException){		

		Response res = new Response();
		res.setErrors(new ErrorResponse(emptyUserIDException.getErrorCode(),messageSource.getMessage(emptyUserIDException.getErrorCode().getMessage(),null,Locale.ENGLISH)));	
		return new ResponseEntity<>( res,HttpStatus.BAD_REQUEST);			
	}

	/**handler for any generic exception
	 *  
	 *
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Response>  handleGenericException(Exception genericException){

		Response res = new Response();
		res.setErrors(new ErrorResponse(ErrorCodes.ERR_500,messageSource.getMessage(ErrorCodes.ERR_500.getMessage(),null,Locale.ENGLISH)));	
		return new ResponseEntity<>( res,HttpStatus.INTERNAL_SERVER_ERROR);	

	}



}
