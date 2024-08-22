package day9.thisexamples;

public class Example7 {

	Example7(){
		this(90);
		System.out.println("I am zero-param cons..");
	}
	Example7(int num){
		System.out.println("I am int-param cons..");
	}
	Example7(double num){
		this(25,256.02);
		System.out.println("I am double-param cons..");
	}
	Example7(int num1,double num2){
		this();
		System.out.println("I am int-double-param cons..");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");		
		Example7 ref3=new Example7(25000.36);
		System.out.println("Program ends");
	}
}
/*
 * int-param
 * zero-param
 * int-double-param
 * double-param
 */

/*
this() statement:
	its also know as current class instance
	it can be only used inside the constructor body and its should be first statement inside the constructor body
	its used to call another constructor of current class based on the parameter/argument
*/