package com.java.observerdesignpattern;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1 = new Customer();
		c1.setCustomerName("Liju");
		Customer c2 = new Customer();
		c2.setCustomerName("Jithu");
		
		Product p = new Product();
		p.setProductName("Iphone XS");
		p.registerObservers(c1);
		p.registerObservers(c2);
		p.setAvailable(false);
		p.setAvailable(true);
		

	}

}
