package day5.dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import reusableComponent.GenericFunctions;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("chrome");
		driver.get("https://demo.automationtesting.in/Register.html");		
		//step1: identify dropdown uniquely 
		WebElement skillDropDown=driver.findElement(By.id("Skills"));
		//setp2: create an instance of Select class and pass above dropdown to its constructor
		Select skillSelect=new Select(skillDropDown);
		
		System.out.println("is this dropdown allow multiple selection? "+skillSelect.isMultiple());
		System.out.println("Already selected value in dropdown: "+skillSelect.getFirstSelectedOption().getText());
		/*
		 * to select value from dropdown, you can use following-
		 * 		skillSelect.selectByIndex(index);
		 * 		skillSelect.selectByValue("");
		 * 		skillSelect.selectByVisibleText("");
		 */
		skillSelect.selectByIndex(2);
		System.out.println("After 1st selection using index, selected value in dropdown: "+skillSelect.getFirstSelectedOption().getText());
		
		skillSelect.selectByValue("AutoCAD");
		System.out.println("After 2nd selection using value, selected value in dropdown: "+skillSelect.getFirstSelectedOption().getText());
		
		skillSelect.selectByVisibleText("Backup Management");
		System.out.println("After 3rd selection using visibleText, selected value in dropdown: "+skillSelect.getFirstSelectedOption().getText());
		
		List<WebElement> skillList=skillSelect.getOptions();
		System.out.println("Skill count: "+skillList.size());
		
		for(int i=0;i<skillList.size();i++) {
			System.out.println(skillList.get(i).getText());
		}
			
	}
}
