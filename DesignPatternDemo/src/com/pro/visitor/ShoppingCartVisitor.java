package com.pro.visitor;

interface ShoppingCartVisitor {

	public int visit(Book book);

	public int visit(Fruit fruit);

}
