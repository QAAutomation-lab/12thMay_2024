package day6.methods;

public class Method6 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println(checkPrimeNumber(5));
		System.out.println(checkPrimeNumber(15));
		System.out.println(checkPrimeNumber(51));
		
		printEvenNumberFromRange(15, 50);
		System.out.println("Program ends");
	}
	
	//WAM to check prime number
	static boolean checkPrimeNumber(int num) {
		
		int ct=0,i=1;
		boolean result;
		while(i<=num) {
			if(num%i==0) {
				ct++;
			}
			i++;
		}
		if(ct==2) {
			result=true;
		}else {
			result=false;
		}
		return result;
	}
	
	//WAM to print even number between given range
	static void printEvenNumberFromRange(int start,int end) {
		System.out.println("Start number "+start);
		System.out.println("End number "+end);
		for(;start<=end;start++) {
			if(start%2==0) {
				System.out.println("Even number is: "+start);
			}
		}
	}
	
}
/*
Method/function contains set of repetitive statements and whenever you want to execute those statement just call the 
method.

To Access static member(static variable + static method)-
	1. directly from any static method
	2. standard using classname

when to use return type as void?
	when you don't want a method to return any value or when you want to show/print some information only

when can you provide parameter to a method?
	when we want to perform some logical operation and for each method call we need to provide different values
*/