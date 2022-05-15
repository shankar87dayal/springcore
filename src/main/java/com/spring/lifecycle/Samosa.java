package com.spring.lifecycle;

public class Samosa {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	//same method name
	/*
	 
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	*/
	// different method name
	public void hey() {
		System.out.println("Inside init method : hey how are u?");
	}
	
	public void bye() {
		System.out.println("Inside destroy method bye bye im going to die");
	}
}
