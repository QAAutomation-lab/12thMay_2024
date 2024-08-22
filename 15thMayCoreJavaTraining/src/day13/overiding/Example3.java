package day13.overiding;
class Maharastra {
	int itCompanies=120;
	void famousFor() {
		System.out.println("Financial Capital of India");
	}
}
class Pune extends Maharastra{
	int itCompanies=55;
	void famousFor() {
		System.out.println("Pune is known for IT");
	}
	
	void famousFood() {
		System.out.println("Pune is famous for Misal");
		System.out.println("Pune IT companies :"+itCompanies);//55
		famousFor();//its will execute Pune class method
		
		//to access parent class member you can create instance of parent class and access its all non-static member
		Maharastra obj=new Maharastra();
		System.out.println("Maharastra IT companies: "+obj.itCompanies);
		obj.famousFor();
	}
}
public class Example3 {

	public static void main(String[] args) {
		
		Pune obj3=new Pune();
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