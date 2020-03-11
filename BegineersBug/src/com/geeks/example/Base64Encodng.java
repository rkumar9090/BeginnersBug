package com.geeks.example;

import java.util.Base64;

public class Base64Encodng {

	public static void main(String[] args) {
		try {
			String textForEncoding = "QWERTY TEXT";
			String encodedString = Base64.getEncoder().withoutPadding().encodeToString(textForEncoding.getBytes());
			System.out.println(encodedString);
			
			byte[] decodeByte = Base64.getDecoder().decode(encodedString.getBytes());
			String decodedValue=new String(decodeByte);
			System.out.println(decodedValue);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
