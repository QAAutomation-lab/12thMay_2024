package day10.quickrevision;

public class BlockExample2 {
	{
		System.out.println("**********NSIB-1****************");
	}
	
	BlockExample2(){
		System.out.println("I am zero-param cons......");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		BlockExample2 ref1=new BlockExample2();
		System.out.println("===================================");
		BlockExample2 ref2=new BlockExample2();
		System.out.println("Program ends");
	}
	{
		System.out.println("**********NSIB-2****************");
	}
}

/*
 {
 	//block
 }

block are two types
	1.static block or static initialization block(SIB): 
	  * when programmer want to provide additional information before method starts execution that time he use static block
	  * its won;t be having any name hence it will be executed before main()
	  * a class can have more than one static block in such cases all static block will be executed in sequential order
	
		static{
			//statements
		}
	
	2.non-static block or non-static initialization block(NSIB) or instance initialization block(IIB)
	  * when we want to provide some information before an instance of call is created then we use non-static block
	  * nonstatic block will be executed for each object creation before constructor
	  * a class can have more than one non-static block in such cases all non-static block will be executed in 
	  	sequential order for each object creation
		{
			//statements
		}


*/