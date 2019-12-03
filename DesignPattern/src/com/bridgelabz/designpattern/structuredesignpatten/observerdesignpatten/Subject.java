package com.bridgelabz.designpattern.structuredesignpatten.observerdesignpatten;

public interface Subject {
	public void register(Observer obj);

	public void deregister(Observer obj);

	public void notifyObserver();

	public Object getUpdate(Observer obj);
}
