package day21.predefinedclasses2;
class SeleniumTesting{
	String name="Pune";
	private SeleniumTesting() {
		System.out.println("I am SeleniumTesting class cons");
	}
	private static SeleniumTesting ref=new SeleniumTesting();
	
	public static SeleniumTesting getInstance() {
		return ref;
	}
}
public class Example2 {

	public static void main(String[] args) {
	//	SeleniumTesting s1=new SeleniumTesting();//compile time error as its constructor is defined as private
		
		SeleniumTesting s1=SeleniumTesting.getInstance();
		System.out.println("name with referenace s1 "+s1.name);
		s1.name="Bangalore";
		System.out.println("updated name with referenace s1 "+s1.name);
		
		SeleniumTesting s2=SeleniumTesting.getInstance();
		System.out.println("name with referenace s2 "+s2.name);
	}

}
/*
To Create Singleton class refer below points:
	Create class constructor as private
	Create static private instance of current class
	Create static method which should returns object of current class



*/