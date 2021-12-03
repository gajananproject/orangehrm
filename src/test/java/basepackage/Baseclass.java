package basepackage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
	
	public static WebDriver OpenChromeBrowser() {
		
	System.setProperty("webdriver.chrome.driver","E:\\Automation\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	return driver;
	
		}
	
	public static WebDriver OpenFirefoxBrowser() {
		
		System.setProperty("webdriver.gecko.driver","E:\\Automation\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		
		return driver;
			}

}
