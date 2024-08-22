package day3.variableexample;

public class Variabletype 
{
	//global variables
	int age=25; //non-static global variable
	static double salary=45000;	//static global variable
	public static void main(String[] args)
	{
		//local variables
		int num1=10,num2;
		System.out.println("Number1: "+num1);
		//System.out.println("Number2: "+num2);// compile time error as its not initialized
	}
}
/*
type of variables:
	1. local variable: any variable declared inside the method/constructor body know as local variable
			visibility/accessibility: with in method/constructor body
			static: no static keyword
			memory: they won;t get separate memory allocation
			default value: no default value will be assigned if they are not initialized, you will get compile time error
						if you will use them without initialization
	
	2. global variable: any variable declared outside the method/constructor body but present in class body know as global
			variable.
			a. static global variable/class variable - declared with static keyword know static global variable
			b. non-static global variable/instance variable - declared without static keyword know nonstatic global variable




*/