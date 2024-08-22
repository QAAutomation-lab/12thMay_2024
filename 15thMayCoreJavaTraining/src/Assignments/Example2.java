package Assignments;

public class Example2 {

	public static void main(String[] args) {
		int num1=10,num2=20,temp;
		System.out.println("num1 before swapping: "+num1);
		System.out.println("num2 before swapping: "+num2);
		temp=num1+num2;//30
		num1=temp-num1;//20
		num2=temp-num1;//10
		System.out.println("num1 after swapping: "+num1);
		System.out.println("num2 after swapping: "+num2);
	}
}
//Swap two numbers using temporary variable
/*
num1=10
num2=20


*/