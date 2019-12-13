package com.qa.testcases.updated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

import com.qa.pages.updated.Home;
import com.qa.pages.updated.Login;

public class HomeTest extends TestBase {

	
	
	public Login login;
	public Home  home;
	
	@BeforeClass
	public void setUp() {
		
		
		System.out.println("I am in BeforeTest");
		
		login = new Login();
		home = new Home();
		
		initialization();
	}

	
	@Test
	public void verifyPlanTrippage() throws InterruptedException {
		
		
		
		home.openHome();
		

		//home.verifyLoginButn();
		//Thread.sleep(3000);
		
		//login.loginButton();
		//Thread.sleep(4000);	
		
		Actions chartHover = new Actions(driver);
		chartHover.moveToElement(driver.findElement(By.xpath("//div[@class='chartjs-size-monitor-expand']")))
		.build().perform();
		Thread.sleep(4000);
		
		
		//home.verifyTripLink();
		//Thread.sleep(3000);
		
		
		home.verifyButn1();
		Thread.sleep(3000);
	
		//home.verifyButn2();
		//Thread.sleep(3000);
			
		
		
	}
	
	@AfterTest
	public void tearDown() {
		closeAndKill();
       }
	
	
	
}
