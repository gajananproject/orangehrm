package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminModule6 {
	
	@FindBy(xpath = "//input[@id='searchSystemUser_userName']")
	private WebElement username;

	@FindBy(xpath = "//select[@id='searchSystemUser_userType']")
	private WebElement usertype;

	@FindBy(xpath = "//input[@id='searchSystemUser_employeeName_empName']")
	private WebElement emp_name;

	@FindBy(xpath = "//select[@id='searchSystemUser_status']")
	private WebElement status;

	@FindBy(xpath = "//input[@id='searchBtn']")
	private WebElement search_btn;

	@FindBy(xpath = "//input[@id='resetBtn']")
	private WebElement reset_btn;

	@FindBy(xpath = "//input[@id='btnAdd']")
	private WebElement add_btn;
	
	@FindBy(xpath = "//select[@id='systemUser_userType']")
	private WebElement usertype1;
	
	@FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
	private WebElement empName;
	
	@FindBy(xpath = "//input[@id='systemUser_userName']")
	private WebElement username1;
	
	@FindBy(xpath = "//select[@id='systemUser_status']")
	private WebElement status1;
	
	@FindBy(xpath = "//input[@id='systemUser_password']")
	private WebElement setpassword;
	
	@FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
	private WebElement confirmpassword;
	
	@FindBy(xpath = "//input[@id='btnSave']")
	private WebElement savebtn;
	
	@FindBy(xpath = "//input[@id='btnCancel']")
	private WebElement cancelbtn;
	
//	@FindBy(xpath = "//input[@id='btnDelete']")
//	private WebElement delete_btn;

	
	public AdminModule6(WebDriver driver) {
		PageFactory.initElements(driver,this);		
	}
	
	
	public void username() {
		username.sendKeys("Aatmaram");
	}
	public void usertype() {
		Select s = new Select(usertype);
//		s.selectByVisibleText("All");
//		s.selectByVisibleText("Admin");
		s.selectByVisibleText("ESS");		
	}
	public void emp_name() {
		emp_name.sendKeys("Alice Duval");
	}
	public void status() {
		Select s1 = new Select(status);
//		s1.selectByVisibleText("All");
		s1.selectByVisibleText("Enabled");
//		s1.selectByVisibleText("Disabled");
	}
	public void search_btn() {
		search_btn.click();
	}
//	public void reset_btn() {     	//FOR RESET THE INFORMATION
//		reset_btn.click();
//	}
	public void add_btn() {
		add_btn.click();		
	}
	public void usertype1() {
		Select s2 = new Select(usertype1);
		s2.selectByVisibleText("Admin");
		s2.selectByVisibleText("ESS");
	}
	public void empName() {
		empName.sendKeys("gaurav");
	}
	public void username1() {
		username1.sendKeys("Gaurav1");
	}
	public void status1() {
		Select s3 = new Select(status1);
		s3.selectByVisibleText("Enabled");
		s3.selectByVisibleText("Disabled");
	}
	public void setpassword() {
		setpassword.sendKeys("gaurav123");
	}
	public void confirmpassword() {
		confirmpassword.sendKeys("gaurav123");
	}
	public void savebtn() {
		savebtn.click();
	}
	public void cancelbtn() {
		cancelbtn.click();
	}
	
//	public void delete_btn() {
//		delete_btn.click();
//	}

}
