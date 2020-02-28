package com.geeks.example;

public class CompareStringExample {
	public static void main(String[] args) {
		try {
			// Example 1 == Below check will failS
			if ("BeginnersBug" == new String("BeginnersBug")) {
				System.out.println("Example 1 : Both the strings are equal");
			} else {
				System.out.println("Example 1 : Both the strings are not equal");
			}

			// Example 2 .equals()
			if ("BeginnersBug".equals(new String("BeginnersBug"))) {
				System.out.println("Example 2 : Both the strings are equal");
			} else {
				System.out.println("Example 2 : Both the strings are not equal");
			}

			// Example 3 .equalsIgnoreCase()
			if ("beginnersbug".equalsIgnoreCase(new String("BeginnersBug"))) {
				System.out.println("Example 3 : Both the strings are equal");
			} else {
				System.out.println("Example 3 : Both the strings are not equal");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
