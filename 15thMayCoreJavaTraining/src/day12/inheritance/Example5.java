package day12.inheritance;
class Vehicle{
	//default constructor
	void color() {
		System.out.println("Vehicle is black");
	}
}
class Bike extends Vehicle{
	//default constructor with super()
	void wheels(int ct) {
		System.out.println("bike has "+ct+" wheels");
	}
}
class Car extends Vehicle{
	//default constructor with super()
	void wheels(int ct) {
		System.out.println("Car has "+ct+" wheels");
	}
}
public class Example5 {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.color();
		c1.wheels(4);
		Bike b1=new Bike();
		b1.color();
		b1.wheels(2);
	}

}
