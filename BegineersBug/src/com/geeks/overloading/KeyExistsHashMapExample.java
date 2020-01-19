package com.geeks.overloading;

import java.util.HashMap;
import java.util.Map;

public class KeyExistsHashMapExample {

	public static void main(String[] args) {
		
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("1", "Car");
		hashMap.put("2", "Bus");
		hashMap.put("3", "Train");
		
		boolean isKeyAvaillable = hashMap.containsKey("1");
		if(isKeyAvaillable) {
			System.out.println("The value is "+hashMap.get("1"));
		}
		else {
			System.out.println("Key is not availlable");
		}

	}

}
