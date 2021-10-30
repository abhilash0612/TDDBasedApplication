/**
 * 
 */
package com.abhilash.tddstring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.abhilash.tddstring.model.Request;
import com.abhilash.tddstring.model.Response;
import com.abhilash.tddstring.service.IStringService;



/**test class for StringController
 * @author abhilashgupta
 *
 */
@ExtendWith(SpringExtension.class)
@WebMvcTest
class StringControllerTest {

	@Autowired
	MockMvc mockMvc;

	@MockBean
	private IStringService stringService;


	@Test
	void patternMatchingController() throws Exception {

		Request request = new Request();
		request.setInput("AABAA");
		request.setPattern("AABA");
		Response response = new Response();
		response.setOutput("Pattern found at position 0.");
		Mockito.when(stringService.patternMatching(request)).thenReturn(response);
		mockMvc.perform(MockMvcRequestBuilders.put("/string/patternmatching")
				.contentType(MediaType.APPLICATION_JSON).content("{\n"
						+ "\"input\":\"AABAA\",\n"
						+ "\"pattern\":\"AABA\"\n"
						+ "}")
				)
		.andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
	void palindromeController() throws Exception {

		Request request = new Request();
		request.setInput("AABAA");
		Response response = new Response();
		response.setOutput("Input String AABAA is a Palindrome.");
		Mockito.when(stringService.patternMatching(request)).thenReturn(response);
		mockMvc.perform(MockMvcRequestBuilders.put("/string/palindrome")
				.contentType(MediaType.APPLICATION_JSON).content("{\n"
						+ "\"input\":\"AABAA\",\n"
						+ "}")
				)
		.andExpect(MockMvcResultMatchers.status().isOk());
	}
	

}
