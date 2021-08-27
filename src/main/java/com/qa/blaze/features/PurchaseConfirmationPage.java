package com.qa.blaze.features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.blaze.base.BasePage;
import com.qa.blaze.utils.ElementUtil;

public class PurchaseConfirmationPage extends BasePage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	
	String columnValue = "";
	
	
	// 1. By Locators
	private By header = By.xpath(".container h1");
//	private By confirmationID = By.xpath("//table/tbody/tr/td[text()='Id']/following-sibling::td");
	private By columnValueField = By.xpath("//table/tbody/tr/td[text()='"+columnValue+"']/following-sibling::td");
	

	// 2. Constructor of the page class:

	public PurchaseConfirmationPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	// 3. page actions: features(Behaviour) of the page in the form methods:

	public String getPurchaseConfirmationTitle(String title, int timeOut) {
		return elementUtil.waitForTitlePresent(title, timeOut);
	}
	
	public String getPurchaseConfirmationHeader() {
		return elementUtil.doGetText(header);
	}
	
	public String getPurchaseConfirmationID(String column) {
		columnValue = column;
		return elementUtil.doGetText(columnValueField);
	}

}
