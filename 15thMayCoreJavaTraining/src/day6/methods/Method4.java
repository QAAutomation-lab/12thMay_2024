package day6.methods;

public class Method4 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int x=123;
		/* when you directly call method having return type, then you will able to execute method body but 
		 * you won;t get its return value
		 */
		//getReverseNumber(x);
		
		/*
		 * When you call a method having return type with in println() then you will be able to execute its body
		 * as well as you will be able to print its return value
		 */
		//System.out.println("Reverse number is: "+getReverseNumber(x));
		
		/*
		 * when you want to store method return value for future use then based on the method return type create a
		 * variable and store method return value in that variable
		 */
		int temp=getReverseNumber(x);
		System.out.println("Reverse number is: "+temp);
		System.out.println("Program ends");
	}
	
	//write a method to get reverse number of given number
	static int getReverseNumber(int num) {
		int rev=0,rem;
		System.out.println("Original number is: "+num);
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
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