package day17.typecasting;

public class PrimitiveCastingExample1 {

	public static void main(String[] args) {
		int num=25;		
		//widening Examples
		double num1=num;//lower to higher -->widening -implicit --> compiler will do --> double num1=(double)num;
		double num2=(double)num;//lower to higher -->widening -explicit
		System.out.println("num: "+num);
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
		float num3=25.36f;
		double num4=num3;//implicit widening
		double num5=(double)num3;//explicit widening
		System.out.println("num3: "+num3);
		System.out.println("num4: "+num4);
		System.out.println("num5: "+num5);
		
		//Narrowing examples - only explicit
		double x=25.66;
		//int y=x;//compile time error as narrowing is not possible implicitly
		
		int y=(int)x;//narrowing- explicit - data loss & size
		long z=(long)x;//narrowing- explicit - data loss
		float p=(float)x;//narrowing- explicit - size
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("z: "+z);
		System.out.println("p: "+p);
	}
}
