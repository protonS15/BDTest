package com.qa.blaze.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.blaze.base.BaseTest;
import com.qa.blaze.utils.Constants;

public class PurchaseConfirmationPageTest extends BaseTest {


	@Test(priority = 1)
	public void verifyPurchaseConfirmationPageTitleTest() {
		String title = purchaseConfirmationPage.getPurchaseConfirmationTitle(Constants.CONFIRMATION_PAGE_TITLE, 20);
		System.out.println("Purchase confirmation page title is : " + title);
		Assert.assertEquals(title, Constants.CONFIRMATION_PAGE_TITLE);
	}
	
	@Test(priority = 2)
	public void verifyPurchaseConfirmationPageHeader() {
		String header = purchaseConfirmationPage.getPurchaseConfirmationHeader();
		System.out.println("Purchase confirmation page header text is : " + header);
		boolean headerValidate = header.contains(Constants.THANKYOU_MESSAGE);
		Assert.assertTrue(headerValidate);
	}
	
	@Test(priority = 4)
	public void verifyConfirmationID() {
		String confirmationID = purchaseConfirmationPage.getPurchaseConfirmationID("Id");
		System.out.println("Confirmation ID : " + confirmationID);
	}
}
