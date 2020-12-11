package com.pro.abstractFactory;

public class TestAbstractFactoryPattern {

	
	public static void main(String[] args) {
		
		System.out.println(CarFactory.buildCar(CarType.LUXURY));
		System.out.println(CarFactory.buildCar(CarType.SEDAN));
		System.out.println(CarFactory.buildCar(CarType.SMALL));
	}
}
