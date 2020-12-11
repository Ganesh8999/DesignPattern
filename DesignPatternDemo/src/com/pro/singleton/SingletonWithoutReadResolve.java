package com.pro.singleton;

import java.io.Serializable;

public class SingletonWithoutReadResolve implements Serializable {

	private volatile static SingletonWithoutReadResolve instance = null;

	public static SingletonWithoutReadResolve getInstance() {
		if (instance == null) {
			instance = new SingletonWithoutReadResolve();
		}

		return instance;
	}

	private int i = 10;

	public int getI() {

		return i;
	}

	public void setI(int i) {

		this.i = i;
	}

}
