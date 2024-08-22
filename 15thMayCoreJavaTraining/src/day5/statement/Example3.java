package day5.statement;

public class Example3 {

	public static void main(String[] args) {
		int age=18;
		char bldGrp='A';
		if(age>=18) 
		{
			System.out.println("Welcome, you are eligible for next checkup");
			if(bldGrp=='B') 
			{
				System.out.println("You are allowed to donate your blood");
			}
			else 
			{
				System.out.println("Sorry, your bldgrp doesn;t matched");
			}
		}
		else 
		{
			System.out.println("Sorry, you age is below 18");
		}
	}

}
/*
char ch='A';
*/