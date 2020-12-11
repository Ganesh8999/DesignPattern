package com.pro.abstractFactory;

public class CarFactory {

	private CarFactory() {
		// preventing instantiation

	}

	public static Car buildCar(CarType type) {

		Car car = null;

		Location location = Location.ASIA; // read location info from properties file

		// use location specific car factory
		switch (location) {

		case USA:
			car = USACarFactory.buildCar(type);
			break;

		case ASIA:
			car = AsianCarFactory.buildCar(type);
			break;
		default:
			car = DefaultCarFactory.buildCar(type);
			break;

		}
		return car;
	}

}
