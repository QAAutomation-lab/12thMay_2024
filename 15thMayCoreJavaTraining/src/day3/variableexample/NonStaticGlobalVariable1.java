package day3.variableexample;

public class NonStaticGlobalVariable1 {
	//nonstatic global variables
	int age;
	double salary=45000;
	boolean status;
	char grade;
	public static void main(String[] args) {
		System.out.println("Program starts");
		//to access nonstatic member first we need to load them into the memory using Object
//		NonStaticGlobalVariable1 ref;
//		ref=new NonStaticGlobalVariable1();
			//or
		NonStaticGlobalVariable1 r1=new NonStaticGlobalVariable1();//a copy of nonstatic member will be stored in this object
		System.out.println("NSGV age: "+r1.age);//0
		System.out.println("NSGV salary: "+r1.salary);//45000.0
		System.out.println("NSGV status: "+r1.status);//false
		System.out.println("NSGV grade: "+r1.grade);// 
		//re-initialization
		r1.age=25;
		r1.status=true;
		r1.grade='A';
		System.out.println("updated,NSGV age: "+r1.age);//25
		System.out.println("updated,NSGV salary: "+r1.salary);//45000.0
		System.out.println("updated,NSGV status: "+r1.status);//true
		System.out.println("updated,NSGV grade: "+r1.grade);//A
		
		NonStaticGlobalVariable1 r2=new NonStaticGlobalVariable1();//a copy of nonstatic member will be stored in this object
		System.out.println("NSGV age: "+r2.age);//0
		System.out.println("NSGV salary: "+r2.salary);//45000.0
		System.out.println("NSGV status: "+r2.status);//false
		System.out.println("NSGV grade: "+r2.grade);// 
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
	  * are also known as instance variable, because these members will be loaded into the memory at the time of
	  	execution when an instance/object is created.
	  * so in order to access nonstatic member first we need load them into the memory using instance/object of a class.
	  		instance/object: object is a real world entity which has its own behavior and functionality
	  				//declare a object
	  				 classname referencevariable;
	  				//initialize an object
	  				  referencevariable = new classname();
	  				  	//or
	  				// declaration and initialization of an object
	  				 classname referencevariable =new classname();
	  * we can access them in following ways-
	  		1. directly from any non-static method
	  		2. Standard: always use object reference to access them
	  				referencevariable.nonstaticglobalvariablename;
	  * for these member will have multiple memory allocation based on object creation
	  * Change made in one object won;t impact another object of current class
	  				
*/





















