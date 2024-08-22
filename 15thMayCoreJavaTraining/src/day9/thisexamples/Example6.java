package day9.thisexamples;

public class Example6 {

	Example6(){
		System.out.println("I am zero-param cons..");
	}
	Example6(int num){
		this();
		System.out.println("I am int-param cons..");
	}
	Example6(double num){
		this(25);
		System.out.println("I am double-param cons..");
	}
	Example6(int num1,double num2){
		this(25000.56);
		System.out.println("I am int-double-param cons..");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
//		Example6 ref1=new Example6();
//		Example6 ref2=new Example6(25);
//		Example6 ref3=new Example6(25000.36);
		
		Example6 ref4=new Example6(25,65000.54);
		System.out.println("Program ends");
	}
}
/*
this() statement:
	its also know as current class instance
	it can be only used inside the constructor body and its should be first statement inside the constructor body
	its used to call another constructor of current class based on the parameter/argument
*/