package day9.thisexamples;

public class Example5 {

	Example5(){
		System.out.println("I am zero-param cons..");
	}
	Example5(int num){
		System.out.println("I am int-param cons..");
	}
	Example5(double num){
		System.out.println("I am double-param cons..");
	}
	Example5(int num1,double num2){
		System.out.println("I am int-double-param cons..");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example5 ref1=new Example5();
		Example5 ref2=new Example5(25);
		Example5 ref3=new Example5(25000.36);
		Example5 ref4=new Example5(25,65000.54);
		System.out.println("Program ends");
	}
}
/*
this() statement:
	its also know as current class instance
	it can be only used inside the constructor body and its should be first statement inside the constructor body
	its used to call another constructor of current class based on the parameter/argument
*/