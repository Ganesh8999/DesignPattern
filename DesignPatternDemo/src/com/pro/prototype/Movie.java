package com.pro.prototype;

public class Movie implements PrototypeCapable {
	
	
	private String  name = null;

	@Override
	public String toString() {
		return "Movie";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Movie clone() throws CloneNotSupportedException {
	System.out.println("Movie.clone()");
		
		return (Movie)super.clone();
	}

}
