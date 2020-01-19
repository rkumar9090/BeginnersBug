package com.geeks.overloading;

public class StringReverse {

	public static void main(String[] args) {
		String s = "Java";
		// Below we used StringBuilder to print string in reverse		
		StringBuilder builder = new StringBuilder(s);
		System.out.println(builder.reverse());
	}

}
