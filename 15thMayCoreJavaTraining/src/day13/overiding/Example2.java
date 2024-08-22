package day13.overiding;
class Person{
	void talking() {
		System.out.println("Person is talking in english");
	}
	void eating() {
		System.out.println("Person can eat fruits");
	}
}
class Men extends Person{	
	//virtual method/inherited method : talking()	
	@Override
	void eating() {
		System.out.println("Men can eat wadapav");
	}	
	void sports() {
		System.out.println("Men play football");
	}
}
public class Example2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("**************Object and referenace of Person class*********************");
		Person obj1=new Person();
		obj1.talking();
		obj1.eating();
		System.out.println("**************Object and referenace of Men class*********************");
		Men obj2=new Men();
		obj2.talking();
		obj2.eating();
		obj2.sports();
		System.out.println("**************Object of Men class and referenace of Person class*********************");
		Person obj3=new Men();//talking() - Person | eating() -Men | sport() -Men
		obj3.talking();
		obj3.eating();
		System.out.println("Program Ends");
	}
}
/*
 * Virtual/inherited method: a method which coming from parent class is know as Virtual/inherited method
 * 
 * 
 */
