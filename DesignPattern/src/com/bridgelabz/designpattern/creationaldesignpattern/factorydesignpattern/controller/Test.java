package com.bridgelabz.designpattern.creationaldesignpattern.factorydesignpattern.controller;

import com.bridgelabz.designpattern.creationaldesignpattern.factorydesignpattern.repository.ComputerFactory;
import com.bridgelabz.designpattern.creationaldesignpattern.factorydesignpattern.service.ComputerInf;
import com.bridgelabz.designpattern.utility.Utility;

public class Test {
	public static void main(String[] args) {
		
//		ComputerInf pc = ComputerFactory.createComputer("pc","2 GB","500 GB","2.4 GHz");
//		ComputerInf server = ComputerFactory.createComputer("server","16 GB","1 TB","2.9 GHz");
//		System.out.println("Factory PC Config::"+pc);
//		System.out.println("Factory Server Config::"+server);
		
		System.out.println("Enter the type");
		String type=Utility.inputString();
		System.out.println("Enter hdd");
		String HDD=Utility.inputString();
		System.out.println("Enter cpu");
		String CPU=Utility.inputString();
		System.out.println("Enter ram");
		String RAM=Utility.inputString();
		
		ComputerInf string;
		
			if("Pc".equalsIgnoreCase(type))
			{
				string=ComputerFactory.createComputer(type, HDD, CPU, RAM);
				System.out.println(type+" "+HDD);
				System.out.println(string);
			}
			else if("Server".equalsIgnoreCase(type))
			{
				string=ComputerFactory.createComputer(type, HDD, CPU, RAM);
				System.out.println(string);
			}
			else
			{
				System.out.println("Invalied Type");
			}
			
		}
			
	}

