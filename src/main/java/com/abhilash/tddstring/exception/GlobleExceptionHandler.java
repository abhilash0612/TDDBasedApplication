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

/**
 * @author abhilashgupta
 *
 */

@ControllerAdvice
public class GlobleExceptionHandler {
	
	@Autowired
	private MessageSource messageSource;
	
	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<Response> handleEmptyMovieIDException(EmptyInputException emptyUserIDException){		
		
		Response res = new Response();
		res.setErrors(new ErrorResponse(emptyUserIDException.getErrorCode(),messageSource.getMessage(emptyUserIDException.getErrorCode().getMessage(),null,Locale.ENGLISH)));	
		return new ResponseEntity<>( res,HttpStatus.BAD_REQUEST);			
	}
	
	

}
