package com.pro.abstractFactory;

public abstract class Car {
	
	
	private CarType model = null;
	private Location location = null;
	
	
	
	@Override
	public String toString() {
		return "Model- "+ model + " built in "+ location;
	}
	public Car(CarType model, Location location) {
		super();
		this.model = model;
		this.location = location;
	}
	CarType getModel() {
		return model;
	}
	void setModel(CarType model) {
		this.model = model;
	}
	Location getLocation() {
		return location;
	}
	void setLocation(Location location) {
		this.location = location;
	}
	protected abstract void construct();
	
	

	
	
}