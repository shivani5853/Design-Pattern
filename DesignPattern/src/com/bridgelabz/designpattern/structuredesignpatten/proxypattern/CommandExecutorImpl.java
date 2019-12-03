package com.bridgelabz.proxypattern;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecuter{
	public void runCommand(String cmd)throws IOException{
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");
	}


	}


