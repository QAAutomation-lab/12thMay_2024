package day1.browserInstances;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
	}

}
/*
Scenario to Automate:
Launch a new Chrome browser.
Open https://demo.vtiger.com/
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if it is a correct page opened
Get Page Source (HTML Source code) and Page Source length
Close the Browser.

Scenario to Automate:
1. Launch the web browser.
2. Open the URL https://www.facebook.com in the current browser.
3. Fetching home page title.
4. Verify actual tile of the home page with the expected title.
5. Print home page title on the console.
6. Close the browser.





*/