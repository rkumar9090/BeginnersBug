package com.geeks.example;

public class SplitStringExample {

	public static void main(String[] args) {

		String s = "google-yahoo";
		// In below line we used space as a delimiter
		String[] split = s.split("-");
		// we will get the splited string as array
		//In below line we using for loop to print each array value
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}

	}

}
