package com.pro.factory;

public class TestFactoryPattern {
	
	public static void main(String[] args) {
		
		System.out.println(MyCarFactory.buildCar(CarType.SMALL));
		System.out.println(MyCarFactory.buildCar(CarType.SEDAN));
		System.out.println(MyCarFactory.buildCar(CarType.LUXURY));
	}

}
