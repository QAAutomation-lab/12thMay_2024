package day3.variableexample;

public class Op2 {

	public static void main(String[] args) {
		int num1 = -5, num2 = 0;
		boolean res1=((num1<num2) && (num2<num1));// -5<0 (t) && 0<-5(f)
		boolean res2=((num1>=num2) || (num2<=num1));// -5>=0(f) || 0<=-5(f)
		
		System.out.println("result1: "+res1);//f
		System.out.println("result2: "+res2);//t
		
	}
}
/*
 * == use to compare two values are equal != use to compare two values are not
 * equal < LHS should smaller than RHS > LHS should greater than RHS <= LHS
 * should smaller than equals RHS >= LHS should greater than equals RHS
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