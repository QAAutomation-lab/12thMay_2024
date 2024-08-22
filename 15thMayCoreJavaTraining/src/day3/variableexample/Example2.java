package day3.variableexample;

public class Example2 {

	public static void main(String[] args) {
		
		System.out.println("Progaram starts");
		/* Declare datatype */
		byte byteVariable;
		short shortVariable;
		int intVariable;
		long longVariable;
		float floatVariable;
		double doubleVaribale;
		char charVariable;
		boolean booleanVariable;		
		/* Initialize variables */
		byteVariable=10;//25 | 30 | -50 | -15
		shortVariable=20;//25 | 30 | -50 | -15
		intVariable=30;//25 | 30 | -50 | -15
		longVariable=40l;//25 | 30 | -50 | -15 | 40
		floatVariable=10.56f;//25 | 30 | -50 | -15 | 7.5f
		doubleVaribale=25.365d;//25 | 30 | -50 | -15 | 25.36 | -93.5
		charVariable='A';//'a' | 'D'
		booleanVariable=true;//false
		
		System.out.println("byteVariable");//byteVariable
		System.out.println(byteVariable);//10		
		System.out.println("byteVariable = "+byteVariable);//byteVariable = 10
		//TODO: print remaining variables
		
		System.out.println("Program ends");
	}

}
/*

+ : addition
	number1+number2=number3
	10+20=30

+ : Concatenation
 	String+number=String
 	"Hello"+10=Hello10
 	"Hi"+10+20+30=Hi102030
 	10+20+30+"Hi"=60Hi
 	10+20+"Hi"+(20+30)=30Hi50
 
*/