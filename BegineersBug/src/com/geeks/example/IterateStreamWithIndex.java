package com.geeks.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class IterateStreamWithIndex {

	public static void main(String[] args) {
		try {
			List<String> list = new ArrayList<String>();
			list.add("India");
			list.add("USA");
			list.add("Germany");

			IntStream.range(0, list.size())
					.forEach(x -> System.out.println("The index is " + x + " Value is " + list.get(x)));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
