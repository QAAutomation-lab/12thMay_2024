package day9.thisexamples;

public class Example3 {

	int age=25;//non-static global variable
	public static void main(String[] args) {
		System.out.println("Program starts");
		
		Example3 ref=new Example3();
		ref.calling();
		ref.display(50);
		System.out.println("Program ends");
	}
	
	void calling() {
		System.out.println("I am calling method and age is: "+age);
	}
	
	void display(int age) {
		System.out.println("I am display method and age is: "+age);
//		Example3 e1=new Example3();
//		System.out.println("NSGV age is: "+e1.age);
			//or
		System.out.println("NSGV age is: "+this.age);
	}
}
/*
this keyword:
	its is known as instance/object of current class
	it can be used only inside non-static method or constructor
	its use to access non-static members of the class(variable or method)
	mainly used when nonstatic method local variable name and nonstatic global variable name is same



*/