package Assignments;

public class Example9 {

	public static void main(String[] args) {
		int num=20;
		System.out.println("Factor of num: "+num);
		
		for(int i=1;i<=num;i++) {
			
			if(num%i==0){
				System.out.print(i+" ");
			}
		}
		System.out.println("\n********************************************");
		int num1=-20;
		for(int i=num1;i<=-(num1);i++) {
			
			if(i!=0) {
				if(num1%i==0){
					System.out.print(i+" ");
				}
			}
		}

	}

}
/*
Factors of a Positive Integer


*/