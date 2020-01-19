package com.geeks.overloading;

public class StringToIntExample {

	public static void main(String[] args) {
		try {
			String s = "222A";
			// Below line will convert string to int using valueOf
			int numberValue = Integer.valueOf(s);
			System.out.println("Printing integer value " + numberValue);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
