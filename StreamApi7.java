package com.jsp.lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamApi7 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(4,5,6,7,8,9,1,2);  // task is Double the odd value
		// 2nd way
		
			
		
		nums.stream()
			.filter(n -> n%2 == 1)    
			.sorted()
			.map(n -> n*2).
			forEach(n-> System.out.print(n+" "));
		
	
	}

}
