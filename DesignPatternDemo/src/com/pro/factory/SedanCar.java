package com.pro.factory;

public class SedanCar extends Car {

	
	
	
	public SedanCar() {
		super(CarType.SEDAN);
		construct();
	}

	@Override
	protected void construct() {

		System.out.println("buiding the sedan car...");
		// add parts of Sedan car..
	}

}
