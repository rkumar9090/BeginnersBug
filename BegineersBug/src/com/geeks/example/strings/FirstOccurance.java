package com.geeks.example.strings;

public class FirstOccurance {

	public static void main(String[] args) {
		try {
			String s = "BeginnersBug";
			int indexOf = s.indexOf('e');
			System.out.println("The first occurance of e is " + indexOf);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}