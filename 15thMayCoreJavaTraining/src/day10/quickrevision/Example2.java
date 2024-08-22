package day10.quickrevision;

public class Example2 {

	Example2(){
		
		System.out.println("I am zero-param cons");
	}
	Example2(int num){
		this();
		System.out.println("I am int-param cons");
	}
	public static void main(String[] args) {
		System.out.println("Pragram Starts");
		Example2 e1=new Example2(25);
		System.out.println("Pragram Ends");
	}

}
