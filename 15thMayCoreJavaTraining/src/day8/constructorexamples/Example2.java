package day8.constructorexamples;

public class Example2 {
	
	//user defined constructor
	Example2(){
		System.out.println("I am zero-param cons..");
		age=25;
	}
	public static void main(String[] args) {		
		System.out.println("Program starts");
		//to access non-static member 1st create an instance of the class
		Example2 ref=new Example2();
		System.out.println("Age: "+ref.age);
		ref.testing();
		System.out.println("Program ends");
	}	
	void testing() {
		System.out.println("I am testing()...");
	}	
	int age;
}
/*
Constructor:
	* it is used to initialize non-static member of the class into the object memory
	* Constructor is similar to a method but its name should be same as classname and it won't be having 
	  any return statement
	* it will be automatically called when class instance/object is created
	* types:
		1. default constructor: when there is not constructor declared in the class body dn java compiler writes a
		   constructor with empty body that is know as default constructor.
		
		2. user defined constructor: when a programmer writes a constructor explicitly dn that will know as user defined
		   constructor



*/