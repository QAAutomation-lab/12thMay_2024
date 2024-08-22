package day9.thisexamples;

public class Example1 {

	static int age=25;//static global variable
	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println("SGV age is "+age);
		
		int age =10;//local variable
		System.out.println("local age is: "+age);//10
		
		System.out.println("SGV age is : "+Example1.age);
		System.out.println("Program ends");
	}
}
