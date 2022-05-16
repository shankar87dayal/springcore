package com.spring.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
//	@Autowired   // we can use this line  as a variable & output   (Emp [address=Address [street=alamaram, city=chennai]])
	private Address address;

	public Address getAddress() {
		return address;
	}
	/* @Autowired  we can use this line as a setter  & output (setting value
	Emp [address=Address [street=alamaram, city=chennai]]) */
	
	public void setAddress(Address address) {
		System.out.println("setting value");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired /*we can use this line as a constructor  & output(inside constructor !!
Emp [address=Address [street=alamaram, city=chennai]])*/
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor !!");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
