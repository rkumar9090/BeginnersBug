package com.geeks.example.strings;

public class CountWordsUsingSplit {

	public static void main(String[] args) {

		try {
			String sentence = "    The pen    is mightier than the sword . ";
			String properString = sentence.replaceAll("\\s+", " ").trim();
			String[] split = properString.split(" ");
			System.out.println("The sentence have " + split.length + " words");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
