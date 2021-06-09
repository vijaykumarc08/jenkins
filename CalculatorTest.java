package com.jenkins;

public class CalculatorTest {
	
	public static void main(String args[]) {
		Calculator c = new Calculator();
		
		//c.subtract(10,2);
		//c.multiply(5, 5);
		//c.divide(10, 2);
		System.out.println("addition result is "+ c.add(10, 5));
		System.out.println("subtraction result is "+ c.subtract(10, 5));
	//	System.out.println("multiplication result is "+ c.multiply(5, 10));
	//	System.out.println("division result is "+ c.divide(5, 10));
	}

}
