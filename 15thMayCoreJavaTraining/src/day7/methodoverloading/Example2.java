package day7.methodoverloading;

public class Example2 {

	public static void main(String[] args) {
		addNumber();
		System.out.println("**************************");
		addNumber(15.50,25);
		System.out.println("**************************");
		addNumber(15,25);
		System.out.println("**************************");
		addNumber(15,25.36);
	}	
	static void addNumber() {
		int num1=10,num2=20,res=num1+num2;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Result is: "+res);
	}	
	static void addNumber(int num1,int num2) {
		int res=num1+num2;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Result is: "+res);
	}	
	static void addNumber(double num1,int num2) {
		double res=num1+num2;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Result is: "+res);
	}
	static void addNumber(int num1,double num2) {
		double res=num1+num2;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Result is: "+res);
	}
}
/*
Method Overloading:
	when we declare a method more then once in class with different set of parameters then those method will be 
	known as overloaded method
	
	different set of parameters:
		1. diff in type of parameter or
		2. diff in number of parameter or
		3. diff in position of parameter
		
can we overload static methods ? yes
can we overload nonstatic methods ? yes

can we overload main()? yes
*/