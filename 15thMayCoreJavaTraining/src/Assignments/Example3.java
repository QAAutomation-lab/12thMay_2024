package Assignments;

public class Example3 {

	public static void main(String[] args) {
		int yr=3000;
		
		if((yr%4==0 && yr%100!=0) || (yr%400==0)) 
		{
			System.out.println("Given year is leap year: "+yr);
		}else {
			System.out.println("Given year is not a leap year: "+yr);
		}

	}

}
/*
Java Program to Check a Leap Year

yr=2020

	(yr%4==0 & yr%100!=0) || (yr%400==0)




*/