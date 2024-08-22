package day15.interfaceExamples;
interface Demo10{
	void display();
	static void calling() {
		System.out.println("From Java8 onwords, static method is possible to have inside the interface");
	}
	default void printDetails() {
		System.out.println("From Java8 onwords, default method is possible to have inside the interface");
	}
	
//	default static void printDetails10() { //not possible
//		System.out.println("From Java8 onwords, default method is possible to have inside the interface");
//	}
}
public class Example4  implements Demo10{

	public void display() {
		System.out.println("I am displaying....");
	}
	public static void main(String[] args) {
		
		Demo10.calling();
		Demo10 e1=new Example4();
		e1.printDetails();
		e1.display();
	}
}
