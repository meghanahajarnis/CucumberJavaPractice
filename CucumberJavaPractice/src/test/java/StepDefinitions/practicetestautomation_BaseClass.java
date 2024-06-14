package StepDefinitions;

import java.io.FileReader;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;



public class practicetestautomation_BaseClass {
	
	public WebDriver driver;
	FileReader reader;
	Properties prop;

//	//Constructor
//	public practicetestautomation_BaseClass(WebDriver driver) {
//		
//		this.driver = driver;		
//		
//	}
	
	
	public void openBrowser() throws IOException {		
		
		reader=new FileReader("src/test/resources/config/config.properties");
		prop = new Properties();
		prop.load(reader);		
		String browserName = prop.getProperty("browser");	
	
	
		if(browserName.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
			
		}else if (browserName.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
			
		}
		
	}
	
	public void loadURL() throws IOException {		
		
		reader=new FileReader("src/test/resources/config/config.properties");
		prop = new Properties();
		prop.load(reader);		
		String testURL = prop.getProperty("test_url");	
		driver.get(testURL);
		
		
	}

}
	
			
		


