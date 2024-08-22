package day13.overiding;
class Maharastra1 {
	int itCompanies=120;
	void famousFor() {
		System.out.println("Financial Capital of India");
	}
}
class Pune1 extends Maharastra1{
	int itCompanies=55;
	void famousFor() {
		System.out.println("Pune is known for IT");
	}
	
	void famousFood() {
		System.out.println("Pune is famous for Misal");
		System.out.println("Pune IT companies :"+itCompanies);//55
		famousFor();//its will execute Pune class method
		
		//to access parent class member you can create instance of parent class and access its all non-static member
//		Maharastra obj=new Maharastra();
//		System.out.println("Maharastra IT companies: "+obj.itCompanies);
//		obj.famousFor();
		
		//instead of create instance of parent we can use "super" keyword
		System.out.println("Maharastra IT companies: "+super.itCompanies);
		super.famousFor();
	}
}
public class Example5 {

	public static void main(String[] args) {
		
		Pune1 obj3=new Pune1();
		obj3.famousFood();
	}
}
/*
super keyword:
	* its known as parent/super class instance 
	* it should be used only inside constructor or non-static method of child class to call/access
	  its parent/super class non-static member
	* mainly used when child/sub-class non-static member name is same as parent/super class nonstatic member
*/