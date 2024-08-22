package day3.variableexample;

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("Progaram starts");
		/* Declare datatype - datatype variablename;*/
		byte byteVariable;
		short shortVariable;
		int intVariable;
		long longVariable;
		float floatVariable;
		double doubleVaribale;
		char charVariable;
		boolean booleanVariable;		
		/* Initialize variables- variablename=value; */
		byteVariable=10;//25 | 30 | -50 | -15
		shortVariable=20;//25 | 30 | -50 | -15
		intVariable=30;//25 | 30 | -50 | -15
		longVariable=40l;//25 | 30 | -50 | -15 | 40
		floatVariable=10.56f;//25 | 30 | -50 | -15 | 7.5f
		doubleVaribale=25.365d;//25 | 30 | -50 | -15 | 25.36f | -93.5
		charVariable='A';//'a' | 'D' | '%'
		booleanVariable=true;//false
		System.out.println("Program ends");
	}

}
/*
Variable points to the memory location where we can store the data based on datatype and 
whenever we want we can change its value hence its known as variable.

Syntax to declare a variable:
		datatype variablename;
Syntax to initialize a variable;
		variablename=value;
		
Syntac to declare and initialize a variable:
		datatype variablename = value;
	where:
		datatype: indicates, what type of value this variable is going to hold
			datatype:	
				1. primitive datatype-
					byte,short,int,long,float,double,char,boolean
				2. non-primitive datatype - classes
		
		variablename: identifier, name given by programmer
		
		value: literal
				type: 
					Boolean Literals 
					Integer Literals 
					Floating-point Literals
					Character Literals
					String literals


*/