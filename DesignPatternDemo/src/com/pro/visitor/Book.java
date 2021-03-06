package com.pro.visitor;

public class Book implements ItemElement {

	private int price;
	private String isbnNumber;

	int getPrice() {
		return price;
	}

	String getIsbnNumber() {
		return isbnNumber;
	}

	public Book(int price, String isbnNumber) {
		super();
		this.price = price;
		this.isbnNumber = isbnNumber;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {

		return visitor.visit(this);
	}

}
