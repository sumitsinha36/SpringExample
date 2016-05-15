package com.tutorialspoint;
public class HelloWorld {

	private String message;

	public void getMessage() {
		System.out.println("Welcome Message ---" + this.message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void init(){
		System.out.println("This is init method calling");
	}
	public void destroy(){
		System.out.println("This is destory method calling");
	}

}
