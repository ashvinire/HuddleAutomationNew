package com.qa.pages.updated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class FinalizeDestination extends TestBase {

	private final String rightClick_xpath = "";
	
	private final String titleDestn = "//h2[contains(text(),'MOST VOTED DESTINATION')]";
	
	
	
	public void openFinalDestination() {
		driver.get("http://localhost:3000/finalizeDestination");
	}

	public void verifybuttonRight() {
		WebElement elementInput7 = driver.findElement(By.xpath(rightClick_xpath));
		elementInput7.click();
	}
	
	public String verifyTitleDestn() {
		WebElement e = driver.findElement(By.xpath(titleDestn));
		String s = e.getText();
		return s;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
