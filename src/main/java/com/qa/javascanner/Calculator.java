package com.qa.javascanner;



public class Calculator {
	public static double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double subtract(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}
	
	public static void divide(double num1, double num2) {
		double result = 0;
		try {
			result = num1 / num2;
			if (result == Double.POSITIVE_INFINITY ||
                    result == Double.NEGATIVE_INFINITY)
                throw new ArithmeticException();
			System.out.println(result);
		} catch (ArithmeticException ae) {
			System.out.println("You cannot divide by zero " + ae);
		}
	}
}
