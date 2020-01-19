package com.geeks.overloading;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		// .append method used to concat string
		builder.append("This");
		builder.append(" is");
		builder.append(" an");
		builder.append(" example");

		// printing the string
		System.out.println(builder.toString());

	}
}
