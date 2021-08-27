package com.qa.blaze.features;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.blaze.base.BasePage;
import com.qa.blaze.utils.ElementUtil;

public class PurchaseFlightPage extends BasePage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	
	
	// 1. By Locators
	private By purchasePageHeader = By.cssSelector(".container h2");
	private By airlineSelected = By.xpath("//div[@class='container']/p[1]");
	private By flightNumSelected = By.xpath("//div[@class='container']/p[2]");
	private By price = By.xpath("//div[@class='container']/p[3]");
	private By arbitraryFees = By.xpath("//div[@class='container']/p[4]");
    private By totalCostBy = By.xpath("//div[@class='container']/p[5]/em");
    
    //form locators
    private By nameInput = By.id("inputName");
    private By addressInput = By.id("address");
    private By cityInput = By.id("city");
    private By stateBy = By.id("state");
    private By zipCode = By.id("zipCode");
    private By cardType = By.id("cardType");
    private By cardNumber = By.id("creditCardNumber");
    private By creditCardMonth = By.id("creditCardMonth");
    private By creditCardYear = By.id("creditCardYear");
    private By nameOnCard = By.id("nameOnCard");
    private By rememberMeCheckbox = By.id("rememberMe");
    private By purchaseFlightBtn = By.xpath("//input[@type='submit']");
    
	

	// 2. Constructor of the page class:

	public PurchaseFlightPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}

	// 3. page actions: features(Behaviour) of the page in the form methods:

	public String getPurchaseFlightTitle(String title, int timeOut) {
		return elementUtil.waitForTitlePresent(title, timeOut);
	}
	
	public String getPurchasePageHeader() {
		return elementUtil.doGetText(purchasePageHeader);
	}
	
	public Double calculateTotalCost() {
		double total = Double.parseDouble(elementUtil.doGetText(price).split(":")[1].trim()) +
				Double.parseDouble(elementUtil.doGetText(arbitraryFees).split(":")[1].trim());
		return total;
	}
	
	public double getTotalCost() {
		return Double.parseDouble(elementUtil.doGetText(totalCostBy).trim());
	}
	
	public PurchaseConfirmationPage enterFormDetails(String name, String address, String city, String state) {
		elementUtil.doActionsSendKeys(nameInput, name);
		elementUtil.doActionsSendKeys(addressInput, address);
		elementUtil.doActionsSendKeys(cityInput, city);
		elementUtil.doActionsSendKeys(stateBy, state);
		elementUtil.doActionsClick(purchaseFlightBtn);
		return new PurchaseConfirmationPage(driver);
	}
	
}
