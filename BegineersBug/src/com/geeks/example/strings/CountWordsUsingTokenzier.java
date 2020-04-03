package com.geeks.example.strings;

import java.util.StringTokenizer;

public class CountWordsUsingTokenzier {

	public static void main(String[] args) {
		try {
			String sentence = "    The pen    is mightier than the sword . ";
			StringTokenizer tokens = new StringTokenizer(sentence);
			System.out.println("The sentence have " + tokens.countTokens() + " words");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
