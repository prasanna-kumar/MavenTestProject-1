package com.calculator;
import java.util.*;
public class Calculator {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=10,b=20;
		System.out.println("a + b = " + add(a, b));
		System.out.println("a - b = " + subtract(a,b));
		System.out.println("a * b = " + multiply(a,b));
		System.out.println("a / b = " + divide(a,b));
	}

	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int subtract(int a, int b) {
		return a - b;
	}

	public static long multiply(int a, int b) {
		return a * b;
	}

	public static double divide(int a, int b) {
		double result;
		if (b == 0) {
			throw new IllegalArgumentException("Divisor cannot divide by zero");
		} else {
			result = Double.valueOf(a)/Double.valueOf(b);
		}
		return result;
	}
}
