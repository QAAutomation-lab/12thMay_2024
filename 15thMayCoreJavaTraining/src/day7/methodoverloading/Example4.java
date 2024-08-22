package day7.methodoverloading;

public class Example4 {

	public static void main(String[] args) {
		calling();
		Example4 e1=new Example4();
		e1.printing();
	}
	
	static void calling() {
		displayDetails();
		System.out.println("calling without number");
		//displayDetails();
	}
	
	static void displayDetails() {
		System.out.println("You are in automation session");
	}

	void printing() {
		empDetails();
		System.out.println("Printing personal details");
		//empDetails();
	}
	
	void empDetails() {
		System.out.println("Showing emp details");
	}
}
