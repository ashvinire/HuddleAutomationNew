package com.qa.testcases.updated;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

import com.qa.pages.updated.FinalizeDestination;

import jdk.nashorn.internal.runtime.options.Options;
import junit.framework.Assert;

public class FinalizeDestinationTest extends TestBase {

	FinalizeDestination finalizeDestination;
	
	@BeforeClass
	public void setUp() {
		System.out.println("I am in BeforeTest");
		
		finalizeDestination = new FinalizeDestination();		
		initialization();
	}

	@Test
	public void verifyFinalizeDestinationPage() throws InterruptedException {
		System.out.println("I am in Test");
		
		
		finalizeDestination.openFinalDestination();
		Thread.sleep(4000);
		
		//finalizeDestination.verifybuttonRight();
		//Thread.sleep(13000);
		
		String s = finalizeDestination.verifyTitleDestn();
		boolean b;
		if( s.contains("DESTINATION"))
			b = true;
		else 
			b = false;
		assertTrue(b);		
		
	}

	@AfterTest
	public void tearDown() {
				
		closeAndKill();
	}
		
	
}
