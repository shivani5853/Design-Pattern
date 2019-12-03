package com.bridgelabz.designpattern.structuredesignpatten.proxydesignpattern.service.serviceimplementation;

import java.io.IOException;

import com.bridgelabz.designpattern.structuredesignpatten.proxydesignpattern.service.CommandExcecutor;

public class CommandExcecutorImplementation implements CommandExcecutor {

	@Override
	public void runCommand(String cmd) throws IOException {
		Runtime.getRuntime().exec(cmd);
		System.out.println(cmd + "Command Excecuted Properly...");
	}

}
