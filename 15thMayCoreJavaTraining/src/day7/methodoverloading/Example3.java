package day7.methodoverloading;

public class Example3 {

	public static void main(String[] args) {
		//can we do overloading by just change method return type?
		/*
		 * No: you will get compile time error
		 */
	}	
	
	void calling() {
		System.out.println("Calling without number");
	}
	
	int calling() {
		System.out.println("calling with return type int");
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