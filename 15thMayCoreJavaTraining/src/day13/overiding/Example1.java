package day13.overiding;
class Vehicle{
	void color() {
		System.out.println("Vehicle is black");
	}
	void speed() {
		System.out.println("Vehicle speed will be set accordingly to its type");
	}
}
class Car extends Vehicle{
	@Override
	void color() {
		System.out.println("Car is while");
	}
	@Override
	void speed() {
		System.out.println("Car can run with 200km/hrs");
	}
	void gears() {
		System.out.println("Car has 4 gears");
	}
}
public class Example1 {
	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		v1.color();
		v1.speed();
		Car c1=new Car();
		c1.color();
		c1.speed();
		c1.gears();
	}
}
/*
Overriding:
	* when we declare a method in child class which is already present in parent then that method will be known as
	  overrided method.
	* Overriding is possible only with non-static method and inheritance is mandatory
	* RULEs:
		* method name and its parameter should be same
		* static method can't be overrided, because they won;t participate in inheritance
		* constructor can't be overrided
		* private method can't be overrided
		* final method can't be overrided
		* while overriding we can increate method visibility but we can't decrease
			parent class method ---> child class method
			default				---> default/protected/public	
			protected			---> protected/public
			public				---> public	
			
			private-->default--->protected--->public
*/