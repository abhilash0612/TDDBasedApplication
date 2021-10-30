/**
 * 
 */
package com.abhilash.tddstring.utility;

import java.util.ArrayList;
import java.util.List;

/**
 * @author abhilashgupta
 *
 */
public class Utility {
	
	private Utility() {
		
	}

	public static List<Integer> isPatternMatching(String input, String pattern) {
		List<Integer> index = new ArrayList<>();			
		 for (int i = 0; i <= (input.length() - pattern.length()); i++)
	        {
	            if (input.substring(i, (i + pattern.length())).equalsIgnoreCase(
	                    pattern))
	            {
	            	index.add(i);	            	
	            }
	        }	 
		
		return index;		
	}

	public static boolean isPalindrome(String input) {
		// TODO Auto-generated method stub
		return false;
	}
}
