package day11.finalkeyword;

public class Example3 {

	public static void main(String[] args) {
		//final local variable
		final int age;
		System.out.println("Program starts");
		age=50;
		System.out.println("Age: "+age);
		//age=20;//you will get compile time error as final/constant variable value can;t be re-initialize
		System.out.println("Program ends");
	}
}
/*
constant variable: if you want to declare any variable as constant variable, then while declaring use
				   "final" keyword
				   
Local constant variable: variable should be declare with final keyword and should be initialize only once before use
Global constant variable: variable must be declared with final keyword and initialize at the same time

NOTE: 
	* final static global variable can declared and initialize later from static block only
	* final non-static global variable can declared and initialize later from 
		1. using non-static block
		2. using constructor
*/