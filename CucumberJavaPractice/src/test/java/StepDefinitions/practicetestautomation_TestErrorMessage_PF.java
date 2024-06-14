package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.practicetestautomation_HomePage_PF;
import Pages.practicetestautomation_LoginPage_PF;
import Pages.practicetestautomation_PracticePage_PF;
import io.cucumber.java.en.*;

public class practicetestautomation_TestErrorMessage_PF {
	
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
//	@When("user enters invalid username and valid password")
//	public void user_enters_invalid_username_and_valid_password() {
//		
//		login = new practicetestautomation_LoginPage_PF(driver);
//		login.enterUsername("abz");
//		login.enterPassword("Password123");
//		
//
//	}
//	
//	@And("user clicks on login button")
//	public void user_clicks_on_login_button() throws InterruptedException {
//
//		login.clickOnSubmit();
//		Thread.sleep(3000);
//		
//	}
//
//
//	@Then("verify invalid username error message")
//	public void verify_invalid_username_error_message() {
//
//		String expectedError = "Your username is invalid!";
//		String actualError = login.verifyErrorOnLoginPage();
//		
//		Assert.assertEquals(expectedError, actualError);
//
//		System.out.println("invalid username Error message is correct - Pass");
//		driver.quit();
//		
//	}
//
//	@When("user enters valid username and invalid password")
//	public void user_enters_valid_username_and_invalid_password() {
//
//		login = new practicetestautomation_LoginPage_PF(driver);
//		login.enterUsername("student");
//		login.enterPassword("222");
//		
//	}
//
//	
//	@Then("verify invalid password error message")
//	public void verify_invalid_password_error_message() {
//
//		String expectedError = "Your password is invalid!";
//		String actualError = login.verifyErrorOnLoginPage();
//		
//		Assert.assertEquals(expectedError, actualError);
//
//		System.out.println("invalid password Error message is correct - Pass");
//		driver.quit();
//		
//	}


	

}
