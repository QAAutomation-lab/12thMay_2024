package day15.interfaceExamples;
interface Sample1{
	/*
	 * Interface won't be having
	 * 	1. constructor
	 *  2. static method
	 *  3. non-abstract method 
	 */
	//variables -- by default public static final
	int age=25;//public static final int age=25;
	//method -- by default public abstract
	void calling();//public abstract void calling();
}
interface Sample2{
	/*
	 * Interface won't be having
	 * 	1. constructor
	 *  2. static method
	 *  3. non-abstract method 
	 */
	//method -- by default public abstract
	void display();//public abstract void display();
}
//subclass will use implements keyword instead of extends for inheritance, and it have to override all the abstract method of interface
public class Example2 implements Sample1,Sample2{
	public void calling() {
		System.out.println("I am calling you");
	}
	public void display() {
		System.out.println("I am displaying.....");
	}
	public static void main(String[] args) {
		//as interface is also incomplete hence its object can;t be created
		//Sample s1=new Sample();
		
		Example2 e1=new Example2();
		e1.calling();
		e1.display();
		System.out.println("Sample interface age is : "+Sample.age);
	}
}
/*
 * Multiple inheritance using classes is not possible in java but same can be achieved using interface
 */