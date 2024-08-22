package day20.predefinedclasses;
class Testing{
	void calling() {
		System.out.println("I am Testing class calling");
	}
}
public class SystemClassExample {

	static Testing ref=new Testing();//static reference variable ref
	
	public static void main(String[] args) {
//		Testing ref=new Testing();
//		ref.calling();
		
		SystemClassExample.display();
		
		SystemClassExample.ref.calling();
		//classname.staticrefVariableOfTestingClass.nonstaticMethodOfTestingClass
		
		System.out.println("Hello");
		//classname.staticrefVariableOfPrintStreamClass.nonstaticMethodOfPrintStreamClass
		
		System.err.println("I am error msg");
	}
	
	static void display() {
		System.out.println("I am display of SystemClassExample");
	}

}
