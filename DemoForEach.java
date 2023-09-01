package com.jsp.lambdaExpression;

import java.util.Arrays; 
import java.util.List;
import java.util.function.Consumer;

//1 class ConsImpl implements Consumer<Integer>{
//	public void accept(Integer i) {
//	System.out.println(i);
//	}
//}
public class DemoForEach {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4,5,6,7,8);
//1		Consumer<Integer> c = new ConsImpl();
//2		Consumer<Integer> c = new Consumer<Integer>()
//		{
//			public void accept(Integer i) 
//				{
//				System.out.println(i);
//				}
//			};
		
		Consumer<Integer> c = i -> System.out.println(i); // if 2 parameter then use ()

		values.forEach(c);
		System.out.println();
		values.forEach(i -> System.out.println(i));
		
		}
	
}
