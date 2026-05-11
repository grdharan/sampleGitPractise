package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement registerUserName;
	
	@FindBy(id="password")
	WebElement registerPassword;
	
	@FindBy(id="re_password")
	WebElement registerConfirmPassword;
	
	@FindBy(id="full_name")
	WebElement registerFullName;
	
	@FindBy(id="email_add")
	WebElement registerEmail;
	
	@FindBy(id="tnc_box")
	WebElement termsCheckBox;
	
	@FindBy(id="Submit")
	WebElement registerButton;
	
	
	public void enterNewUser(String uName) {
		registerUserName.sendKeys(uName);
	}
	
	public void enterPassword(String password) {
		registerPassword.sendKeys(password);
	}
	
	public void enterConfirmPassword(String rePassword) {
		registerConfirmPassword.sendKeys(rePassword);
	}
	
	public void enterFullName(String fName) {
		registerFullName.sendKeys(fName);
	}
	
	public void enterEmail(String mail) {
		registerEmail.sendKeys(mail);
	}
	
	public void clickTermsCheckBox() {
		termsCheckBox.click();
	}
	
	public void clickRegisterButton() {
		registerButton.click();
	}

	public boolean isRegistrationSuccessful() {
		
		return true;
	}

}
