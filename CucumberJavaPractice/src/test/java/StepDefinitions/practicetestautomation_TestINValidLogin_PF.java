package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.practicetestautomation_HomePage_PF;
import Pages.practicetestautomation_LoginPage_PF;
import Pages.practicetestautomation_PracticePage_PF;
import io.cucumber.java.en.*;

public class practicetestautomation_TestINValidLogin_PF {
	
//	WebDriver driver;
//	practicetestautomation_HomePage_PF home;
//	practicetestautomation_PracticePage_PF practice;
//	practicetestautomation_LoginPage_PF login;
//	
//	
//	@Given("user is on test login page")
//	public void user_is_on_test_login_page() {
//		
//		driver = new ChromeDriver();
//		driver.get("https://practicetestautomation.com/");
//		home = new practicetestautomation_HomePage_PF(driver);
//		home.navigateToPractice();
//		practice = new practicetestautomation_PracticePage_PF(driver);
//		practice.navigateToTestLoginPage();
//
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_incorrect_user_and_password(String username, String password) {
//		
//		login = new practicetestautomation_LoginPage_PF(driver);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		
//
//	}
//
//	@And("user clicks on login button")
//	public void user_clicks_on_login_button() {
//		
//		login.clickOnSubmit();
//
//	}
//
//	@Then("verify error message is displayed")
//	public void verify_error_message_is_displayed() {
//		
//		Assert.assertEquals(login.verifyErrorDisplayedOnLoginPage(), true);
//		System.out.println("Error message is displayed - Pass");
//
//	}
//
//
//
//	@And("username and password field becomes blank")
//	public void username_and_password_field_becomes_blank() {
//		
//		Assert.assertEquals(login.verifyUsernameBlank(), true);
//		Assert.assertEquals(login.verifyPasswordBlank(), true);
//		System.out.println("Fields are blank - Pass");
//		driver.quit();
//
//	}
//	

}
