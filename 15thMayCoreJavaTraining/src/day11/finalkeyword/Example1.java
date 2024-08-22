package day11.finalkeyword;

public class Example1 {
	static int num1;
	int num2;	
	static {
		calling();
		System.out.println("**************I am SIB-1*****************");
		num1=25;
		calling();
	}	
	{
		display();
		System.out.println("**************I am NSIB-1*****************");
		num2=50;
		display();
	}
	
	static void calling() {
		System.out.println("I am calling method and SGV num1 is: "+num1);
	}
	void display() {
		System.out.println("I am display method and NSGV num2 is: "+num2);
	}
	public static void main(String[] args) {
		System.out.println("Programs Starts");
		Example1 ref=new Example1();
		System.out.println("Programs Ends");
	}
}
