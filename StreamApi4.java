package com.jsp.lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi4 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4,5,6,7,8,9,1,2);  // task is Double the all value
		
		nums.stream()
			.sorted()
			.map(n -> n*2).
			forEach(n-> System.out.print(n+" "));
		
		/*  Explain --> nums is list of number
		 *  			stream() creates a new stream for me 
		 *  			sorted() is uded to sort in ascending order 
		 *  			map()  on that new stream apply for logic you want  
		 *  			forEach() used to iterate and print the value 
		 *  
		 *  there are total 3 Stream are created here first in nums.stream then 2nd in sorted() and 3rd in map()
		 */
					   
		
	}

}
