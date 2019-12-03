package com.bridgelabz.designpattern.structuredesignpatten.Adapterdesignpattern.service.serviceimplementation;

import com.bridgelabz.designpattern.structuredesignpatten.Adapterdesignpattern.model.Socket;
import com.bridgelabz.designpattern.structuredesignpatten.Adapterdesignpattern.model.Volt;
import com.bridgelabz.designpattern.structuredesignpatten.Adapterdesignpattern.service.SocketAdapter;

public class SocketObjectAdaptorImplementation implements SocketAdapter {

	private Socket socket = new Socket();

	@Override
	public Volt get240Volts() {
		return socket.getVolt();
	}

	@Override
	public Volt get120Volts() {
		Volt v = socket.getVolt();
		return convertVolt(v, 10);
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolt() / i);
	}

	@Override
	public Volt get12Volts() {
		return null;
	}

}
