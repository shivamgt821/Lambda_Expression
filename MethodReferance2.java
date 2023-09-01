package com.jsp.lambdaExpression;

class MyPrinter
{
	public void print(String str) {
		System.out.println(str);
	}
}
public class MethodReferance2 {

	public static void main(String[] args) {
		String str = "Shivam Gupta";
		MyPrinter mp = new MyPrinter();
		mp.print(str);
	}

}
