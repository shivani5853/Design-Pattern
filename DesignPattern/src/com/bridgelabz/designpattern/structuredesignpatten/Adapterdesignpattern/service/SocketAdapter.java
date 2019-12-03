package com.bridgelabz.designpattern.structuredesignpatten.Adapterdesignpattern.service;

import com.bridgelabz.designpattern.structuredesignpatten.Adapterdesignpattern.model.Volt;

public interface SocketAdapter {
	public Volt get240Volts();

	public Volt get120Volts();

	public Volt get12Volts();
}
