package com.geeks.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List arrayList = new ArrayList();
		arrayList.add("Java");
		arrayList.add("Java 8");
		arrayList.add("Java 11");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("Value at the index of " + i + " " + arrayList.get(i));
		}
	}
}