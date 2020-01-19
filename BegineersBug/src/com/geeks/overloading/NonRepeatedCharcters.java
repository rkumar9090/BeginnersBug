package com.geeks.overloading;

import java.util.ArrayList;

public class NonRepeatedCharcters {

	public static void main(String[] args) {

		// Input variable
		String s = "BeginnersBug";
		// Output Variable
		String nonRepeatedChars = "";
		// converting string to array to iterate
		char[] charArray = s.toCharArray();
		// Temporary arraylist to check non repeated charcters
		ArrayList<Character> arrayList = new ArrayList<Character>();
		for (int i = 0; i < charArray.length; i++) {
			// Checking that charcater already exists on arraylist
			boolean contains = arrayList.contains(charArray[i]);
			if (!contains) {
				// If not exists we are adding on array and output variable
				arrayList.add(charArray[i]);
				nonRepeatedChars += charArray[i];
			}

		}
		System.out.println(nonRepeatedChars);

	}

}
