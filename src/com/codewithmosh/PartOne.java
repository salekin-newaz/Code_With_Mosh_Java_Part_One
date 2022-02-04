package com.codewithmosh;

import java.awt.Point;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;


public class PartOne {

	public static void main(String[] args) {
		
//		Date now= new Date(0);
//		System.out.println(now);
	 
		
		
//		int x = 0;
//		int y = 0;
//		//int x,y;
//		Point point1= new Point( x, y);
//		Point point2= point1;
//		point1.x=2;
//		System.out.println(point2);
//		
//		String message= "      Hello \"Sami\"" + "this is string test";
//		///System.out.println(message.endsWith("this is string test"));
//		//System.out.println(message.length());
//		System.out.println(message.replace("Hello Sami", " Sami "));
//		System.out.println(message);
//		System.out.println(message.trim());
		
		
		//System.out.println(message);
		
		
		
//		int [] numbers= new int[5];
//		numbers[0]=1;
//		numbers[1]=2;
//		
//		System.out.println(Arrays.toString(numbers));
		
		
//		int [] numbers= {2,4,5,6,3,2};
//		//System.out.println(numbers.length);
//		Arrays.sort(numbers); 
//		System.out.println(Arrays.toString(numbers));
		
//		final float PI= 3.1416F;
//		//PI=(float) 3.21;
//		System.out.println(PI);
		
//		double result = (double)10/2;
//		System.out.println(result);
//		
		
//		//int x= 100+15*10/5; 
//		int x= (100+15)*10/5;
//		System.out.println(x);
		
//		NumberFormat currency= NumberFormat.getCurrencyInstance();
//		 String result =currency.format(1234567.892);
//		 System.out.println(result);
//		 
//		Scanner scanner= new Scanner(System.in); 
//		byte age= scanner.nextByte();
//		System.out.println("You are " +age);
		
		
		
		/*
		//Project
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		int principal = 0;
		float monthlyInterest = 0;
		int numberOfPayments = 0;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Principal: ");
			principal = scanner.nextInt();

			if (principal >= 1000 && principal <= 1_000_000)
				break;

			System.out.println("Enter a value between 1000 and 1000000");

		}

		while (true) {
			System.out.println("Annual Interest Rate: ");
			float annualInterest = scanner.nextFloat();

			if (annualInterest >= 1 && annualInterest <= 30) {
				monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
				break;
			}
			System.out.println("Enter a value between 1 and 30");

		}

		while (true) {
			System.out.println("Period(Year): ");
			byte years = scanner.nextByte();
			if (years >= 1 && years <= 30) {
				numberOfPayments = years * MONTHS_IN_YEAR;
				break;
			}
			System.out.println("Enter a value 1 and 30");
		}

		double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
				/ (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortgage: " + mortgageFormatted);
		
		*/
		
		
//		boolean hasHighIncome= true;
//		boolean hasHighCredit= true;
//		boolean isEligible= hasHighIncome || hasHighCredit;
//		
//		System.out.println(isEligible);
//		
		
		int income= 12000;
		boolean hasIncome= true;
		if(income>10000)
			hasIncome= true;
		else 
			hasIncome= false;
		
		System.out.println(hasIncome);
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		String number= scanner.next();
//		System.out.println(number);
		
//		String[] fruits= {"apple", "mango", "orange"};
//		for(String fruit : fruits) {
//			System.out.println(fruit);
//		}
		 
		
	}

}
