package com.hackerrank;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;





public class GreatestString {
	
	
	private class Result {

	    /*
	     * Complete the 'getLargestString' function below.
	     *
	     * The function is expected to return a STRING.
	     * The function accepts following parameters:
	     *  1. STRING s
	     *  2. INTEGER k
	     */

	    public static String getLargestString(String s, int k) {
	    // Write your code here
	        String str = "";
	        char[] chars = s.toCharArray();
	        
	        List<Character> charList = new ArrayList<>();
	        for(char c : chars) {
	        	charList.add(c);
	        }
//	        charList.stream().sorted((i, j)->i > j? 1 : i == j ? 0 : -1);
	        charList.stream().sorted(Comparator.reverseOrder())
	        					.collect(Collectors.toList());
	        					
	        
	        return null;
	    }

	}
}