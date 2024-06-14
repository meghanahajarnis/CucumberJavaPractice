package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practicetestautomation_HomePage_PF {
	
	WebDriver driver;
	
	//Webelements
	@FindBy(xpath = "//a[contains(text(), 'Home')]")
	WebElement link_Home;
	
	@FindBy(xpath = "//li/a[contains(text(), 'Practice')]")
	WebElement link_Practice;

	@FindBy(xpath = "//a[contains(text(), 'Courses')]")
	WebElement link_Courses;
	
	@FindBy(xpath = "//a[contains(text(), 'Blog')]")
	WebElement link_Blog;
	
	@FindBy(xpath = "//a[contains(text(), 'Contact')]")
	WebElement link_Contact;
	
	//Constructor
	public practicetestautomation_HomePage_PF(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	//Methods
	public void navigateToHome() {
		link_Home.click();
	}
	
	public void navigateToPractice() {
		link_Practice.click();
	}
	
	public void navigateToCourses() {
		link_Courses.click();
	}
	
	public void navigateToBlog() {
		link_Blog.click();
	}
	
	public void navigateToContact() {
		link_Contact.click();
	}
	
	
}
