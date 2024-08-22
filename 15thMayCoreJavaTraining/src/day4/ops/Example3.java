package day4.ops;

public class Example3 {

	public static void main(String[] args) {
		
		int x=10,y;		
		y=x--;// post decrement(1st use value dn perform operation)
		System.out.println("x: "+x);//9
		System.out.println("y: "+y);//10
		x=10;//re-initialization
		y=--x;// pre decrement(1st perform operation fn use update value)
		System.out.println("x: "+x);//9
		System.out.println("y: "+y);//9
	}

}
