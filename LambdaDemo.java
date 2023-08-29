package com.jsp.lambdaExpression;


interface A {
	void show(int i);
}
//class Xyz implements A{
//	public void show(int i) {
//		System.out.println("Hello" + i);
//	}
//}
public class LambdaDemo {

	public static void main(String[] args) {
		A obj;  
//		obj = new Xyz();
		
//		obj = new A(){                         // fro new A(){ to } are boiler plate code . Since java 8 feature is its remove that
//		public void show() {
//			System.out.println("Hello");
//		}
//	};
		obj = (int i) -> System.out.println("Hello" + i);  // Consumer interface // lambda exp short all things remove boiler plate code
//		obj = i -> System.out.println("Hello" + i); we can use also this syntax for 1 statement and no need to declare again int if you decalre in void show(int i)
		obj.show(6);
	}

}
