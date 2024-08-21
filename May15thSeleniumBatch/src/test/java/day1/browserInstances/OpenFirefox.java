package day1.browserInstances;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		
		//Create an instance of FirefoxDriver class
		FirefoxDriver cdriver=new FirefoxDriver();
	}
}
/*
Selenium opens new browser for each execution, it won;t work on already opened browser
Browser opened by selenium don't be having-
	- no download history
	- no browser history
	- no cache
	- no cookies
	- no plugins
*/