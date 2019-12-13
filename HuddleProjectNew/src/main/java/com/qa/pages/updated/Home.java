package com.qa.pages.updated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class Home extends TestBase {

	
	
	private final String buttonLetsPlan_xpath = "//span[contains(text(),\"Let's plan your trip\")]";
	
	private final String buttonJoin_xpath = "//span[@class='MuiButton-label'][contains(text(),'Join')]";
	private final String tripLink_xpath = "//div[contains(text(),'My Trips')]";
	
	
	private final String buttonLogin_xpath = "//span[contains(text(),'Login')]";
	
	public void openHome() {
		driver.get("http://localhost:3000/");
	}
	
	
	public void verifyLoginButn() {
		WebElement elementButon = driver.findElement(By.xpath(buttonLogin_xpath));
		elementButon.click();
	}
	

	
	public String verifyTripLink() {
		
		WebElement elementButon = driver.findElement(By.xpath(tripLink_xpath));
		elementButon.click();
		return elementButon.getText();
	}
	
	
	
public void verifyButn1() {
	WebElement elementButon = driver.findElement(By.xpath(buttonLetsPlan_xpath));
	elementButon.click();
}


public void verifyButn2() {
	WebElement elementButon = driver.findElement(By.xpath(buttonJoin_xpath));
	elementButon.click();
}










	
}
