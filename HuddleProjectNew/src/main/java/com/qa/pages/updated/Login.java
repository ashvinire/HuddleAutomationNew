package com.qa.pages.updated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class Login extends TestBase {
	
	/*private final String emailEnter_xpath = "//input[@id='email']";
	private final String pwEnter_xpath = "//input[@id='password']";*/
	
	
	private final String buttonClick_xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained login-button-77 MuiButton-containedPrimary']//span[@class='MuiButton-label'][contains(text(),'Login')]";
	
	
	
	
	public void openLoginPage() {
		driver.get("http://localhost:3000/login");
	}
	

	/*public void editEmail() {
		
		WebElement elementEditEmail = driver.findElement(By.xpath(emailEnter_xpath));		
		elementEditEmail.sendKeys("hellen@email.com");
	}

	    
	public void editPw() {
		
		WebElement elementEditEmail = driver.findElement(By.xpath(pwEnter_xpath));		
		elementEditEmail.sendKeys("123456");
	}
	*/
	
	

	public void loginButton() {
		
		WebElement elementSighupButton = driver.findElement(By.xpath(buttonClick_xpath));
		elementSighupButton.click();
	}
	
	


}
