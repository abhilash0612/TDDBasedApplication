/**
 * 
 */
package com.abhilash.tddstring.service.impl;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.abhilash.tddstring.exception.EmptyInputException;
import com.abhilash.tddstring.model.Request;
import com.abhilash.tddstring.model.Response;
import com.abhilash.tddstring.service.IStringService;
import com.abhilash.tddstring.utility.ErrorCodes;
import com.abhilash.tddstring.utility.Utility;

 

/**
 * @author abhilashgupta
 *
 */

@Service
public class StringService implements IStringService{
	
	@Autowired
	private MessageSource messageSource;
	
	
	@Override
	public Response patternMatching(Request request) {
		Response res;
		String input;
		List<Integer> index; 
		input = request.getInput();
		if(input.length()==0)
			throw new EmptyInputException(ErrorCodes.ERR_001);
		String pattern = request.getPattern();	
		//checking and handling  pattern string is empty or not as a user defined exception
		if(pattern.length()==0)
			throw new EmptyInputException(ErrorCodes.ERR_002);
		index = Utility.isPatternMatching(input,pattern);
		res = new Response();
		if(index.isEmpty()) {
			res.setOutput(messageSource.getMessage("pattern.not.exist",new Object[] {input},Locale.ENGLISH));
		}else {		  
			res.setOutput(messageSource.getMessage("pattern.exist",new Object[] {input,index},Locale.ENGLISH));
		}		
		return res;
	}


	@Override
	public Response palindrome(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

}
