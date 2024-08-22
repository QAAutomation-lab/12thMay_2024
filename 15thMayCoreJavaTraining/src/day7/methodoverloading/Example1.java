package day7.methodoverloading;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Program start");
		System.out.println("Program ends");
	}	
	
	static void main() {
		System.out.println("overload main method ");
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

can we do method overloading by change just a return type?	no
*/