package com.bridgelabz.designpattern.structuredesignpatten.visitordesignpattern;

public class Fruit implements ItemElement{

	private int pricePerKg;
	private int weight;
	private String name;
	
	
	@Override
	public int accept(ShoppingCartVisitor s) {
		return 0;
	}

}
