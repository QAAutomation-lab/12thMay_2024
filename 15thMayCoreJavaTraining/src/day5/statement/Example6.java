package day5.statement;

public class Example6 {

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) {
			System.out.println("*************************"+i+"*********************");
			System.out.println("Welcome to Automation session");
			System.out.println("You are learning CoreJava");
			System.out.println("Will start selenium after this");
			System.out.println("Will also learn Framework in Selenium");
		}
		System.out.println("##################################################");
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println("##################################################");
		for(int i=5;i>=0;i--) {
			System.out.println(i);
		}
		System.out.println("#################################################");
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("###################### A to Z ###########################");
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch+",");
		}
		System.out.println("\n############################################################");
		for(char ch='A';ch<='Z';ch++) {
			if(ch=='A' ||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				System.out.println(ch);
			}
		}
	}
}
/*
i=1
	step1: 1<=5 | 2<=5 | 3<=5 | 4<=5 | 5<=5 | 6<=5
	step2:	Welcome to Automation session
			You are learning CoreJava
			Will start selenium after this
			Will also learn Framework in Selenium
			Welcome to Automation session
			You are learning CoreJava
			Will start selenium after this
			Will also learn Framework in Selenium
			Welcome to Automation session
			You are learning CoreJava
			Will start selenium after this
			Will also learn Framework in Selenium
			Welcome to Automation session
			You are learning CoreJava
			Will start selenium after this
			Will also learn Framework in Selenium
			Welcome to Automation session
			You are learning CoreJava
			Will start selenium after this
			Will also learn Framework in Selenium
	step3: i=2 | i=3 | i=4 | i=5 | i=6


*/