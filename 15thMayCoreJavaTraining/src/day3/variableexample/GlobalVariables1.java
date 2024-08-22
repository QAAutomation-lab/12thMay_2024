package day3.variableexample;

public class GlobalVariables1 {
	
	int num1=25,num2=50;
	static double result;
	public static void main(String[] args) {
		//result=num1+num2;
		System.out.println("Program starts");
		//to access nonstatic member 1st create an instance
		GlobalVariables1 ref=new GlobalVariables1();
		System.out.println("NSGV num1: "+ref.num1);
		System.out.println("NSGV num2: "+ref.num2);
		
		result=ref.num1+ref.num2;
		System.out.println("Result : "+result);
		System.out.println("Program ends");
	}

}
