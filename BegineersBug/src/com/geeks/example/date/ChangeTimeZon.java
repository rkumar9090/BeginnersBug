package com.geeks.example.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ChangeTimeZon {

	public static void main(String[] args) {
		try {
			Date date = new Date();
			System.out.println("Current Date Time : " + date);
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
			// In below line we are mentioned to convert into UTC
			dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
			String utcFormat = dateFormat.format(date);
			System.out.println("After converting into UTC format: " + utcFormat);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
