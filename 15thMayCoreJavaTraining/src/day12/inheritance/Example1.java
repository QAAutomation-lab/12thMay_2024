package day12.inheritance;
class Demo1{
	//default constructor
	static int age=25;
	int salary=45000;
}
class Demo2{
	//default constructor
	void calling() {
		System.out.println("I am calling method");
	}
	static void display() {
		System.out.println("I am display method");
	}
}
public class Example1 {
	//default constructor
	int age=30;
	void show() {
		System.out.println("I am show method");
	}
	public static void main(String[] args) {
		//accessing static member of class Demo1 and Demo2
		System.out.println("Demo1, static variable age is: "+Demo1.age);
		Demo2.display();
		//accessing non-static member of class Demo1, Demo2, Example1
		Demo1 d1=new Demo1();
		System.out.println("Demo1, nonstatic variable salary: "+d1.salary);
		Demo2 d2=new Demo2();
		d2.calling();
		Example1 e1=new Example1();
		System.out.println("Example1, nonstatic variable age: "+e1.age);
		e1.show();
	}
}
