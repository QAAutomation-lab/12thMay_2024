package Assignments;

public class Example6 {

	public static void main(String[] args) {
		int num=123,rev=0,rem;
		System.out.println("Original number is: "+num);
		for(;num!=0;) {
			rem=num%10; //123%10=3 | 12%10=2 | 1%10=1
			rev=rev*10+rem;//0+3=3 | 3*10+2=32|320+1=321
			num=num/10; //123/10=12| 12/10=1 | 1/10=0
		}
		System.out.println("Reverse number is: "+rev);
	}

}
/*
Reverse a number using a for loop in Java

int num=123;// 100+20+3 --->321

	rem=num%10; //123%10=3
	rev=rev*10+rem;//0+3=3
	num=num/10; //123/10=12

*/