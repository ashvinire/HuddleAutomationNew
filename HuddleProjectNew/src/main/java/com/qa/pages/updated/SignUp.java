package com.qa.pages.updated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;


public class SignUp extends TestBase {

	private final String alreadyMember_xpath = "//a[contains(text(),'here')]";
	private final String emailspace_xpath = "//input[@id='email']";
	private final String signUpbutton_xpath = "//span[contains(text(),'SignUp')]";
	private final String pw_xpath = "//input[@id='password']";
	private final String confirmpw_xpath = "//input[@id='confirmPassword']";
	private final String handle_xpath = "//input[@id='handle']";


	public void openSignup() {
		driver.get("http://localhost:3000/signup");
	}

	public void editEmail() {

		WebElement elementEditEmail = driver.findElement(By.xpath(emailspace_xpath));		
		elementEditEmail.sendKeys("rewatkarrewatkar@gmail.com");
	}

	public void editPw() {

		WebElement elementEditEmail = driver.findElement(By.xpath(pw_xpath));		
		elementEditEmail.sendKeys("123456");
	}

	public void confirmPw() {

		WebElement elementEditEmail = driver.findElement(By.xpath(confirmpw_xpath));		
		elementEditEmail.sendKeys("123456");
	}  


	public void handle() {

		WebElement elementEditEmail = driver.findElement(By.xpath(handle_xpath));		
		elementEditEmail.sendKeys("ashvini");
	}

	public void verifySighUpButton() {

		WebElement elementSighupButton = driver.findElement(By.xpath(signUpbutton_xpath));
		elementSighupButton.click();
	}

	public void clickAlreadyMem() {

		WebElement elementAlreadyMem = driver.findElement(By.xpath(alreadyMember_xpath));
		elementAlreadyMem.click();
	}

}
