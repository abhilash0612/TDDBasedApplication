/**
 * 
 */
package com.abhilash.tddstring.utility;

import java.util.ArrayList;
import java.util.List;

/**Utility class
 * @author abhilashgupta
 *
 */
public class Utility {

	private Utility() {

	}

	/**logic method for checking pattern in the input string
	 *  
	 *
	 */
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

	/**logic method for checking  string is palindrome or not
	 *  
	 *
	 */
	public static boolean isPalindrome(String input) {
		int i = 0;
		int j = input.length() - 1;
		while (i < j) {
			if (input.charAt(i) != input.charAt(j))
				return false;
			i++;
			j--;      
		}
		return true;
	}
}
