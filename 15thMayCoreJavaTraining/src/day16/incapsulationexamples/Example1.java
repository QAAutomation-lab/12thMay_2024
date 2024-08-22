package day16.incapsulationexamples;
class Encap{
	private int age=25;
	private double salary=45000;
	/*
	 * getter: this method will help us to access private data member from outside the class
	 * 		access modifier: public
	 * 		return type: should be same as required variable data type
	 * 		name: ideally it starts from get
	 * 		parameter: NA
	 * 		return value: should return required variable
	 */
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	/*
	 * setter: this method will help us to modify private data member from outside the class
	 * 		access modifier: public
	 * 		return type: should be void
	 * 		name: ideally it starts from set
	 * 		parameter: should be same as required variable data type
	 * 		return value: NA
	 */
	public void setAge(int age) {
		this.age=age;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
}
public class Example1 {

	public static void main(String[] args) {
		Encap e1=new Encap();
		//you will get compile time error if you directly try to access private data member of Encap class
//		System.out.println(e1.age);
//		System.out.println(e1.salary);		
		System.out.println("Using getter concept, private age from Example1 class: "+e1.getAge());
		System.out.println("Using getter concept, private salary from Example1 class: "+e1.getSalary());
		e1.setAge(50);
		e1.setSalary(85000);
		System.out.println("updated,Using getter concept, private age from Example1 class: "+e1.getAge());
		System.out.println("updated,Using getter concept, private salary from Example1 class: "+e1.getSalary());
	}
}
