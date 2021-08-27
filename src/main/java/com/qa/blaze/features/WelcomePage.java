package com.qa.blaze.features;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.qa.blaze.base.BasePage;
import com.qa.blaze.utils.ElementUtil;

public class WelcomePage extends BasePage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	
	
	// 1. By Locators
	private By travelTheWorldLink = By.linkText("Travel The World");
	private By homeLink = By.linkText("home");
	private By welcomePageHeaderBy = By.cssSelector(".container h1");
	private By headerLinks = By.xpath("//a[@class='brand']");
	private By departCityLabel = By.xpath("//*[text()='Choose your departure city:']");
	private By destinationCityLabel = By.xpath("//*[text()='Choose your destination city:']");
	private By fromPortDropDown = By.name("fromPort");
	private By toPortDropDown = By.name("toPort");
	private By findFlightsButton = By.xpath("//input[@type='submit']");
	



	// 2. Constructor of the page class:

	public WelcomePage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}

	// 3. page actions: features(Behaviour) of the page in the form methods:
	
	public String getWelcomePageTitle(String title, int timeOut) {
		return elementUtil.waitForTitlePresent(title, timeOut);
	}
	
	public String getWelcomePageHeader() {
		return elementUtil.doGetText(welcomePageHeaderBy);
	}
	
	public List<WebElement> getHeaderLinks() {
		return elementUtil.getElements(headerLinks);
	}
	
	public boolean departCityLabelDisplayed() {
		return elementUtil.doIsDisplayed(departCityLabel);
	}
	
	public boolean destinationCityLabelDisplayed() {
		return elementUtil.doIsDisplayed(destinationCityLabel);
	}
	
	public AvailPage selectCityValues(String departCity, String destinationCity) {
//		elementUtil.doActionsClick(fromPortDropDown);
		elementUtil.doSelectDropDownByValue(fromPortDropDown, departCity);
//		elementUtil.doActionsClick(toPortDropDown);
		elementUtil.doSelectDropDownByValue(toPortDropDown, destinationCity);
		elementUtil.doActionsClick(findFlightsButton);
		return new AvailPage(driver);
	}
	
	
	public String getParentWindow() {
		return driver.getWindowHandle();
	}
	
	public WelcomePage switchToParentWindow(String parentString) {
		driver.switchTo().window(parentString);
		return new WelcomePage(driver);
	}
}
