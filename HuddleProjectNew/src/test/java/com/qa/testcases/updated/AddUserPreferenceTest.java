package com.qa.testcases.updated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

import com.qa.pages.updated.AddUserPreference;



public class AddUserPreferenceTest extends TestBase  {

	public AddUserPreference addUserPreference;
	
	
	@BeforeClass
	public void setUp() {
		System.out.println("I am in BeforeTest");
		addUserPreference = new AddUserPreference();
		initialization();
	}
	
	@Test
	public void verifyAddTrippage() throws InterruptedException {
		
		addUserPreference.openaddUserPreferencePage();
		
		
		
		/*WebElement slider = driver.findElement(By.xpath("//span[@class='MuiSlider-thumb MuiSlider-thumbColorPrimary PrivateValueLabel-open-234 PrivateValueLabel-thumb-233']"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(slider).moveByOffset(200, 200).release().perform();
		slider.click();
		Thread.sleep(4000);*/
		
		addUserPreference.budgetSlider();
		Thread.sleep(4000);
		
		addUserPreference.clickSearch();
		Thread.sleep(2000);
		addUserPreference.verifyCategory();
		Thread.sleep(2000);
		
		addUserPreference.clickSearchA();
		Thread.sleep(2000);
		addUserPreference.verifyCategory1();
		Thread.sleep(2000);
		
		addUserPreference.clickSearchB();
		Thread.sleep(2000);
		addUserPreference.verifyCategory2();
		Thread.sleep(2000);
				
		addUserPreference.recommendButton();
		Thread.sleep(4000);
	
		//addUserPreference.skipButton();
		//Thread.sleep(4000);
		
		
	}

	
	@AfterTest
	public void tearDown() {
		closeAndKill();
       }
}