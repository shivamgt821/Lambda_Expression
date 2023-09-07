package com.jsp.lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestDistinct3Aslist {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(5,47,0,4,5,8,0,0,3,1,1,1,12,1);
		Stream<Integer> data = nums.stream();
		data.distinct().sorted().forEach(n-> System.out.print(n+" ")); //0 1 3 4 5 8 12 47
	}

}
