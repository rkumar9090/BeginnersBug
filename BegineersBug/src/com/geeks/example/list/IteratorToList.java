package com.geeks.example.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorToList {

	public static void main(String[] args) {

		Iterator<String> iterator = Arrays.asList("Rajesh", "Kumar", "Beginners", "Bug").iterator();
		convertToListJava7(iterator);
		convertToListJava8(iterator);

	}

	/**
	 * Java 7 Approach
	 * 
	 * @param iterator
	 * @return
	 */
	public static ArrayList<String> convertToListJava7(Iterator<String> iterator) {
		ArrayList<String> list = new ArrayList<String>();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			list.add(string);
		}

		return list;
	}

	/**
	 * Java 8 Apporach
	 * 
	 * @param iterator
	 * @return
	 */
	public static ArrayList<String> convertToListJava8(Iterator<String> iterator) {
		ArrayList<String> list = new ArrayList<String>();
		iterator.forEachRemaining(list::add);
		return list;
	}

}
