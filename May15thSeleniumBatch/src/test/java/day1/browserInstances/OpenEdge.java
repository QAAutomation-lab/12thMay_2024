package day1.browserInstances;

import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdge {

	public static void main(String[] args) {
		
		//Create an instance of EdgeDriver class
		EdgeDriver cdriver=new EdgeDriver();
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