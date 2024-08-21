package day6.keyboardAndMouseOps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import reusableComponent.GenericFunctions;

public class KeyboardExample2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("chrome");
		
		driver.get("https://online.actitime.com/uts/login.do");
		//type user name
		driver.findElement(By.id("username")).sendKeys("admin01",
														Keys.chord(Keys.CONTROL,"a"),
														Keys.chord(Keys.CONTROL,"c"));
		//type password and press enter button
		driver.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL,"v"),
													Keys.ENTER);
	}
}
