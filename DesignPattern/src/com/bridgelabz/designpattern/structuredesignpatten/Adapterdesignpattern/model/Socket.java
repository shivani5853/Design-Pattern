package com.bridgelabz.designpattern.structuredesignpatten.Adapterdesignpattern.model;

public class Socket {
	public Volt getVolt() {
		return new Volt(120);
	}
}
