package com.geeks.overloading;

import java.util.ArrayList;
import java.util.List;

public class IterateListUsingStreams {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("Apple");
		list.add("Pineapple");
		list.add("Papaya");

		list.stream().forEach((x) -> System.out.println(x));

	}

}
