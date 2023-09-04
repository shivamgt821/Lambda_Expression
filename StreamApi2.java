package com.jsp.lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamApi2 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4,5,6,7,8,9,1,2);
		
		Stream<Integer> data = nums.stream();
		
//		Optional<Integer> first = data.findFirst(); System.out.println(first); // Optional[4]
		
		Stream<Integer> sortedData = data.sorted();
		
		sortedData.forEach(n -> System.out.println(n));
	}

}
