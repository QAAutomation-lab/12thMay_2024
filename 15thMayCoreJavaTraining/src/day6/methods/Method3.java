package day6.methods;

public class Method3 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//calling static method directly from another static method
		addTwoNumber();
		//calling static method using standard approach i.e using classname
		Method3.addTwoNumber();
		
		addTwoNumberWithParam(20, 30);
		addTwoNumberWithParam(50, 70);
		int a=15,b=25;
		addTwoNumberWithParam(a, b);
		
		System.out.println("Program ends");
	}
	
	//write a method to add two numbers
	static void addTwoNumber() {
		int num1=10,num2=20,res=num1+num2;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Result is: "+res);
	}
	static void addTwoNumberWithParam(int num1,int num2) {//num1=20 num2=30 | int num1=a=15, int num2=b=25
		int res=num1+num2;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Result is: "+res);
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

when can you provide parameter to a method?
	when we want to perform some logical operation and for each method call we need to provide different values
*/