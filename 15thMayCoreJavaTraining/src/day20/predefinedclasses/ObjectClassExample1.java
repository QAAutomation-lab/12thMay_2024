package day20.predefinedclasses;
class Demo{
	void calling() {
		System.out.println("I am calling you....");
	}
}
public class ObjectClassExample1 extends Demo{
	void display() {
		System.out.println("I am displaying....");
	}
	public static void main(String[] args) {
		ObjectClassExample1 ref1=new ObjectClassExample1();
		System.out.println("ref1: "+ref1);
		System.out.println("Ref1 address in integer: "+ref1.hashCode());
				//or
		//System.out.println("ref1: "+ref1.toString());
		
		ObjectClassExample1 ref2=new ObjectClassExample1();
		System.out.println("ref2: "+ref2.toString());
		System.out.println("Ref2 address in integer: "+ref2.hashCode());
		
		System.out.println("Ref1 compared with ref2: "+ref1.equals(ref2));
		
		
		ObjectClassExample1 ref3=ref1;
		System.out.println("ref3: "+ref3.toString());
		System.out.println("Ref3 address in integer: "+ref3.hashCode());
		System.out.println("Ref1 compared with ref3: "+ref1.equals(ref3));	
	}
}
/*
Object: super most class in java belongs to java.lang package which is by default available in all class 
		so no need to import it
it has several useful methods like:
	toString(): it gives us string representation of object, this method will be called automatically when any object
				reference is getting printed.
		return type: String
		access modifier: public 
				i.e. fullyqualifiedclassname@hexadecimaladdress
					 day20.predefinedclasses.ObjectClassExample1@hjhu689yhi9
	
	hashCode(): it converts hexadecimal address into integer
		return type: int
		access modifier: public
	
	equals(Object obj): its used to compare two objects based on address
		return type: boolean
		access modifier: public
	
	

*/