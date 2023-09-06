package com.jsp.lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class StreamApi8 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4,5,6,7,8,9,1,2);  // Find the odd value , double them and sum
		
		int result = nums.stream()
			.filter(n -> n%2 == 1)    
			.sorted()
			.map(n -> n*2).
			reduce(0,(c,e)-> c+e);  // ) is initial value 0+1*2+5*2+7*2+9*2   ---> 44
			
		System.out.println(result);
		
	}

}
