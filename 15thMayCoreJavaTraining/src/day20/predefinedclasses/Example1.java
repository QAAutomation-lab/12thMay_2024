package day20.predefinedclasses;
class Demo101{
	void display() {
		System.out.println("I am display()..");
	}
}
public class Example1 extends Demo101{
	static int last_roll = 100;
	int roll_no;
	Example1()
    {
        roll_no = last_roll;
        last_roll++;
    }
	// Driver code
	public static void main(String args[]) {
		
		Demo101 d1=new Demo101();
		System.out.println(d1);//d1.toString();--->day18.predefinedclasses.objectclass.Demo@234567DFGHJ
		Demo101 d3=new Demo101();
		System.out.println(d3.toString());	//--->day18.predefinedclasses.objectclass.Demo@2345656kjkDFGHJ	
		System.out.println("*************************************");
		Example1 s = new Example1();
		// Below two statements are equivalent
		System.out.println(s);//java complier writes-->s.toString() -->string representation of an object--> FQCN@hexadecimaladdress
		System.out.println(s.toString());//string representation of an object
		System.out.println("***********************************");
		Demo101 d2=new Example1();
		System.out.println(d2);	//
		System.out.println("***********************************");
		System.out.println(new Example1());
	}
}
/**
 * string representation---> fullyqualifiedclassname@hexadecimaladdress	
 * 							 packagename.classname@hexadecimaladdress
 * 
 */
