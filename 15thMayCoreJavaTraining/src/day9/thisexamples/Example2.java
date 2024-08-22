package day9.thisexamples;

public class Example2 {

	int age=25;//non-static global variable
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example2 ref=new Example2();
		ref.calling();
		ref.display(50);
		System.out.println("Program ends");
	}
	
	void calling() {
		System.out.println("I am calling method and age is: "+age);
	}
	
	void display(int age) {
		System.out.println("I am display method and age is: "+age);
		Example2 e1=new Example2();
		System.out.println("NSGV age is: "+e1.age);
	}
}
/*
this keyword:
	its is known as instance/object of current class
	it can be used only inside non-static method or constructor
	its use to access non-static members of the class(variable or method)
	mainly used when nonstatic method local variable name and nonstatic global variable name is same



*/