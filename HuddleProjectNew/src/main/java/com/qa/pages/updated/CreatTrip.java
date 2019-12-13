package com.qa.pages.updated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class CreatTrip extends TestBase {
	
	private final String tripTitle_xpath = "//input[@id='tripTitle']";
	private final String tripOrigin_xpath = "//input[@id='origin']";
	private final String button_xpath =    "//span[contains(text(),'Create Trip')]";
	
	
	public void openCreatPage() {
		driver.get("http://localhost:3000/createTrip");
	}
	
	
	
	public void tripTtitle() {
		
		WebElement elementEditEmail = driver.findElement(By.xpath(tripTitle_xpath));		
		elementEditEmail.sendKeys("Splashing Winter");
	}
	
public void tripOrigin() {
		
		WebElement elementEditEmail = driver.findElement(By.xpath(tripOrigin_xpath));		
		elementEditEmail.sendKeys("San Jose, CA");
	}
	
	
	
	public void creatTripButton() {
		WebElement elementAlreadyMem = driver.findElement(By.xpath(button_xpath));
		elementAlreadyMem.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}