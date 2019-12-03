package com.bridgelabz.designpattern.structuredesignpatten.visitordesignpattern;

public interface ShoppingCartVisitor {
	public int visit(Book book);

	public int visit(Fruit fruit);
}
