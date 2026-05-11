package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	LoginPage loginpage;
	
	@BeforeClass
	public void start() {
		setup();
		loginpage = new LoginPage(driver);
	}
	
	@Test
	public void validLoginTest() {
		loginpage.enterUserName(prop.getProperty("loginUserName"));
		loginpage.enterPassword(prop.getProperty("loginPassword"));
		loginpage.clickLogin();
		AssertJUnit.assertTrue(driver.getTitle().contains("Search Hotel"));
	}
	
	@Test
	private void invalidLoginTest() {
		loginpage.enterUserName(prop.getProperty("loginUserName"));
		loginpage.enterPassword(prop.getProperty("loginPassword"));
		loginpage.clickLogin();
		AssertJUnit.assertFalse(driver.getTitle().contains("Search Hotel"));
	}
	
	@AfterClass
	public void end() {
		tearDown();
	}

}
