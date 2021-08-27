package com.qa.blaze.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.qa.blaze.features.AvailPage;
import com.qa.blaze.features.PurchaseConfirmationPage;
import com.qa.blaze.features.PurchaseFlightPage;
import com.qa.blaze.features.WelcomePage;

public class BaseTest {
	
	public BasePage basePage;
	public WelcomePage welcomePage;

	public Properties prop;
	public WebDriver driver;
	public AvailPage availPage;
	public PurchaseFlightPage purchaseFlightPage;
	public PurchaseConfirmationPage purchaseConfirmationPage;

	@Parameters({"browser", "version"})
	@BeforeTest
	public void setUp(String browserName, String browserVersion) {

		basePage = new BasePage();
		prop = basePage.init_prop();
		String browser = prop.getProperty("browser");

		if (browserName != null) {
			browser = browserName;
		}
		driver = basePage.init_driver(browser, browserVersion);
		welcomePage = new WelcomePage(driver);
		driver.get(prop.getProperty("url"));

	}		

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
