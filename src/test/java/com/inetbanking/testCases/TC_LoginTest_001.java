package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException { 

		logger.info("URL is opened");

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("entered username");

		lp.setPassword(password);
		logger.info("entered password");
		lp.clickSubmit();

		System.out.println("The title of the page is : " + driver.getTitle());

		if (driver.getTitle().equalsIgnoreCase("Guru99 Bank 1Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		} else {
			//Calling method captureScreen on failure, pass driver and Test Case names as arguments.
			captureScreen(driver, "loginTest");
			
			Assert.assertTrue(false);
			logger.info("Login test faied");
		}
	}

}
