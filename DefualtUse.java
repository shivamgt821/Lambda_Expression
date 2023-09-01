package com.jsp.lambdaExpression;


interface Phone {
	void call();
//	void message();   // we need to have declare message not define so make method

//	void message() {
//								//Again error show because by default it is public and abstract we need to do defualt
//	}
	default void message() {     // Now its fine
		System.out.println("Sent");  
	}
	
}
class AndroidPhone implements Phone {
	public void call() {
		System.out.println("Calling");
	}
}
public class DefualtUse {

	public static void main(String[] args) {
		Phone p = new AndroidPhone();
		p.call();
		p.message();
	}

}
