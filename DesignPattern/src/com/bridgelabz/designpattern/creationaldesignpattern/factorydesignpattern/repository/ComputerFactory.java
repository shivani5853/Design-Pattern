package com.bridgelabz.designpattern.creationaldesignpattern.factorydesignpattern.repository;

import com.bridgelabz.designpattern.creationaldesignpattern.factorydesignpattern.model.Pc;
import com.bridgelabz.designpattern.creationaldesignpattern.factorydesignpattern.model.Server;
import com.bridgelabz.designpattern.creationaldesignpattern.factorydesignpattern.service.ComputerInf;

public class ComputerFactory {

//	public static ComputerInf createComputer(ComputerType type,String hdd,String cpu,String ram)
//	{
//		Computer computer=null;
//		switch(type)
//		{
//		case PC:
//			computer=new Pc(hdd,ram,cpu);
//			break;
//		case SERVER:
//			computer=new Server(hdd,ram,cpu);
//			break;
//		}
//		return computer;
//	}
	
	public static ComputerInf createComputer(String type,String hdd,String cpu,String ram)
	{
		if ("Pc".equalsIgnoreCase(type)) {
			return new Pc(hdd,cpu,ram);
		}
		else if("Server".equalsIgnoreCase(type))
		{
			return new Server(hdd,cpu,ram);
		}
	return null;	
	}

}
