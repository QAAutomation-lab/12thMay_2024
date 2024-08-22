package day21.predefinedclasses2;
final class Testing{
	final String name;
	final double salary;
	Testing(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
}
public class Example1 {

	public static void main(String[] args) {
		Testing t1=new Testing("Selenium",45000.56);
		System.out.println(t1.getName());
		System.out.println(t1.getSalary());
//		t1.name="Pune"; // compile time error as these variables are declared as final
//		t1.salary=55000.56;// compile time error as these variables are declared as final

		Testing t2=new Testing("Pune",55000.56);
		System.out.println(t2.getName());
		System.out.println(t2.getSalary());
	}

}
/*
 * Immutable class: to create immutable class, we should have following-
 * 	1. class and data variables should be declared as final
 * 	2. using constructor parameter above final variables should be initialize
 * 	3. create public getter method to access these final variable
 * 
 * 
 */
