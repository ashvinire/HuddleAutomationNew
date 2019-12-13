package com.qa.pages.updated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class GetDirections extends TestBase {

	
    
	
	private final String seeButton_xpath = "//span[contains(text(),'See Itinerary')]";
	
	

	
	
	
	public void openItineryPage() {
		
		driver.get("http://localhost:3000/getDirections");
	}
	
	
	
	
public void searchButton() {
		
		WebElement elementSighupButton = driver.findElement(By.xpath(seeButton_xpath));
		elementSighupButton.click();
	}
	



 

}
