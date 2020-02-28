package com.geeks.example;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalculateDaysUsingCalender {

	public static void main(String[] args) {
		try {
			Calendar startDate = new GregorianCalendar();
			Calendar endDate = new GregorianCalendar();

			// Start date is 2020-03-01 (YYYY-MM-dd)
			startDate.set(2020, 03, 1);

			// end date is 2020-03--03 (YYYY-MM-dd)
			endDate.set(2020, 03, 3);

			// subtract emdTime-StartTime and divide by (1000 * 60 * 60 * 24)
			int i = (int) ((endDate.getTime().getTime() - startDate.getTime().getTime()) / (1000 * 60 * 60 * 24));
			System.out.println("Number of days " + i);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
