package day4.ops;

public class Example1 {

	public static void main(String[] args) {
		int num1=25,num2,num3;
		//assigning num1 value to num2
		num2=num1;
		System.out.println("Number1:"+num1 );
		System.out.println("Number2:"+num2 );
		//assigning num1+1 value to num3
		num3=num1+1;
		System.out.println("Number1:"+num1 );//25
		System.out.println("Number3:"+num3 );//26
		
		num2=num2+1;
		System.out.println("Number2:"+num2 );//26
	}
}
