package day3.variableexample;

public class Example3 {

	public static void main(String[] args) {
		//declaring variables
		int num1;
		int num2;
		int sum;
		//initializing variables
		num1=10;
		num2=20;
		sum=num1+num2;		
		System.out.println("Number1 is = "+num1);
		System.out.println("Number2 is = "+num2);
		System.out.println("Addition of two number is = "+sum);	
		System.out.println("**************************************");
		//re-initialization
		num1=30;
		num2=15;
		sum=num1-num2;
		System.out.println("Number1 is = "+num1);
		System.out.println("Number2 is = "+num2);
		System.out.println("Subs of two number is = "+sum);	
		System.out.println("**************************************");
		//re-initialization
		sum=num1*num2;
		System.out.println("Number1 is = "+num1);
		System.out.println("Number2 is = "+num2);
		System.out.println("Multi of two number is = "+sum);	
		System.out.println("**************************************");
		//re-initialization
		num2=5;
		sum=num1/num2;
		System.out.println("Number1 is = "+num1);
		System.out.println("Number2 is = "+num2);
		System.out.println("Div of two number is = "+sum);
		System.out.println("**************************************");
		//re-initialization 21/5=
		num1=21;
		num2=5;
		sum=num1/num2;
		System.out.println("Number1 is = "+num1);
		System.out.println("Number2 is = "+num2);
		System.out.println("Div of two number is = "+sum);
		System.out.println("**************************************");
		//re-initialization 21/5=
		num1=21;
		num2=5;
		sum=num1%num2;
		System.out.println("Number1 is = "+num1);
		System.out.println("Number2 is = "+num2);
		System.out.println("Mod of two number is = "+sum);
	}
}
/*
Number1 is = 10
Number2 is = 20
Addition of two number is = 30


completeNumber/completeNumber = completeNumber;
21/5=4

incompleteNumber/completeNumber = incompleteNumber;
21.0/5=4.2

completeNumber/incompleteNumber = incompleteNumber;
21/5.0=4.2
*/