package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practicetestautomation_SuccessPage_PF {
	
	WebDriver driver;
	
	//Webelements
	@FindBy(xpath = "//h1[@class='post-title']")
	WebElement txt_success;
	
	@FindBy(xpath = "//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']")
	WebElement link_logout;
		

	//Constructor
	public practicetestautomation_SuccessPage_PF(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	//Methods
	public String verifyTextOnSuccessPage() {
		return txt_success.getText();
	}
	

	public void clickOnLogout() {
		
		link_logout.click();
	}

	public boolean verifyLogoutOnSuccessPage() {
		return link_logout.isDisplayed();
	}
}
