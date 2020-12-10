package com.pro.factory;

public class SmallCar extends Car {

	public SmallCar() {
		super(CarType.SMALL);
		construct();
	}

	@Override
	protected void construct() {

		System.out.println("Building small car ...");
		// add parts of small car
	}

}
