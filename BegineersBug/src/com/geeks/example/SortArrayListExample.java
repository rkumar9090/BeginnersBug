package com.geeks.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Car");
		list.add("Zebra");
		list.add("Apple");
		list.add("Ball");
		System.out.println("Array list values before sorting \n");

		for (String string : list) {
			System.out.println("Value is " + string);
		}

		// Below sort methd will sort your list
		Collections.sort(list);

		System.out.println("\nArray list values after sorting \n");

		for (String string : list) {
			System.out.println("Value is " + string);
		}

	}
}
