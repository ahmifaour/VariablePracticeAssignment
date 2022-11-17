package com.perscholas.java_basics;

public class JavaBasicsClass {

		public static void main(String[] args) {
		
			addNumbers();
			addDoubles();
			addDoubleInt();
			divideNumbers();
			divideDoubles();
			integerLetterVariables();
			constantQuestion();
			coffeeStore();
		
		}
		
		public static void addNumbers() {
			
			int num1= 10;
			int num2= 20;
			
			int result = num1+num2;
			
			System.out.println("Results: " + result);
		}
	
		public static void addDoubles() {
			
			double num3= 4.5;
			double num4= 5.5;
			
			double result1= num3+num4;
			
			System.out.println("Result: " + result1);	
		}
		public static void addDoubleInt() {
			
			int num5= 6;
			double num6= 5.0;
			
			double result2= num5+num6;
			
			System.out.println("Result: " + result2);
		}
		
		public static void divideNumbers()	{
		
			int num7=36;
			int num8=6;
			
			int result3=num7/num8;
			
			System.out.println("Result: " + result3);
		}
		
		public static void divideDoubles() {
			
			double num9 = 90.0;
			double num10= 10.0;
			
			double result4= num9/num10;
			
			System.out.println("Result: " + result4);
		}
		
		public static void integerLetterVariables() {
			
			int x = 2;
			double y = 6.0;
			double q = (y/x);
			
			System.out.println("Result for 'q': " + q);
			
		}
		
		public static void constantQuestion() {
			
			final int NUM11= 10;
			int num12= 5;
			
			int result5= NUM11+num12;
			
			System.out.println("Result: " + result5);
			
		}
		
		public static void coffeeStore() {
			
			double mocha = 4.75d;
			double matchalatte = 5.65d;
			double bagel = 3.50d;
			
			double subtotal = ((3 * mocha) + (4 * matchalatte) + (2 * bagel));
			final double SALES_TAX= 5.0;
			double totalSale = subtotal + SALES_TAX;
			
			System.out.println("Total amount spent:" + totalSale);
		}
	}



