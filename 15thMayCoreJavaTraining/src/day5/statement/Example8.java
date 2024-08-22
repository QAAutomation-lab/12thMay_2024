package day5.statement;

public class Example8 {

	public static void main(String[] args) {
		
		int i=1;
		while(i<=5) {
			System.out.println("*************************"+i+"*********************");
			System.out.println("Welcome to Automation session");
			System.out.println("You are learning CoreJava");
			System.out.println("Will start selenium after this");
			System.out.println("Will also learn Framework in Selenium");
			i++;
		}
		
		System.out.println("#######################################");
		char ch='a';
		while(ch<='z') {
			System.out.print(ch+",");
			ch++;
		}
		System.out.println("\n#######################################");
		int num=10;
		while(num<=20) {
			if(num%2==0) {
				System.out.println("Even number is: "+num);
			}
			num++;
		}
		System.out.println("#######################################");
		int num1=7;
		while(num1<6) {
			System.out.println(num1);
		}
		
	}

}
