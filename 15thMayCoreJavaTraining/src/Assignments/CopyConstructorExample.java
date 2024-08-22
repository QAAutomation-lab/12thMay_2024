package Assignments;

public class CopyConstructorExample {
	int num1,num2;
	CopyConstructorExample(int x,int y){
		num1=x;
		num2=y;
	}
	
	CopyConstructorExample(CopyConstructorExample c1){
		num1=c1.num1;
		num2=c1.num2;
	}
	
	public static void main(String[] args) {
		
		CopyConstructorExample ref1=new CopyConstructorExample(10,20);
		System.out.println("num1 using ref1 object: "+ref1.num1);
		System.out.println("num2 using ref1 object: "+ref1.num2);
		ref1.num1=100;
		ref1.num2=200;
		
		CopyConstructorExample ref2=new CopyConstructorExample(ref1);
		System.out.println("num1 using ref2 object: "+ref2.num1);
		System.out.println("num2 using ref2 object: "+ref2.num2);
	}

}
/*
when we need a exact copy of existing object we use copy constructor concept
*/