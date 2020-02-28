package com.geeks.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCompareExample {
	public static void main(String[] args) {
		try {

			String date1 = "20/02/2020";
			String date2 = "21/02/2020";
			DateFormat format = new SimpleDateFormat("DD/MM/yyyy");
			Date dateObj1 = format.parse(date1);
			Date dateObj2 = format.parse(date2);

			// If Both the date are same comparTo Method will return 0
			if (dateObj1.equals(dateObj2)) {
				System.out.println("Both the dates are Equal !!");
			} // If date1 greater than date 2 it will return 1
			else if (dateObj1.after(dateObj2)) {

				System.out.println("Date 1 is after than date 2");
			} // If date1 lesser than date 2 it will return -1
			else if (dateObj1.before(dateObj2)) {
				System.out.println("Date 1 is before than date 2");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
