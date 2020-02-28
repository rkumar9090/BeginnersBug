package com.geeks.example;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class CalculateDaysBetweenDatesJava8 {

	public static void main(String[] args) {
		try {
			// Start date is 2020-03-01 (YYYY-MM-dd)
			LocalDate startDate = LocalDate.of(2020, Month.MARCH, 1);

			// end date is 2020-03--03 (YYYY-MM-dd)
			LocalDate endDate = LocalDate.of(2020, Month.MARCH, 3);

			long numberOfDays = ChronoUnit.DAYS.between(startDate, endDate);

			System.out.println("Number of days " + numberOfDays);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
