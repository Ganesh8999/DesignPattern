package com.pro.memento;

public class Memento {

	private final String time;

	public Memento(String saveTime) {

		this.time = saveTime;
	}

	public String getSavedTime() {

		return time;
	}

}
