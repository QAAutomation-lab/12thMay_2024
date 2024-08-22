package day6.methods;

public class Method7 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//addTwoNumber();//you will get compile time error as we can;t access nonstatic member directly from static method
		
		//to access nonstatic member 1st load them into the memory using object creation
		Method7 ref=new Method7();
		ref.addTwoNumber();
		ref.addTwoNumberWithParam(25, 36);
		
		/*
		 * we can call a method having return type in following ways
		 * 	1. directly --> body will be execute but return value won;t be utilize
		 *  2. inside println() --> body will be execute and its return value will be print in the console
		 *  3. based on the return type create a variable and store method return value for future use
		 */
		
//		ref.simpleInterest(550000, 7.5, 5);
//		System.out.println(ref.simpleInterest(550000, 7.5, 5));
		
		double result=ref.simpleInterest(550000, 7.5, 5);
		System.out.println(result);		
		System.out.println("Program ends");
	}

	// write a method to add two numbers
	void addTwoNumber() {
		int num1 = 10, num2 = 20, res = num1 + num2;
		System.out.println("Number1 is: " + num1);
		System.out.println("Number2 is: " + num2);
		System.out.println("Result is: " + res);
	}

	void addTwoNumberWithParam(int num1, int num2) {// num1=20 num2=30 | int num1=a=15, int num2=b=25
		int res = num1 + num2;
		System.out.println("Number1 is: " + num1);
		System.out.println("Number2 is: " + num2);
		System.out.println("Result is: " + res);
	}

	// write a method to calculate simple interest
	double simpleInterest(int p, double r, int t) {
		System.out.println("Principle is: " + p);
		System.out.println("ROI is: " + r);
		System.out.println("Time is: " + t);
		double interest = (p * r * t) / 100;
		return interest;
	}

	// write a method to get reverse number of given number
	int getReverseNumber(int num) {
		int rev = 0, rem;
		System.out.println("Original number is: " + num);
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;
	}

}
/*
 * Method/function contains set of repetitive statements and whenever you want
 * to execute those statement just call the method.
 * 
 * To Access static member(static variable + static method)- 1. directly from
 * any static method 2. standard using classname
 * 
 * To Access nonstatic member(nonstatic variable + nonstatic method) 1. directly
 * from another nonstatic method 2. standard using object reference
 * 
 * when to use return type as void? when you don't want a method to return any
 * value or when you want to show/print some information only
 * 
 * when can you provide parameter to a method? when we want to perform some
 * logical operation and for each method call we need to provide different
 * values
 */