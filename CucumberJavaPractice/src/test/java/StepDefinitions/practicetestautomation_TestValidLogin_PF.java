package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;

import Pages.practicetestautomation_HomePage_PF;
import Pages.practicetestautomation_LoginPage_PF;
import Pages.practicetestautomation_PracticePage_PF;
import Pages.practicetestautomation_SuccessPage_PF;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class practicetestautomation_TestValidLogin_PF {
//	
//	WebDriver driver;
//	practicetestautomation_HomePage_PF home;
//	practicetestautomation_PracticePage_PF practice;
//	practicetestautomation_LoginPage_PF login;
//	practicetestautomation_SuccessPage_PF success;
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
//	public void user_enters_username_and_password(String username, String password) {
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
//	@Then("verify user is navigated to correct url")
//	public void verify_user_is_navigated_to_success_page_url() {
//		
//		String actualURL = driver.getCurrentUrl();		
//		String expectedURL = "https://practicetestautomation.com/logged-in-successfully/";
//		Assert.assertEquals(actualURL, expectedURL);
//		System.out.println("Navigation working fine - Pass");
//
//	}
//	
//	@And("verify new page contains expected text")
//	public void verify_success_page_contains_expected_text() {
//		
//		success = new practicetestautomation_SuccessPage_PF(driver);
//		String actualText = success.verifyTextOnSuccessPage();
//		String expectedText = "Logged In Successfully";
//		Assert.assertEquals(actualText, expectedText);
//		System.out.println("Expected text is found - Pass");
//		
//	}
//	
//	
//	@Then("verify button Log out is displayed on the new page")
//	public void verify_button_log_out_is_displayed_on_the_success_page() {
//
//		
//		Assert.assertTrue(success.verifyLogoutOnSuccessPage());
//		System.out.println("Expected logout button is found - Pass");
//		driver.quit();
//		
//	}



}
