package com.qa.pages.updated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.base.TestBase;

public class AddUserPreference extends TestBase {


	private final String text3_xpath = "//span[@class='MuiSlider-thumb MuiSlider-thumbColorPrimary PrivateValueLabel-open-234 PrivateValueLabel-thumb-233']";

	private final String text4_xpath = "//input[@id='destination']";
	private final String text9_xpath = "//span[contains(text(),'+')]";
	private final String text10_xpath = "//span[contains(text(),'+')]";



	private final String text5_xpath = "//body//button[1]";
	private final String text7_xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-sm-true']//div[2]//div[1]//div[1]//div[1]//input[1]";
	private final String text8_xpath = "//div[3]//div[1]//div[1]//div[1]//input[1]";



	private final String text6_xpath = "//span[contains(text(),'Recommend')]";
	private final String text11_xpath = "//span[contains(text(),'Skip')]";
	
	//private final String budgetSlider_xpath = "//span[@class='MuiSlider-thumb MuiSlider-thumbColorPrimary PrivateValueLabel-open-234 PrivateValueLabel-thumb-233']";
	private final String budgetSlider_xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/span[1]/span[11]";
	//span[@class='MuiSlider-thumb MuiSlider-thumbColorPrimary PrivateValueLabel-open-2234 PrivateValueLabel-thumb-2233']
	


	public void openaddUserPreferencePage() {
		
		driver.get("http://localhost:3000/addUserPreference");
	}
	
	public void budgetSlider() {
		WebElement slider = driver.findElement(By.xpath(budgetSlider_xpath));
		Actions actions = new Actions(driver);
		actions.clickAndHold(slider).moveByOffset(200, 200).release().perform();
		slider.click();
		//Thread.sleep(4000);
		
	}



	public void verifyCategory() {

		WebElement elementCategory = driver.findElement(By.xpath(text4_xpath));
		elementCategory.clear();
		elementCategory.sendKeys("LA, CA");

	}

	public void verifyCategory1() {

		WebElement elementCategory = driver.findElement(By.xpath(text7_xpath));
		elementCategory.clear();
		elementCategory.sendKeys("TAHOE, CA");

	}

	public void verifyCategory2() {

		WebElement elementCategory = driver.findElement(By.xpath(text8_xpath));
		elementCategory.clear();
		elementCategory.sendKeys("LV, CA");

	}


	public void clickSearch() {

		WebElement elementSubmit = driver.findElement(By.xpath(text5_xpath));
		elementSubmit.click();
	}

	public void clickSearchA() {

		WebElement elementSubmit = driver.findElement(By.xpath(text9_xpath));
		elementSubmit.click();
	}

	public void clickSearchB() {

		WebElement elementSubmit = driver.findElement(By.xpath(text10_xpath));
		elementSubmit.click();
	}


	public void recommendButton() {

		WebElement elementSubmit = driver.findElement(By.xpath(text6_xpath));
		elementSubmit.click();
	}

	public void skipButton() {

		WebElement elementSubmit = driver.findElement(By.xpath(text11_xpath));
		elementSubmit.click();
	}


}



