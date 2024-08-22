package day17.typecasting;
class Fruit{
	void shape() {
		System.out.println("Fruits are round in shape");
	}
}
class Apple extends Fruit{
	void taste() {
		System.out.println("Apple are sweet in taste");
	}
	void shape() {
		System.out.println("Apple are round in shape");
	}
}
public class NonPrimitiveCastingExample1 {

	public static void main(String[] args) {
		Fruit f1=new Fruit();
		f1.shape();
		
		Apple a1=new Apple();
		a1.taste();
		a1.shape();
		System.out.println("*********Up casting***************");
		Fruit ref=new Apple();//implicit/auto up casting | Fruit ref=(Fruit)new Apple();
		ref.shape();
		//ref.taste();// not accessible as Fruit class has only shape() method
		
		//Fruit ref2=(Fruit)new Apple();//explicit
		
		Fruit ref2=(Fruit)a1;//explicit up casting | Fruit ref2=(Fruit)a1; -->Fruit ref2=(Fruit)new Apple();
		ref2.shape();
		//ref2.taste();// not accessible as Fruit class has only shape() method
		
		System.out.println("*********Down casting***************");
		//Apple ref3=new Fruit();//down casting is not possible directly (implicit down casting is not possible)
		
		Apple ref4=(Apple)ref;//down casting is possible only for up casted object using explicit way
		ref4.shape();
		ref4.taste();
	}
}
