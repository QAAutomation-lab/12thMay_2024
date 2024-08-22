package day24.propertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Example1 {

	public static void main(String[] args) throws IOException {
	/*
	 * file path: 
	 * 		absolute path: starting from the root till the target element
	 * 				i.e: F:\Workplaces\CoreJava_Workspace\15thMayCoreJavaTraining\TestData\AppData.properties
	 *		relative path: start from the middle
	 *				i.e: .\TestData\AppData.properties			
	 *				where:
	 *				'.' indicates current working directory -> F:\Workplaces\CoreJava_Workspace\15thMayCoreJavaTraining
	 *
	 *				String currentDir=System.getProperty("user.dir");//F:\Workplaces\CoreJava_Workspace\15thMayCoreJavaTraining
	 */
		
		String filePath="F:\\Workplaces\\CoreJava_Workspace\\15thMayCoreJavaTraining\\TestData\\AppData.properties";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		//now you can read data of property file by passing required key into getProperty(String key)
		String name=prop.getProperty("username");
		System.out.println("name: "+name);
		
		System.out.println("password: "+prop.getProperty("password"));
		System.out.println("email: "+prop.getProperty("email"));
		System.out.println("Mobile number: "+prop.getProperty("number"));
	}

}
