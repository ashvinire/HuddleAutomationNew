package com.qa.testcases.updated;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.updated.SignUp;
import com.qa.pages.updated.TripDetails;

public class TripDetailsTest extends TestBase {

	public TripDetails tripDetails;
			
	
	@BeforeClass
	public void setUp() {
	System.out.println("I am in BeforeTest");

	tripDetails = new TripDetails();
		

		initialization();

	}
	@Test
	public void verifyTripDetailsPage() throws InterruptedException {
		System.out.println("I am in Test");
		
		
		tripDetails.openTripDetailsPage();
		Thread.sleep(1000);
		
		tripDetails.letsgoButton();
		Thread.sleep(3000);
			
		//tripDetails.thumbButton();
		//Thread.sleep(2000);	
		
		
		
		
	}



	@AfterTest
	public void tearDown() {
		
		closeAndKill();
	}

}
	
	

