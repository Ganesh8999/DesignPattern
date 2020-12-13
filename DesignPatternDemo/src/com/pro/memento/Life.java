package com.pro.memento;

public class Life {

	private String time;

	public void set(String time) {

		System.out.println("we are setting the time to " + time);
		this.time = time;
	}

	public Memento saveToMemento() {

		System.out.println("saving time to the memento");
		return new Memento(time);
	}

	public void restoreMemento(Memento memento) {

		time = memento.getSavedTime();
		System.out.println("time storing from the memento " + time);
	}
}