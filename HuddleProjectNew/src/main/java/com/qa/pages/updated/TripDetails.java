package com.qa.pages.updated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class TripDetails extends TestBase  {


	private final String thumbEnter_xpath = "//p[contains(text(),'1')]";

	private final String letsgoButton_xpath = "//span[contains(text(),\"Let's Go Plan\")]";

	private final String firstTrip_xpath = "//div[contains(text(),'My Trips')]/div[1]";





	public void openTripDetailsPage() {
		//driver.get("http://localhost:3000/tripDetails?tripId=8ot6YslnCWG2EfP8oOMc");
		
		driver.get("http://localhost:3000/tripDetails?tripId=r0vlBZLVMPo7mCCGva58");
	}


	public void thumbButton() {

		WebElement elementSighupButton = driver.findElement(By.xpath(thumbEnter_xpath));
		elementSighupButton.click();
	}
	
	public void openFirstTrip() {

		WebElement elementfirstTrip = driver.findElement(By.xpath(firstTrip_xpath));
		elementfirstTrip.click();
		System.out.println("ranu");
		//String b = elementfirstTrip.getText();
		//System.out.println("first trip present: "+b);
	}


	public void letsgoButton() {

		WebElement elementSighupButton = driver.findElement(By.xpath(letsgoButton_xpath));
		elementSighupButton.click();
	}


}
