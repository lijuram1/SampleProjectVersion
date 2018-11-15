package com.java.observerdesignpattern;

public class Customer implements Observer{
	
	private String customerName;

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public void update(String pname) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello " +customerName +", " +pname +" is now available on Amazon.");
		
	}

}
