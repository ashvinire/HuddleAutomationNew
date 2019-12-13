package com.qa.testcases.updated;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.updated.Itinery;


public class ItineryTest extends TestBase {


	public Itinery itinery;
	
	
	
	@BeforeClass
	public void itinery() {
		System.out.println("I am in BeforeTest");
		itinery = new Itinery();
		
		initialization();

	}
	
	@Test
	public void verifyItineryPage() throws InterruptedException {
		System.out.println("I am in Test");
		

		itinery.openItinery();
		Thread.sleep(3000);	
			
}
	
	
	@AfterTest
	public void tearDown() {
      closeAndKill();
	}
}
	
	
	
	
	

