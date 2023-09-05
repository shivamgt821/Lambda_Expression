package com.jsp.lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamApi6 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4,5,6,7,8,9,1,2);  // task is Double the odd value
		
		Predicate<Integer> predi = new Predicate<Integer>() {
		public boolean test(Integer n) {  
			if(n%2 == 1) return true;
			else return false;
		}
	};
		
		nums.stream()
			.filter(predi)     // 1st way to do this  and 2nd ways to do this in next class StreamApi7
			.sorted()
			.map(n -> n*2).
			forEach(n-> System.out.print(n+" "));
		
	}

}
