package day15.interfaceExamples;
interface Sample{
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
//subclass will use implements keyword instead of extends for inheritance, and it have to override all the abstract method of interface
public class Example1 implements Sample{
	public void calling() {
		System.out.println("I am calling you");
	}
	public static void main(String[] args) {
		//as interface is also incomplete hence its object can;t be created
		//Sample s1=new Sample();
		
		Example1 e1=new Example1();
		e1.calling();
		System.out.println("Sample interface age is : "+Sample.age);
	}

}
