package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;

import Pages.practicetestautomation_HomePage_PF;
import Pages.practicetestautomation_LoginPage_PF;
import Pages.practicetestautomation_PracticePage_PF;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class practicetestautomation_Test_Navigation_PF {
	
//	WebDriver driver;
//	practicetestautomation_HomePage_PF home;
//	practicetestautomation_PracticePage_PF practice;
//	practicetestautomation_LoginPage_PF login;
//
//	
//	@Given("Browser is open")
//	public void browser_is_open() {
//
//		driver = new ChromeDriver();
//		
//	}
//
//	@And("user is on test page")
//	public void user_is_on_test_page() {
//		
//		driver.get("https://practicetestautomation.com/");
//
//	}
//
//	@When("user clicks on practice link")
//	public void user_clicks_on_practice_link() {
//		
//		home = new practicetestautomation_HomePage_PF(driver);
//		home.navigateToPractice();
//	}
//
//	@And("user clicks on test login page link")
//	public void user_clicks_on_test_login_page_link() {
//		
//		practice = new practicetestautomation_PracticePage_PF(driver);
//		practice.navigateToTestLoginPage();
//
//	}
//
//	@Then("verify user is navigated to correct url")
//	public void verify_user_is_navigated_to_login_page_url() {
//		
//		String actualURL = driver.getCurrentUrl();		
//		String expectedURL = "https://practicetestautomation.com/practice-test-login/";
//		Assert.assertEquals(actualURL, expectedURL);
//		System.out.println("Navigation working fine - Pass");
//
//	}
//
//	@And("verify new page contains expected text")
//	public void verify_new_page_contains_expected_text() {
//		
//		login = new practicetestautomation_LoginPage_PF(driver);
//		String actualText = login.verifyTextOnLoginPage();
//		String expectedText = "Test login";
//		Assert.assertEquals(actualText, expectedText);
//		System.out.println("Expected text is found - Pass");
//		
//		driver.quit();
//
//	}


}
