package Assignments;

public class Example8 {

	public static void main(String[] args) {
		int num=15,ct=0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				ct++;
			}
		}		
		if(ct==2) {
			System.out.println("Given number is prime");
		}else {
			System.out.println("Given number is not a prime");
		}
	}

}
/*
Program to Check Prime Number using a for loop

a number that can be divided max 2times (either by 1 or it self)

*/