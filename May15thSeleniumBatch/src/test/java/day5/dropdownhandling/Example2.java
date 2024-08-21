package day5.dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import reusableComponent.GenericFunctions;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("chrome");
		driver.get("https://omayo.blogspot.com/");		
		//step1: identify dropdown uniquely 
		WebElement dropDown=driver.findElement(By.id("multiselect1"));
		//setp2: create an instance of Select class and pass above dropdown to its constructor
		Select select=new Select(dropDown);
		
		System.out.println("is this dropdown allow multiple selection? "+select.isMultiple());
		List<WebElement> skillList=select.getOptions();
		System.out.println("Skill count: "+skillList.size());
		
		for(int i=0;i<skillList.size();i++) {
			System.out.println(skillList.get(i).getText());
		}
		/*
		 * to select value from dropdown, you can use following-
		 * 		select.selectByIndex(index);
		 * 		select.selectByValue("");
		 * 		select.selectByVisibleText("");
		 */
		select.selectByIndex(0);
		select.selectByValue("swiftx");
		select.selectByVisibleText("Audi");
		System.out.println("******************Options got selected**************************");
		List<WebElement> selectedOptions=select.getAllSelectedOptions();
		for(WebElement element: selectedOptions) {
			System.out.println(element.getText());
		}
		/*
		 * to deselect value from dropdown, you can use following-
		 * 		select.deselectByIndex(index);
		 * 		select.deselectByValue("");
		 * 		select.deselectByVisibleText("");
		 * 		select.deselectAll();
		 */
//		select.deselectByIndex(0);
//		select.deselectByValue("swiftx");	
//		select.deselectByVisibleText("Audi");
		select.deselectAll();
		selectedOptions=select.getAllSelectedOptions();
		System.out.println("After deselectAll, selected element count: "+selectedOptions.size());
	}
}
