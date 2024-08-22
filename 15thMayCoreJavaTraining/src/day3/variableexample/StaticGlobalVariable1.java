package day3.variableexample;

public class StaticGlobalVariable1 {
	//static global variables
	static int age=25;
	static double salary;
	static boolean status;
	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println("SGV age: "+age);//25
		System.out.println("SGV salary: "+salary);//0.0
		System.out.println("SGV status: "+status);
		age=50;
		salary=555000.5;
		status=true;
		System.out.println("updated, SGV age: "+age);//50
		System.out.println("updated, SGV salary: "+salary);//555000.5
		System.out.println("updated, SGV status: "+status);
		System.out.println("Program ends");
	}
}
/*
Global variable: 
any variable declared outside the method/constructor body but present in class body know as global variable.
	a. static global variable/class variable - declared with static keyword know static global variable
		* are also known as class member, because these member will be loaded into the memory at the time of
		  compilation when '.class' file is getting generated.
	    * these variables can be access from any where.
	    * we can access these variable in following ways
	    	1. directly from any method
	    	2. Standard: we need to use classname to access them
	    			classname.staticglobalvariablename;
	    * Memory: these members will get separate memory only once
	    * if these variables are declare but not initialize and you are trying to access them then you will get
	      default value based on datatype.
	      		byte,short,int,long =0
	      		float, double =0.0
	      		char = (blank space)
	      		boolean=false
			
			
	
	
	
	b. non-static global variable/instance variable - declared without static keyword know nonstatic global variable
*/