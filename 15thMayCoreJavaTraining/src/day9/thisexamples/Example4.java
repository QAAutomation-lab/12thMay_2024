package day9.thisexamples;

public class Example4 {

	int age=25;//non-static global variable
	public static void main(String[] args) {
		System.out.println("Program starts");		
		Example4 ref=new Example4();
		System.out.println("Exampe4 object ref value is: "+ref);
		ref.display(50);
		System.out.println("Program ends");
	}
	
	void calling() {
		System.out.println("I am calling method and age is: "+age);
	}
	
	void display(int age) {
		System.out.println("I am display method and age is: "+age);
		System.out.println("NSGV age is: "+this.age);
		System.out.println("this keyword value is: "+this);
		//calling();
			//or
		this.calling();
	}
}
/*
this keyword:
	its is known as instance/object of current class
	it can be used only inside non-static method or constructor
	its use to access non-static members of the class(variable or method)
	mainly used when nonstatic method local variable name and nonstatic global variable name is same then to differentiate them we this keyword
*/