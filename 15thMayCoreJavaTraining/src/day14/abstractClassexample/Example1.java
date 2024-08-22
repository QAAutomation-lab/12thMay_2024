package day14.abstractClassexample;
abstract class Testing{
	/*
	 * abstract class is also known as incomplete class that mean, we can;t create its instance
	 * in this class we can have
	 * constructor
	 * variables
	 * methods
	 * 		1. abstract method: this will be declared with abstract keyword without body
	 * 		2. non-abstract method/normal method: this will be declared without abstract keyword with body
	 * 
	 * if class contains only abstract method then that class will be known as 100% abstract
	 * if class contains only non-abstract method then that class will be known as 0% abstract
	 * 
	 * if any java class contains even one abstract method in that case that class should be declared as abstract
	 * 
	 * when an abstract class is getting inherited by any subclass then there will be a contract between both the classes
	 * and the contract is the subclass has to override all the abstract method of abstract class. if subclass don;t follow
	 * the contract then as per inheritance rule abstract method of parent class will be virtually present in child class
	 * which mean we won;t be allowed to create an instance of child class as well.
	 * while overriding abstract keyword will be removed
	 */
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
