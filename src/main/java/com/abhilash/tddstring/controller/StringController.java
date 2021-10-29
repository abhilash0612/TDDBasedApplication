/**
 * 
 */
package com.abhilash.tddstring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhilash.tddstring.model.Request;
import com.abhilash.tddstring.model.Response;
import com.abhilash.tddstring.service.IStringService;

/**Controller class contains endpoint for patternmatching and palindrome
 * @author abhilashgupta
 *
 */

@RestController
@RequestMapping("string")
public class StringController {

	@Autowired
	private IStringService stringService;

	/**
	 * endpoint for patternmatching API
	 * @param request- contains input and pattern string
	 * @return  output indexes where pattern is matched
	 * 
	 */

	@PostMapping(produces="application/json",
			consumes="application/json")
	@RequestMapping("/patternmatching")
	public ResponseEntity<Response> patternMatching(@RequestBody Request request){

		return new ResponseEntity<>(stringService.patternMatching(request), HttpStatus.OK);
	}
}
