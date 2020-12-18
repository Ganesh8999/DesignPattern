package com.pro.visitor;

public class Fruit implements ItemElement {

	private int pricePerKg;
	
	private int weight;
	private String name;
	
	

	public Fruit(int pricePerKg, int weight, String name) {
		super();
		this.pricePerKg = pricePerKg;
		this.weight = weight;
		this.name = name;
	}


	int getPricePerKg() {
		return pricePerKg;
	}


	String getName() {
		return name;
	}


	int getWeight() {
		return weight;
	}


	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
