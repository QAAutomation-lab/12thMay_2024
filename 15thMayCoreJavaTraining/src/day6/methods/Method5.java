package day6.methods;

public class Method5 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		//System.out.println("Interest: "+simpleInterest(550000, 8.5, 5));
		
		int p=550000;
		double res=simpleInterest(p, 8.5, 5);
		System.out.println("Interest is: "+res);
		
		double finalAmount=p+res;
		System.out.println("Final amount: "+finalAmount);
		System.out.println("Program ends");
	}
	
	//write a method to calculate simple interest
	static double simpleInterest(int p,double r,int t) {
		System.out.println("Principle is: "+p);
		System.out.println("ROI is: "+r);
		System.out.println("Time is: "+t);
		double interest=(p*r*t)/100;
		return interest;
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