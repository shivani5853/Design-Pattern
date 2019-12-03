package com.bridgelabz.proxypattern;
	public class CommandExecutorProxy implements CommandExecuter{

		 private boolean isAdmin;
		 private CommandExecuter executer;
		 
		 public CommandExecutorProxy(String user,String pwd) {
			 if("Aishwarya".equals(user) && "Ishwarya".equals(pwd)) isAdmin=true; 
				 executer=new CommandExecutorImpl();
			 
		 }

		@Override
		public void runCommand(String cmd) throws Exception {
			 if(isAdmin)
			 {
				 executer.runCommand(cmd);
			 }
			 else
			 {
				 if(cmd.trim().startsWith("rm")) {
					 throw new Exception("rm command is not allowed for non-admin users.");
					}else{
						executer.runCommand(cmd);
					}
				 }
			 }
		}
	
		
		
	

