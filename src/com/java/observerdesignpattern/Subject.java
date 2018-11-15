package com.java.observerdesignpattern;

public interface Subject {
	
	public void registerObservers(Observer observer);
	public void removeObservers(Observer observer);
	public void notifyObservers();

}
