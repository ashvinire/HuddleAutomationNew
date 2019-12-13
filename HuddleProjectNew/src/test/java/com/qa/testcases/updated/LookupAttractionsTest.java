package com.qa.testcases.updated;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.updated.GetDirections;
import com.qa.pages.updated.LookupAttractions;
import com.qa.pages.updated.ScheduleTrip;
import com.qa.pages.updated.TripDetails;

public class LookupAttractionsTest extends TestBase {
	
	public TripDetails tripDetails;
	public ScheduleTrip  scheduleTrip;
	public LookupAttractions lookupAttractions;
	public GetDirections  getDirections;
	
	
	
	
	
	@BeforeClass
	public void setUp() {
	System.out.println("I am in BeforeTest");

	lookupAttractions = new LookupAttractions();
	tripDetails = new TripDetails();
	scheduleTrip = new ScheduleTrip();
	getDirections = new GetDirections();
		

		initialization();

	}
	
	
	@Test
	public void verifyLookupAttractionsPage() throws InterruptedException {
		System.out.println("I am in Test");
		
		tripDetails.openTripDetailsPage();
		Thread.sleep(1000);
		
		tripDetails.letsgoButton();
		Thread.sleep(3000);
		
		//lookupAttractions.openlookupAttractionsPage();		
		
		lookupAttractions.searchAnything();
		Thread.sleep(2000);	
		
		lookupAttractions.searchButton();
		Thread.sleep(2000);	
				
		
        Actions dragTheElement = new Actions(driver);
		
		dragTheElement.clickAndHold(driver.findElement(By.xpath("//div[@id='3wtyFqrQmc4xpVDCLceuOw']//div//img[@class='icon_style']")))
		.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"))).release().build().perform();
		
		
		Thread.sleep(3000);
		
         Actions dragTheElement2 = new Actions(driver);
		
		dragTheElement2.clickAndHold(driver.findElement(By.xpath("//div[@id='3wtyFqrQmc4xpVDCLceuOw']//div//img[@class='icon_style']")))
		.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"))).release().build().perform();
		Thread.sleep(1000);		
		
		lookupAttractions.recommandButton();
		Thread.sleep(1000);	
		
		driver.navigate().to("http://localhost:3000/scheduleTrip");
		//driver.get("http://localhost:3000/scheduleTrip");
		//Thread.sleep(2000);
		scheduleTrip.doneButton();
		Thread.sleep(2000);
		
		getDirections.openItineryPage();
		Thread.sleep(4000);
				
		getDirections.searchButton();
		Thread.sleep(4000);
		
		driver.quit();
		
		
		
		
	}



	/*@AfterTest
	public void tearDown() {
		
		closeAndKill();
	}*/

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
