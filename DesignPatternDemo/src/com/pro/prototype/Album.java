package com.pro.prototype;

public class Album implements PrototypeCapable {

	private String name = null;

	@Override
	public String toString() {
		return "Album";
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	@Override
	public Album clone() throws CloneNotSupportedException {

		return (Album) super.clone();
	}

}
