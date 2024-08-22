package day11.finalkeyword;
class Sample{
	static int num1=45;
	int num2=25;
}
public class Example9 {

	static int num1=75;
	int num2=95;
	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println("Example9 class num1 variable value is: "+Example9.num1);
		System.out.println("Sample class num1 variable value is: "+Sample.num1);
		
		Sample s1=new Sample();
		System.out.println("Sample class num2 variable value is: "+s1.num2);
		Example9 e1=new Example9();
		System.out.println("Example9 class num2 variable value is: "+e1.num2);
		System.out.println("Program ends");
	}

}
