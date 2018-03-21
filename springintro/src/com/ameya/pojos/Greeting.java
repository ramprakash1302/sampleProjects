package com.ameya.pojos;

public class Greeting {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Greeting() {}

	public Greeting(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "Greeting [message=" + message + "]";
	}
	public void init() {
		System.out.println("BEAN is being initialized");
	}
	public void destroy() {
		System.out.println("BEAN is about to be destroyed");
	}
}
