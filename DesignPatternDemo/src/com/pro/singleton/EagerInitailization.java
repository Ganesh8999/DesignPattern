package com.pro.singleton;

public class EagerInitailization {
	
	private static volatile EagerInitailization singletonInstance = new  EagerInitailization();
	
	// private constructor
	private EagerInitailization() {
		
		// can't call constructor
	}

	public static EagerInitailization getInstance() {
		return singletonInstance;
	}
	
	
	// The above method works fine, but it has one drawback. 
	// The instance is created irrespective of it is required in runtime or not. 
	// If this instance is not a big object and you can live with it being unused, this is the best approach.
}
