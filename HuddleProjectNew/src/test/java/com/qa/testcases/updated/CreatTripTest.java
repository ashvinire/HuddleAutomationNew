package com.qa.testcases.updated;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.updated.CreatTrip;

public class CreatTripTest extends TestBase {
	
	public CreatTrip creatTrip;
	

	@BeforeClass
	public void setUp() {
		System.out.println("I am in BeforeTest");

		creatTrip = new CreatTrip();
		

		initialization();

	}
	@Test
	public void verifyCreateTripPage() throws InterruptedException {
		System.out.println("I am in verifyCreateTripPage");
			
		creatTrip.openCreatPage();
		
		creatTrip.tripTtitle();
		Thread.sleep(2000);	
					
		creatTrip.tripOrigin();
		Thread.sleep(2000);	
				
		creatTrip.creatTripButton();
		Thread.sleep(2000);	
				
	}
	
	
	
	@AfterTest
	public void tearDown() {
      closeAndKill();
	}

}
