package day4.ops;

public class Example4 {

	public static void main(String[] args) {
		int x=10,y;
		
		y=x + ++x + x++ + x + --x;		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		//TODO:
		x=5;
		y=--x + x-- + ++x + x + x++ + --x;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		x=-3;
		y=--x + x-- + --x + x-- + x++ + ++x;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		x=11;
		y=x++ + --x + x++ + x-- + ++x + ++x;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}

}
