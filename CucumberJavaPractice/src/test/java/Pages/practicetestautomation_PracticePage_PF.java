package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practicetestautomation_PracticePage_PF {
	
	WebDriver driver;
	
	//Webelements
	@FindBy(xpath = "//a[contains(text(), 'Test Login Page')]")
	WebElement link_Test_Login_Page;
	
	@FindBy(xpath = "//a[contains(text(), 'Test Exceptions')]")
	WebElement link_Test_Exceptions;
	
	


	//Constructor
	public practicetestautomation_PracticePage_PF(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	//Methods
	public void navigateToTestLoginPage() {
		link_Test_Login_Page.click();
	}
	
	public void navigateToTestExceptionsPage() {
		link_Test_Exceptions.click();
	}

	
}
