package day6.methods;

public class Method2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//calling static method directly from another static method
		printDetails();
		System.out.println("**********************************");
		//calling static method using standard approach i.e using classname
		Method2.printDetails();
		System.out.println("Program ends");
	}

	public static void printDetails() {
		System.out.println("Welcome to Automation Session");
		System.out.println("You are learning Automation with Java");
		System.out.println("Currenty you are in CoreJava Session");
		System.out.println("After this will start Selenium");
	}
	
}
/*
Method/function contains set of repetitive statements and whenever you want to execute those statement just call the 
method.

To Access static member(static variable + static method)-
	1. directly from any static method
	2. standard using classname

when to use return type as void?
	when you don't want a method to return any value or when you want to show/print some information only
*/