package com.geeks.example.list;

import java.util.ArrayList;
import java.util.List;

public class Join2List {

	public static void main(String[] args) {
		try {
			List<String> list1 = new ArrayList<String>();
			List<String> list2 = new ArrayList<String>();

			list1.add("Rajesh");
			list1.add("Usha");

			list2.add("Kumar");
			list2.add("Nandhini");

			System.out.println("---List1 value before adding list2---");
			for (String string : list1) {
				System.out.println(string);
			}

			// Adding list2 to list1
			list1.addAll(list2);

			System.out.println("---List1 value After adding list2---");

			for (String string : list1) {
				System.out.println(string);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
