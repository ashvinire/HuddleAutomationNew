package com.qa.pages.updated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class ScheduleTrip extends TestBase {

	
	

	
	
	private final String doneButton_xpath = "//span[contains(text(),'Done')]";
	
	
	
	public void openschedulePage() {
		
		driver.get("http://localhost:3000/scheduleTrip");
	}
	

     public void doneButton() {
	
	WebElement elementSighupButton = driver.findElement(By.xpath(doneButton_xpath));
	elementSighupButton.click();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
