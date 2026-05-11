package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	WebDriver driver;
	
	//constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(id="username")
	WebElement loginUserName;
	
	@FindBy(id="password")
	WebElement loginPassword;
	
	@FindBy(id="login")
	WebElement loginButton;
	
	@FindBy(linkText = "New User Register Here")
	WebElement registerLink;
	
	
	
//	Actions
	public void enterUserName(String uName) {
		loginUserName.sendKeys(uName);
	}
	public void enterPassword(String uPassword) {
		loginPassword.sendKeys(uPassword);
	}
	public void clickLogin() {
		loginButton.click();
	}
	public void clickRegisterLink() {
		registerLink.click();
	}
	
}
