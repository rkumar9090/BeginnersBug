package com.geeks.example;

import java.util.Calendar;
import java.util.Date;

public class AddDaysToDate {

	public static void main(String[] args) {
		try {
			Calendar calender = Calendar.getInstance();
			Date beforeAdding = calender.getTime();
			System.out.println("Printing the value before adding date ::: " + beforeAdding);

			// Adding the 3 days below
			calender.add(Calendar.DAY_OF_YEAR, 3);
			Date afterAdding = calender.getTime();
			System.out.println("Printing the value after adding date  ::: " + afterAdding);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}