package com.java.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject{
	
	private String productName;
	private List<Observer> Observerlist = new ArrayList<Observer>();
	private boolean isAvailable;
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	public List<Observer> getObserverlist() {
		return Observerlist;
	}
	public void setObserverlist(List<Observer> observerlist) {
		Observerlist = observerlist;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public void registerObservers(Observer observer) {
		// TODO Auto-generated method stub
		
		Observerlist.add(observer);
		
	}
	@Override
	public void removeObservers(Observer observer) {
		// TODO Auto-generated method stub
		
		Observerlist.remove(observer);
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
		System.out.println("Notifying all the Observers");
		for(Observer observer: Observerlist){
			observer.update(productName);
		}
	}
	/**
	 * @return the isAvailable
	 */
	public boolean isAvailable() {
		return isAvailable;
	}
	/**
	 * @param isAvailable the isAvailable to set
	 */
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
		if (this.isAvailable ==true)
		notifyObservers();
	}
	

}
