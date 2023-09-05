package com.jsp.lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class StreamApi5 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4,5,6,7,8,9,1,2);  // task is Double the odd value
		
		nums.stream()
			.filter(n -> n%2 == 1)   // filter() takes the object of predicate
									// What is predicate ? predicate is a funcational interface which has a method 
									//	called test() which return boolean values .  
			.sorted()
			.map(n -> n*2).
			forEach(n-> System.out.print(n+" "));
		
	}

}
