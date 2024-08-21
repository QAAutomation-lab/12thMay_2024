package day2.objectIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusableComponent.GenericFunctions;
public class LoginIntoOrnageHRM {

	public static void main(String[] args) {
		
		WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("chrome");
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		/** enter emailid as tester01@vomoto.com
			Step1: identify the required element using findElement(By)
					findElement(By)- use to identify the element using "By" class and this class has 
					predefined methods which are also known as locators and return the WebElement.

							WebElement element=driver.findElement(By.id(""));
																	.name(""));
																	.linkText(""));
																	.className(""));
																	.partialLinkText(""));
																	.tagName(""));
																	.cssSelector(""));
																	.xpath(""));						
			Step2: once you identify the WebElement you can perform required operation it
						a. type text  			----> sendkeys("");
						b. delete existing text ----> clear();
						c. click on element     ----> click();
						
						element.sendkeys("amdin");
						element.clear();
						element.click();	
		 */
		
		//Identify email input field
		WebElement emailIdInputField=driver.findElement(By.id("Email"));
		//perform required action i.e type email id
		emailIdInputField.sendKeys("tester01@vomoto.com");
		
		//identify password input field
		WebElement passwordInputField=driver.findElement(By.name("Password"));
		//perform required action i.e type password
		passwordInputField.sendKeys("Abc@12345");
		
		//identify login button
		WebElement loginButton=driver.findElement(By.className("login-button"));
		//perform required action i.e click
		loginButton.click();
		
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