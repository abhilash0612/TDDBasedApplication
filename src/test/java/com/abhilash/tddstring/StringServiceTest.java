/**
 * 
 */
package com.abhilash.tddstring;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import com.abhilash.tddstring.model.Request;
import com.abhilash.tddstring.model.Response;
import com.abhilash.tddstring.utility.Utility;


/**
 * @author abhilashgupta
 *
 */
public class StringServiceTest {





	@Test
	void patternMatching() {
		Request request = new Request();
		request.setInput("AABAA");
		request.setPattern("AABA");
		String input = request.getInput();
		String pattern = request.getPattern();	
		List<Integer> index = new ArrayList<>();
		index.add(0);	
		MockedStatic<Utility> utilities = Mockito.mockStatic(Utility.class);
		utilities.when(() -> Utility.isPatternMatching(input, pattern)).thenReturn(index);
		assertNotNull(index);
	}

	@Test
	void isPatternMatchchingLogic() {
		fail("Need to implemented");
	}

}





