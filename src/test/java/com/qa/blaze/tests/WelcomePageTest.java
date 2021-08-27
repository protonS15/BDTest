package com.qa.blaze.tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.blaze.base.BaseTest;
import com.qa.blaze.utils.Constants;

public class WelcomePageTest extends BaseTest {
	

	@Test(priority = 1)
	public void verifyWelcomePageTitleTest() {
		String title = welcomePage.getWelcomePageTitle(Constants.WELCOME_PAGE_TITLE, 20);
		System.out.println("Welcome page title is : " + title);
		Assert.assertEquals(title, Constants.WELCOME_PAGE_TITLE);
	}
	
	@Test(priority = 2)
	public void verifyWelcomePageHeader() {
		String header = welcomePage.getWelcomePageHeader();
		System.out.println("Welcome page header text is : " + header);
		Assert.assertEquals(header, Constants.HOME_PAGE_HEADER);
	}
	
	@Test(priority = 3)
	public void verifyHeaderLinks() {
		List<WebElement> headerLinksElements = welcomePage.getHeaderLinks();
		Assert.assertEquals(headerLinksElements.size(), Constants.HOME_PAGE_LINK_SIZE);
		System.out.println("Welcome page header link size  is : " + headerLinksElements.size());
	}
	
	@Test(priority = 4)
	public void selectCityValues() {
		if (welcomePage.departCityLabelDisplayed() && welcomePage.destinationCityLabelDisplayed())
			welcomePage.selectCityValues(Constants.DEPART, Constants.DESTINATION);
		else System.out.println("Deapart and destination label not displayed");
	}

}
