package day4.multipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import reusableComponent.GenericFunctions;

public class Assignment_SwapLab {

	public static void main(String[] args) {
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("chrome");

		driver.get("https://www.saucedemo.com/");

		String userNames = driver.findElement(By.id("login_credentials")).getText();
		String[] userList = userNames.split("\n");

		for (int i = 1; i < userList.length; i++) {
			driver.findElement(By.id("user-name")).sendKeys(userList[i]);
			String password = driver.findElement(By.className("login_password")).getText();
			String[] passwordList = password.split("\n");
			driver.findElement(By.id("password")).sendKeys(passwordList[1]);
			driver.findElement(By.id("login-button")).click();
			if (driver.getCurrentUrl().contains("inventory.html")) {
				System.out.println("login sucessful with " + userList[i]);
				driver.findElement(By.id("react-burger-menu-btn")).click();
				driver.findElement(By.id("logout_sidebar_link")).click();
			} else {
				driver.findElement(By.id("user-name")).clear();
				driver.findElement(By.id("password")).clear();
			}
			System.out.println("*********************  "+i+"  ************************");
		}
	}

}
