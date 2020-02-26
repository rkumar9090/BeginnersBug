package com.geeks.example;

import java.util.HashMap;
import java.util.Map;

public class KeyValueFromHashMap {

	public static void main(String[] args) {
		try {
			Map<String, String> hashMap = new HashMap();
			hashMap.put("1", "Car");
			hashMap.put("2", "Bus");
			hashMap.put("3", "Train");

			for (Map.Entry<String, String> entry : hashMap.entrySet()) {
				System.out.println(entry.getKey() + " Value is " + entry.getValue());
			}
			System.out.println("---------------");
			// Below code only work above java 8
			hashMap.forEach((key, value) -> {
				System.out.println("Value of " + key + " is " + value);
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
