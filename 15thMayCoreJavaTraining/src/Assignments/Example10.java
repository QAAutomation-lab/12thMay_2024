package Assignments;

public class Example10 {

	public static void main(String[] args) {
		char ops = '%';
		int num1 = 10, num2 = 5, res;

		switch (ops) {
		case '+':
			res = num1 + num2;
			System.out.println("Addition of two number is: " + res);
			break;
		case '-':
			res = num1 - num2;
			System.out.println("Sub of two number is: " + res);
			break;
		case '*':
			res = num1 * num2;
			System.out.println("Multi of two number is: " + res);
			break;
		case '/':
			res = num1 / num2;
			System.out.println("Div of two number is: " + res);
			break;
		default:
			System.out.println("Invalid operator");
			break;
		}

	}

}
