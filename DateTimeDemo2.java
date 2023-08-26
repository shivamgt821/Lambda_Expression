package com.jsp.lambdaExpression;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeDemo2 {

	public static void main(String[] args) {
		LocalTime t = LocalTime.now();
		System.out.println(t);
		LocalTime t1 = LocalTime.of(12,35,20,999);
		System.out.println(t1);
		
//		for(String s : ZoneId.getAvailableZoneIds())System.out.println(s); // all timezone
		LocalTime t2 = LocalTime.now(ZoneId.of("Asia/Kuwait"));
		System.out.println(t2);
		
		LocalTime t3 = LocalTime.now(ZoneId.of("GMT"));
		System.out.println(t3);
		
		Instant i = Instant.now();  // Machine Redable Date and time in gmt
		System.out.println(i);
	}

}
