package com.qa.testcases.updated;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.updated.AddUserPreference;
import com.qa.pages.updated.Home;
import com.qa.pages.updated.Login;
import com.qa.pages.updated.SignUp;
import com.qa.pages.updated.TripDetails;

import junit.framework.Assert;

public class LoginTest extends TestBase{

	public SignUp signUp;
	public Login login;
	public Home  home;
	public TripDetails tripDetails;
	public AddUserPreference addUserPreference;
	public InviteFriendsTest i;


	@BeforeClass
	public void setUp() {
		System.out.println("I am in BeforeTest");		
		signUp = new SignUp();
		login = new Login();
		home = new Home();
		tripDetails = new TripDetails();
		addUserPreference = new AddUserPreference();
		i = new InviteFriendsTest();
		initialization();

	}

	@Test(priority=1)
	public void verifySignInPage() throws InterruptedException {
		System.out.println("I am in Test");
		
		
		login.openLoginPage();	

		signUp.editEmail();
		//Thread.sleep(1000);

		signUp.editPw();
		//Thread.sleep(1000);

		login.loginButton();
		Thread.sleep(3000);							
	}


	@Test(dependsOnMethods = { "verifySignInPage" })
	public void verifyHomePage() throws InterruptedException {
		System.out.println("verifyHomePage");

		String b = home.verifyTripLink();
		Thread.sleep(4000);		
		Assert.assertEquals(b, "My Trips");

	}

	@Test(dependsOnMethods = { "verifySignInPage" })
	public void verifyTripPage() throws InterruptedException {
		System.out.println("verifyTripPage");
		tripDetails.openFirstTrip();
		Thread.sleep(5000);
		//tripDetails.thumbButton();
			
	}


	@Test(dependsOnMethods = { "verifyTripPage" })
	public void verifyletsGoButton() throws InterruptedException {
		System.out.println("I am in verifyletsGoButton");

		tripDetails.letsgoButton();
		Thread.sleep(3000);	

	}
	
	@Test (dependsOnMethods = { "verifyletsGoButton" })
	public void verifyAddTrippage() throws InterruptedException {
		
		//addUserPreference.openHuddleSpacePage();
		
		addUserPreference.budgetSlider();
		Thread.sleep(4000);
		
		addUserPreference.clickSearch();
		Thread.sleep(2000);
		addUserPreference.verifyCategory();
		Thread.sleep(2000);
		
		addUserPreference.clickSearchA();
		Thread.sleep(2000);
		addUserPreference.verifyCategory1();
		Thread.sleep(2000);
		
		addUserPreference.clickSearchB();
		Thread.sleep(2000);
		addUserPreference.verifyCategory2();
		Thread.sleep(2000);
				
		addUserPreference.recommendButton();
		Thread.sleep(4000);
	
		//addUserPreference.skipButton();
		//Thread.sleep(4000);
				
	}
	
	@Test(dependsOnMethods = { "verifyAddTrippage" })
	public void verifyInvites() throws InterruptedException {
		System.out.println("I am in verifyletsGoButton");

		i.verifyInviteFriendsPage();	

	}


	@AfterTest
	public void tearDown() {
		closeAndKill();
	}
}
