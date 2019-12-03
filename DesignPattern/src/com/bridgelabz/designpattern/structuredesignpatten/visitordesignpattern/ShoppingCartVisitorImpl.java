package com.bridgelabz.designpattern.structuredesignpatten.visitordesignpattern;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	public ShoppingCartVisitorImpl()
	{
	}
	
	@Override
	public int visit(Book book) {
		return 0;
	}

	@Override
	public int visit(Fruit fruit) {
		return 0;
	}

}
