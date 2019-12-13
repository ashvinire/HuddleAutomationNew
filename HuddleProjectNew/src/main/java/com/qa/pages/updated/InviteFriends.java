package com.qa.pages.updated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class InviteFriends extends TestBase{
	
	//h1[contains(text(),'Who are you?')]
	//div[@class='dib br3 pa3 ma2 grow']//div[@class='Tilt br2 shadow-2']//div    ----hover,img, click (dictator)
	//div[contains(@class,'tc')]//div[2]//div[1]//div[1]   ---------hover,img,click  (democrat)
	
	private final String plusButton_xpath = "//span[contains(text(),'+')]";
	
	private final String plusButton2_xpath = "//span[contains(text(),'+')]";
	
	private final String email_xpath = "//input[@id='email']";
	private final String email2_xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-sm-true']//div[2]//div[1]//div[1]//div[1]//input[1]";
	
	
	
	private final String buttonInvite_xpath = "//span[contains(text(),'Invite')]";
	
	
	
	
	
	public void openInviteFriendsPage() {
		driver.get("http://localhost:3000/inviteFriends");
	}
	

public void verifyPlus() {
	WebElement elementDictator = driver.findElement(By.xpath(plusButton_xpath));
	elementDictator.click();
}
	

public void verifyPlus2() {
	WebElement elementDictator = driver.findElement(By.xpath(plusButton2_xpath));
	elementDictator.click();
}




public void editEmail() {
	
	WebElement elementEditEmail = driver.findElement(By.xpath(email_xpath));		
	elementEditEmail.sendKeys("svelichety@gmail.com");
}



public void editEmail2() {
	
	WebElement elementEditEmail = driver.findElement(By.xpath(email2_xpath));		
	elementEditEmail.sendKeys("rewatkarrewatkar@gmail.com");
}





public void verifyInvite() {
	WebElement elementDemocrat = driver.findElement(By.xpath(buttonInvite_xpath));
	elementDemocrat.click();
}	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


