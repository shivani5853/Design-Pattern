package com.bridgelabz.proxypattern;

public class CommandExecuterTest {
	public static void main(String[] args) {
		CommandExecuter executer = new CommandExecutorProxy("Aishwarya","wrong_pwd");	
	   try 
	   {
		   executer.runCommand("ls - ltr");
		   executer.runCommand("rm -rf abc.pdf");
	   }
	   catch(Exception e)
	   {
System.out.println("Exception message::"+e.getMessage());
}
}
}