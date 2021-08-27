package com.qa.blaze.features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.blaze.base.BasePage;
import com.qa.blaze.utils.ElementUtil;

public class AvailPage extends BasePage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	private String columnValue = "";
	
	// 1. By Locators
	private By availPageHeader = By.cssSelector(".container h3");
	private By chooseTheFlightButton = By.xpath("//input[@value='Choose This Flight']");
	private By flightSelection = By.xpath("//table/tbody/tr/td[text()='"+columnValue+"']/preceding-sibling::td/input");
	


	// 2. Constructor of the page class:

	public AvailPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	public String getAvailPageTitle(String title, int timeOut) {
		return elementUtil.waitForTitlePresent(title, timeOut);
	}
	
	public String getAvailPageHeaderText() {
		return elementUtil.doGetText(availPageHeader);
	}
	
	public PurchaseFlightPage selectFlight(String flightName) {
		columnValue = flightName;
		elementUtil.doActionsClick(flightSelection);
		return new PurchaseFlightPage(driver);
	}

}
