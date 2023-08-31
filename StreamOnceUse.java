package com.jsp.lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOnceUse {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,23,3,4,5,6);
		Stream<Integer> s = values.stream();
		s.forEach(System.out::println);
		s.forEach(System.out::println); // Stream can not be use again if use once
	}

}
