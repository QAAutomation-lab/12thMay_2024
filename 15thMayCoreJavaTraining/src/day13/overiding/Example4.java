package day13.overiding;
class Maharastra101 {
	void famousFor() {
		System.out.println("Financial Capital of India");
	}
}
class Pune101 extends Maharastra101{
	void famousFor() {
		System.out.println("Pune is known for IT");
	}
}
public class Example4 {

	public static void main(String[] args) {
		Maharastra101 obj1=new Maharastra101();
		obj1.famousFor();
		
		Pune101 obj2=new Pune101();
		obj2.famousFor();
		
		Maharastra101 obj3=new Pune101();
		obj3.famousFor();//overrided behavior of famousFor()
	}
}
