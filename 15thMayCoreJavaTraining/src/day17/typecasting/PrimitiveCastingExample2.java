package day17.typecasting;

public class PrimitiveCastingExample2 {

	public static void main(String[] args) {
		calling(123);
		System.out.println(cal(25.35f, 20));
	}
	
	static void calling(long num) {//long num=123; implicit widening
		System.out.println("I am calling on "+num);
	}
	
	static int cal(double d,int num) {//double d=25.35f; implicit widening
		double res=d+num;
		return (int)res;//Narrowing explicit
	}
}
