package com.qa.testcases.updated;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

import com.qa.pages.updated.InviteFriends;

import junit.framework.Assert;

public class InviteFriendsTest extends TestBase{

	public InviteFriends  inviteFriends;
	
	
	@BeforeClass
	public void setUp() {
		System.out.println("I am in BeforeTest");
		inviteFriends = new InviteFriends();
		
		initialization();

	}
	
	@Test
	public void verifyInviteFriendsPage() throws InterruptedException {
		System.out.println("I am in Test");
		

		inviteFriends.openInviteFriendsPage();
		
		inviteFriends.verifyPlus();
		Thread.sleep(2000);	
		inviteFriends.editEmail();
		Thread.sleep(3000);	
	
		
		
		inviteFriends.verifyPlus2();
		Thread.sleep(2000);	
		inviteFriends.editEmail2();
		Thread.sleep(3000);
		
	
		
		inviteFriends.verifyInvite();
		Thread.sleep(3000);	
}
	
	
	@AfterTest
	public void tearDown() {
      closeAndKill();
	}
}
