package com.geeks.overloading;

public class StringBufferExample {

	public static void main(String[] args) {
		
		//In below line we are defining the string buffer
		StringBuffer buffer = new StringBuffer();
		//.append is the keyword to concat the strings
		buffer.append("This");
		buffer.append(" is a ");
		buffer.append("String Buffer ");
		buffer.append("Example");
		
		System.out.println(buffer.toString());

	}

}
