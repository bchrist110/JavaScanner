package com.qa.javascanner;

import java.util.Scanner;

public class Runner {
	private static Scanner operatorInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		menu();
		operatorInput.close();
	}
	
	public static void menu() {
		boolean flag = false;
		do {
			System.out.println("Pick an Operator:\n- add\n- subtract\n- multiply\n- divide");
			String selection = operatorInput.nextLine();
			switch(selection) 
				{
					case "add":
						submenuAdd();
						flag = true;
						break;
					
					case "subtract":
						submenuSubtract();
						flag = true;
						break;
						
					case "multiply":
						submenuMultiply();
						flag = true;
						break;
					case "divide":
						submenuDivide();
						flag = true;
						break;
					default: 
						System.out.println("Please type valid response");
						break;
				}
			} while(flag == false);
	}
	
	public static void submenuAdd() {
		boolean flag = true;
		double selection1 = 0, selection2 = 0;
		do {
			try {
				System.out.println("Pick a number: ");
				selection1 = Double.parseDouble(operatorInput.nextLine());
				System.out.println("Pick another number: ");
				selection2 = Double.parseDouble(operatorInput.nextLine());
				flag = false;
			} catch (NumberFormatException nfe) {
				System.out.println(nfe);
			}
		} while(flag);
		
		System.out.println(Calculator.add(selection1, selection2));
	}
	
	public static void submenuSubtract() {
		boolean flag = true;
		double selection1 = 0, selection2 = 0;
		do {
			try {
				System.out.println("Pick a number: ");
				selection1 = Double.parseDouble(operatorInput.nextLine());
				System.out.println("Pick another number: ");
				selection2 = Double.parseDouble(operatorInput.nextLine());
				flag = false;
			} catch (NumberFormatException nfe) {
				System.out.println(nfe);
			}
		} while(flag);
		System.out.println(Calculator.subtract(selection1, selection2));
	}
	
	public static void submenuMultiply() {
		boolean flag = true;
		double selection1 = 0, selection2 = 0;
		do {
			try {
				System.out.println("Pick a number: ");
				selection1 = Double.parseDouble(operatorInput.nextLine());
				System.out.println("Pick another number: ");
				selection2 = Double.parseDouble(operatorInput.nextLine());
				flag = false;
			} catch (NumberFormatException nfe) {
				System.out.println(nfe);
			}
		} while(flag);
		System.out.println(Calculator.multiply(selection1, selection2));
	}
	
	public static void submenuDivide() {
		boolean flag = true;
		double selection1 = 0, selection2 = 0;
		do {
			try {
				System.out.println("Pick a number: ");
				selection1 = Double.parseDouble(operatorInput.nextLine());
				System.out.println("Pick another number: ");
				selection2 = Double.parseDouble(operatorInput.nextLine());
				if (selection2 == 0) {
					System.out.println("Number cannot be zero\nPick another number:");
					selection2 = Double.parseDouble(operatorInput.nextLine());
				}
				flag = false;
			} catch (NumberFormatException nfe) {
				System.out.println(nfe);
			}
		} while(flag);
		Calculator.divide(selection1, selection2);
	}
}