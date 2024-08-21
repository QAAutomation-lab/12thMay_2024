package day2.objectIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import reusableComponent.GenericFunctions;
import reusableComponent.SeleniumUtility;
public class LoginIntoOrnageHRM2  {

	public static void main(String[] args) {
		
WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("chrome");
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		//Identify email input field & perform required action i.e type email id
		driver.findElement(By.id("Email")).sendKeys("tester01@vomoto.com");
		
		//identify password input field & perform required action i.e type password
		driver.findElement(By.name("Password")).sendKeys("Abc@12345");
		
		//identify login button & perform required action i.e click
		driver.findElement(By.className("login-button")).click();
		
		String expectedUrlContent="login";
		String currenUrl=driver.getCurrentUrl();
		System.out.println("Home page validation status: "+(!currenUrl.contains(expectedUrlContent)));
	}
}
/*
open chrome browser
enter application url as https://demowebshop.tricentis.com/login
enter emailid as tester01@vomoto.com
enter password as Abc@12345
click on login button
validation home page
*/