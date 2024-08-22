package day16.accessmodifiers;
public class Sample {
	private int age=25;
	void calling() {
		System.out.println("I am calling from Sample class");
	}
	protected void printing() {
		System.out.println("I am print from Sample");
	}
	
	public void display() {
		System.out.println("I am display of Sample");
	}
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		System.out.println("age from Sample: "+s1.age);
		s1.calling();
	}

}
class Example1 {

	public static void main(String[] args) {
		Sample s1=new Sample();
		//will get compile time error
//		System.out.println("age from sample: "+s1.age);
		s1.calling();
		s1.printing();
	}

}
/*
private members: are accessible/visible till class where they are declared

default members: are accessible/visible till the package

protected members: are accessible/visible till the package, we can also access them from another package using inheritance

public member: are accessible/visible from anywhere
 	1. using import 
 	2. using fully qualified class name
*/