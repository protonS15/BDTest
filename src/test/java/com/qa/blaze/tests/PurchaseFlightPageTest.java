package com.qa.blaze.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.blaze.base.BaseTest;
import com.qa.blaze.utils.Constants;

public class PurchaseFlightPageTest extends BaseTest {


	@Test(priority = 1)
	public void verifyPurchaseFlightPageTitleTest() {
		String title = purchaseFlightPage.getPurchaseFlightTitle(Constants.PURCHASE_FLIGHT_TITLE, 20);
		System.out.println("Purchase page title is : " + title);
		Assert.assertEquals(title, Constants.PURCHASE_FLIGHT_TITLE);
	}
	
	@Test(priority = 2)
	public void verifyPurchaseFlightPageHeader() {
		String header = purchaseFlightPage.getPurchasePageHeader();
		System.out.println("Purchase page header text is : " + header);
		boolean headerValidate = (header.contains("TLV") && header.contains("SFO"));
		Assert.assertTrue(headerValidate);
	}
	
	@Test(priority = 3)
	public void verifyTotalCost() {
		Assert.assertEquals(purchaseFlightPage.calculateTotalCost(), purchaseFlightPage.getTotalCost());
		System.out.println("Total cost of booking is : " + purchaseFlightPage.getTotalCost());
	}
	
	@Test(priority = 4)
	public void enterFormDetailsAndSubmit() {
		purchaseFlightPage.enterFormDetails("Chitra", "123 avenue", "SFO", "California");
		System.out.println("Airline booked");
	}

}
