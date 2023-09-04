package com.jsp.lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi3 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4,5,6,7,8,9,1,2);  // task is Double the all value
		
		Stream<Integer> data = nums.stream();
		Stream<Integer> mappedData = data.map(n -> n*2);  // 1st method 
		mappedData.forEach(n-> System.out.print(n+" "));
		
		for(int n : nums) System.out.print(n*2+" ");      // 2nd Method
	}
}
