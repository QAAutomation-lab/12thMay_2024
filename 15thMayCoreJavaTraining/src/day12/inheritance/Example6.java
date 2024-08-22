package day12.inheritance;
class GrandFather1{
	void home() {
		System.out.println("GrandFather1's home");
	}
}
class GrandFather2{
	void car() {
		System.out.println("GrandFather1's car");
	}
}

class Child1 extends GrandFather1,GrandFather2{
	//Multiple inheritance using class is not possible in java
	
	//default constructor with super()
}
public class Example6 {
	public static void main(String[] args) {
		Child1 c1=new Child1();
	}
}
/*
when child class trying to inherit more than one parent class property then that will be know as multiple inheritance

but in java multiple inheritance using classes is not possible because for inheritance constructor chaining is required
in this child class constructor calls immediate parent class constructor but due to multiple inheritance child class
constructor get confuse with parent name hence its not possible

*/