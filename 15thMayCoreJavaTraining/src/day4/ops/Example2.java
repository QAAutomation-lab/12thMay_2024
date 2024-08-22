package day4.ops;

public class Example2 {

	public static void main(String[] args) {
		int x=10,y;
		y=x;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		//Unary ops - pre & post increment
		y=++x;//(x=x+1)pre increment (1st operation and use updated value)
		System.out.println("updated x: "+x);
		System.out.println("updated y: "+y);
		
		x=10;//re-initialization
		int z=x++;//(x=x+1) post increment (1st use the value dn perform the operation)
		System.out.println("z: "+z);
		System.out.println("x: "+x);
		
		int a=-5,b,c;
		b=a++;//(a=a+1==>-5+1) post increment(1st use the value dn perform the operation)
		System.out.println("a: "+a);//-4
		System.out.println("b: "+b);//-5
		a=1;
		c=++a;//(a=a+1)pre increment(1st operation and use updated value)
		System.out.println("a: "+a);//2
		System.out.println("c: "+c);//2
	}

}
