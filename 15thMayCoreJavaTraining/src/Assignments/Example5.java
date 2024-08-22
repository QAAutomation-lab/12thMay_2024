package Assignments;

public class Example5 {

	public static void main(String[] args) {
		int num=123,ct=0;
		
		for(;num!=0;) {
			num=num/10;//123/10=12 | 12/10=1 | 1/10=0
			ct++;//1 | 2 | 3
		}
		System.out.println("Number of digits in given number is: "+ct);
	}

}
/*
Count Number of Digits in an Integer using for loop



*/