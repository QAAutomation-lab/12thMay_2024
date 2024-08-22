package day5.statement;

public class Example7 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
		}
		System.out.println("##########################");
		int i=1;
		for( ;i<=5;) {
			i++;
			System.out.println("Hello");
		}
		System.out.println("############################");
		for(int x=5;x>=5;x++) {
			System.out.println("Bye");
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