package day8.constructorexamples;
public class Example5 {	
	int age;
	double salary;
	//user defined constructor- constructor overloading
	Example5(){
		System.out.println("I am zero-param cons..");
	}
	Example5(int num){
		System.out.println("I am int-param cons..");
		age=num;
	}
	Example5(double num){
		System.out.println("I am double-param cons..");
		salary=num;
	}
	Example5(int num1,double num2){
		System.out.println("I am int-double-param cons..");
		age=num1;
		salary=num2;
	}
	public static void main(String[] args) {		
		System.out.println("Program starts");
		Example5 ref1=new Example5();
		System.out.println("age with ref1: "+ref1.age);
		System.out.println("salary with ref1: "+ref1.salary);
		System.out.println("**********************************");
		Example5 ref4=new Example5(25);
		System.out.println("age with ref4: "+ref4.age);
		System.out.println("salary with ref4: "+ref4.salary);
		System.out.println("**********************************");
		Example5 ref3=new Example5(25000.56);
		System.out.println("age with ref3: "+ref3.age);
		System.out.println("salary with ref3: "+ref3.salary);
		System.out.println("**********************************");
		Example5 ref2=new Example5(10,20000.56);
		System.out.println("age with ref2: "+ref2.age);
		System.out.println("salary with ref2: "+ref2.salary);
		System.out.println("Program ends");
	}	
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

Parameterized constructor: will help you to initialize each instance/object with different values

Constructor Overloading:
	when a class contains more then one constructor then those constructor will be known as overloaded constructor
	rule:
		diff in no of parameter or 
		diff in type of parameter or
		diff in position of parameter
		
why constructor overloading?
	with this we initialize each object with diff values based on requirement

can we have both default and user define constructor together in a single class? No
*/