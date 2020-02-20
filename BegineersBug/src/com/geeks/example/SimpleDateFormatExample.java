package com.geeks.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		try {
			String dateString = "20/02/2020";
			DateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY");
			// Below line will convert from string to date
			Date parse = simpleDateFormat.parse(dateString);
			// The output will be like Sun Dec 29 00:00:00 IST 2019
			System.out.println(" Output :: "+parse);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
