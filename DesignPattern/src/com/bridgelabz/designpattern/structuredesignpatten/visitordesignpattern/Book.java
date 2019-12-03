package com.bridgelabz.designpattern.structuredesignpatten.visitordesignpattern;

public class Book implements ItemElement {
	private int price;
	private String name;

	public Book(int price, String name) {
		this.price = price;
		this.name = name;
	}

	@Override
	public int accept(ShoppingCartVisitor s) {
		return 0;
	}

}
