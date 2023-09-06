package com.jsp.lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class StreamApiSquareOfListAndSort {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4,5,6,7,8,9,1,2);  // task is Square the list and sort
		
		nums.stream().map(n -> n*n).sorted().forEach(n-> System.out.print(n+" "));
	}
}
