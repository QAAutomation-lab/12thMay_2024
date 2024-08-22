package day5.statement;

public class Example11 {

	public static void main(String[] args) {
		int month=1;
		switch(month) 
		{
			case 1:
				System.out.println("Month based in given number is Jan");
				break;
			case 2:
				System.out.println("Month based in given number is Feb");
				break;
			case 3:
				System.out.println("Month based in given number is Mar");
				break;
			case 11:
				System.out.println("Month based in given number is Nov");
				break;
			case 12:
				System.out.println("Month based in given number is Dec");
				break;
			default:
				System.out.println("Invalid month number");
				break;
		}
	}

}
