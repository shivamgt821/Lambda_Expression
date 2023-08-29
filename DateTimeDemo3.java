package com.jsp.lambdaExpression;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo3 {

	public static void main(String[] args) {
		LocalDateTime t = LocalDateTime.now();
		System.out.println(t);
		LocalDateTime t1 = LocalDateTime.of(1999,07,15,12,35,20,56);
		System.out.println(t1);
		
	}

}
