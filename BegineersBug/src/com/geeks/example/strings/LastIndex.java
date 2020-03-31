package com.geeks.example.strings;

public class LastIndex {

	public static void main(String[] args) {
		try {
			String s = "BeginnersBug";
			int indexOf = s.lastIndexOf('B');
			System.out.println("The last index of B is " + indexOf);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
