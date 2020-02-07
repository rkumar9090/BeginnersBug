package com.geeks.example;

public class StringReverseExample {

	public static void main(String[] args) {

		String s = "java";
		int stringLength = s.length();

		// In Below for loop starting will be lenght-1
		// The end will o
		for (int i = stringLength - 1; i >= 0; i--) {
			// we used charAt method to get value from the string
			// instead of println we used print to print on same line
			System.out.print(s.charAt(i));

		}	
		

	}

}
