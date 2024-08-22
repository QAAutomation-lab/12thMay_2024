package day3.variableexample;

public class Op1 {

	public static void main(String[] args) {
		int num1 = -5, num2 = -10;
		boolean res = (num1 == num2);
		System.out.println("Num1 and Num2 comparision using '==' " + res);// f
		System.out.println("Num1 and Num2 comparision using '==' " + (num1 == num2));// f
		System.out.println("Num1 and Num2 comparision using '<' " + (num1 < num2));// f
		System.out.println("Num1 and Num2 comparision using '>' " + (num1 > num2));// t
		System.out.println("Num1 and Num2 comparision using '<=' " + (num1 <= num2));// f
		System.out.println("Num1 and Num2 comparision using '>=' " + (num1 >= num2));// t
	}

}

/*
 * == use to compare two values are equal 
 * != use to compare two values are not
 * equal < LHS should smaller than 
 * RHS > LHS should greater than 
 * RHS <= LHS should smaller than equals 
 * RHS >= LHS should greater than equals RHS
 * 
 * 10==50 true false
 * 
 * LHS && RHS
 * 			true && true ==>true
 * 			false && true ==>false
 * 
 * LHS || RHS
 * 			true || true ==>true
 * 			false || true ==>true
 * 			false || false ==> false
 */