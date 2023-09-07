package com.jsp.lambdaExpression;

import java.time.LocalDate;
import java.time.Month;

public class DateTimeDemo  {

	/*
	 *
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		LocalDate d1 = LocalDate.of(1999, 7, 15);
		LocalDate d2 = LocalDate.of(1999, Month.JULY, 15);
//		LocalDate d3 = LocalDate.of(1999, Month.FEBRUARY, 29);//Invalid date 'February 29' as '1999' is not a leap year
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
//		System.out.println(d3);
		
	}

}
