package day20.predefinedclasses;

public class SystemClassExample2 {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");
		System.out.println("User Dir: "+currentWorkingDir);
		
		System.out.println(System.getProperty("user.home"));
		
		System.out.println(System.getProperty("java.home"));
		
		System.out.println(System.getProperty("user.name"));
		
		System.out.println(System.getProperty("os.name"));
		
		System.out.println(System.getProperty("os.version"));
		
		System.out.println(System.nanoTime());
		System.out.println(System.currentTimeMillis());
		
	}
}
