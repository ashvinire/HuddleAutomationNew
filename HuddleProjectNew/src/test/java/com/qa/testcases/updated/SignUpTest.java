package com.qa.testcases.updated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.base.TestBase;
import com.qa.pages.updated.Login;
import com.qa.pages.updated.SignUp;
import junit.framework.Assert;

public class SignUpTest extends TestBase {

	public SignUp signUp;
	 public Login login;

	@BeforeClass
	public void setUp() {
		System.out.println("I am in BeforeTest");

		signUp = new SignUp();
		login = new Login();

		initialization();

	}
	@Test
	public void verifySignUpPage() throws InterruptedException {
		System.out.println("I am in Test");
		
		
		signUp.openSignup();
		
		signUp.editEmail();
		Thread.sleep(2000);	
		
		
	
		signUp.editPw();
		Thread.sleep(2000);	
		
		signUp.confirmPw();
		Thread.sleep(2000);	
		
		signUp.handle();
		Thread.sleep(2000);	
		
		
		
		
		signUp.verifySighUpButton();
		Thread.sleep(2000);	
		
		//signUp.clickAlreadyMem();
		//Thread.sleep(3000);		
		
		/*signUp.editEmail();
		Thread.sleep(2000);	
		
		
	
		signUp.editPw();
		Thread.sleep(2000);	
		
		login.loginButton();
		Thread.sleep(4000);	*/
		
		
	}



	@AfterTest
	public void tearDown() {
		
		closeAndKill();
	}

}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

