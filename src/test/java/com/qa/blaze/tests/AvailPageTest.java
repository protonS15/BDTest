package com.qa.blaze.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.blaze.base.BaseTest;
import com.qa.blaze.utils.Constants;

public class AvailPageTest extends BaseTest {
	
	String flightName = "Lufthansa";

	@Test(priority = 1)
	public void verifyAvailPageTitleTest() {
		String title = availPage.getAvailPageTitle(Constants.AVAIL_PAGE_TITLE, 20);
		System.out.println("Availability page title is : " + title);
		Assert.assertEquals(title, Constants.AVAIL_PAGE_TITLE);
	}
	
	@Test(priority = 2)
	public void verifyAvailPageHeader() {
		String header = availPage.getAvailPageHeaderText();
		System.out.println("Avail page header text is : " + header);
		boolean headerValidate = (header.contains(Constants.DEPART) && header.contains(Constants.DESTINATION));
		Assert.assertTrue(headerValidate);
	}
	
	@Test(priority = 3)
	public void chooseFlight() {
		availPage.selectFlight(flightName);
		System.out.println("Airline booked : " + flightName);
	}
	
	

}
