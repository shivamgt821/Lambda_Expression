package com.jsp.lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//call by value
// calling by method
public class MethodReferance {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Naveenn","Manoj","Shivam","Priya");

		names.forEach((s) -> System.out.println(s)); // lambda exp
		names.forEach(System.out::println);  //MethodReferance --> 2nd way to print
	}

}
