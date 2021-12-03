package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Loginpage6 {
	
	@FindBy(xpath ="//input[@id='txtUsername']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement password;

	@FindBy(xpath ="//input[@id='btnLogin']")
	private WebElement login;
	
	@FindBy(xpath = "//a[@class='panelTrigger']")
	private WebElement welcome;
	
	@FindBy(xpath = "//a[@id='aboutDisplayLink']")
	private WebElement about;	
	
	@FindBy(xpath = "//a[@class='close'][1]")
	private WebElement close;
	
	@FindBy(xpath = "//a[@href='/index.php/support/index']")
	private WebElement support;
	
	@FindBy(xpath = "//a[@href='/index.php/auth/logout']")
	private WebElement logout;

	public Loginpage6(WebDriver driver1) {
		PageFactory.initElements(driver1,this);		
	}
	public void sendusername() {
		username.sendKeys("Admin");
//		String expectedusername = "Admin";
//		Assert.assertEquals(expectedusername, username.getText());
//		System.out.println("username is expected one - Assert Passed ");
		//username.sendKeys("gajanan");
		//username.sendKeys("admin");
//		if(username.equals("Admin")) {
//			System.out.println("pass");
//		}
//		else {
//			System.out.println("fail");
//		}
	}
	public void sendpassword() {
		password.sendKeys("admin123");
		//password.sendKeys("admin456");
//		if(password.equals("admin123")) {
//			System.out.println("pass");
//		}
//		else {
//			System.out.println("fail");
//		}
	}
	public void clickonlogin() {
		login.click();
	}
	public void clickonwelcome() {
		welcome.click();
	}
	public void clickonabout () {
		about.click();
	}
	public void clickonclose() {
		close.click();
	}
	public void clickonsupport() {
		support.click();
	}
	public void clickonlogout() {
		logout.click();
	}

}
