package com.app.problems;

public class ArraySearch {
	public int search(String strToMatch, String[] strArray) {
		for (int i = 0; i < strArray.length; i++)
			if (strArray[i].equals(strToMatch))
				return 1;
		return -1;
	}
	
	public boolean containsDuplicates(int[] numbers) {
		for(int i=0; i<numbers.length; i++)
			for(int j=0;j<numbers.length;j++)
				if(i!=j && numbers[i] == numbers[j])
					return true;
		return false;
	}
}
