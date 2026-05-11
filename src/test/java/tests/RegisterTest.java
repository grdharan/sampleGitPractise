package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.RegisterPage;
import utils.ExcelUtils;

public class RegisterTest extends BaseTest{
	
	RegisterPage registerPage;
	
	@BeforeMethod
	public void startRegistration() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickRegisterLink();
		registerPage = new RegisterPage(driver);
		
	}
	
	@Test(dataProvider = "registrationData")
	public void verifyUserRegistrationWithValidData(String userName,String password,String mail) {
		
		registerPage.enterNewUser(userName); 
		registerPage.enterPassword(password);
		registerPage.enterConfirmPassword(password);
		registerPage.enterFullName(userName);
		registerPage.enterEmail(mail);
		registerPage.clickTermsCheckBox();
		registerPage.clickRegisterButton();
		
		Assert.assertTrue(registerPage.isRegistrationSuccessful(),"Registration Failed");
		
	}
	
	@DataProvider(name = "registrationData")
	public Object[][] getData() {
		return ExcelUtils.getData(System.getProperty("user.dir") + "/src/test/resources/testData.xlsx", "userData");

	}
	
	private void summa() {
		System.out.println("dskjfbdsjkbcfkj");
	}

	public void sample1()
	{System.out.println("hello");}
	

}
