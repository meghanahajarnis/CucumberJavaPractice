package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practicetestautomation_LoginPage_PF {
	
	WebDriver driver;
	
	//Webelements
	@FindBy(xpath = "//*[@id=\"login\"]/h2")
	WebElement txt_Login;
	
	@FindBy(id = "username")
	WebElement txt_username;
	
	@FindBy(id = "password")
	WebElement txt_password;
	
	@FindBy(id = "submit")
	WebElement btn_submit;
	
	@FindBy(xpath = "//*[@id=\"error\"]")
	WebElement txt_error;
		

	//Constructor
	public practicetestautomation_LoginPage_PF(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	//Methods
	public String verifyTextOnLoginPage() {
		return txt_Login.getText();
	}
	

	public void enterUsername(String username) {
		
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		
		txt_password.sendKeys(password);
	}
	
	public void clickOnSubmit() {
		
		btn_submit.click();
	}

	public boolean verifyErrorDisplayedOnLoginPage() {
		
		return txt_error.isDisplayed();
	}
	
	public String verifyErrorOnLoginPage() {
		
		return txt_error.getText();
	}
	
	public boolean verifyUsernameBlank() {
		
		return txt_username.getText().isEmpty();
	}

	public boolean verifyPasswordBlank() {
	
	return txt_password.getText().isEmpty();
}
}
