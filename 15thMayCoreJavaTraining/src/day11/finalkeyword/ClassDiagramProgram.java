package day11.finalkeyword;

public class ClassDiagramProgram {

	static int num1=75;
	int num2=95;
	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println("Example9 class num1 variable value is: "+ClassDiagramProgram.num1);
		ClassDiagramProgram e1=new ClassDiagramProgram();
		System.out.println("Example9 class num2 variable value is: "+e1.num2);
		System.out.println("Program ends");
	}

	int getNum(int num) {
		return num;
	}
	
	static boolean getStatus() {
		return true;
	}
}
