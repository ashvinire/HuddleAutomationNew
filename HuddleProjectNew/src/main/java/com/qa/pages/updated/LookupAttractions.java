package com.qa.pages.updated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class LookupAttractions extends TestBase {

	
    private final String searchAny_xpath = "//input[@placeholder='Search…']";
	
	private final String searchButton_xpath = "//*[@class='MuiSvgIcon-root']";
	
	
	private final String recommandButton_xpath = "//span[contains(text(),'Recommend')]";
	
	
	
	public void openlookupAttractionsPage() {
		
		driver.get("http://localhost:3000/tripDetails?tripId=r0vlBZLVMPo7mCCGva58");
		
		//driver.get("http://localhost:3000/lookupAttractions");
	}
	
	
	
	public void searchAnything() {
		
		WebElement elementEditEmail = driver.findElement(By.xpath(searchAny_xpath));		
		elementEditEmail.sendKeys("wine");
	}  
	

	
public void searchButton() {
		
		WebElement elementSighupButton = driver.findElement(By.xpath(searchButton_xpath));
		elementSighupButton.click();
	}
	

public void recommandButton() {
	
	WebElement elementSighupButton = driver.findElement(By.xpath(recommandButton_xpath));
	elementSighupButton.click();
}


	

	
}
