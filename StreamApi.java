package com.jsp.lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4,5,6,7,8,9,1,2);
		
		Stream<Integer> data = nums.stream();
		long count  = data.count();
		System.out.println(count); // 8 
	// Now Again you use stream then it show exception stream has already been operated upon or closed because 
	// Streeam can not be used once again if it is operated
		data.forEach(n -> System.out.println(n));
//		data.forEach(n -> System.out.println(n));  // java.lang.IllegalStateException: stream has already been operated upon or closed
	}

}
