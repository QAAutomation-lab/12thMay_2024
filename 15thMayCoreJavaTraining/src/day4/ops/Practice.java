package day4.ops;

public class Practice {
	int result;
	static int sum;
	public static void main(String[] args) {
		System.out.print("Hello\n\t");
		System.out.println("Hello");
		int a=10,b=20,c;
		c=a+b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		System.out.println("sum: "+sum);
		sum=a+b;
		System.out.println("sum: "+sum );
		
		Practice p1=new Practice();
		p1.result=a+b;
		System.out.println("result: "+p1.result);
	}
	

}
