package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mainpage6 {
	
	@FindBy(xpath = "//a[@href='/index.php/admin/viewAdminModule']")
	private WebElement avmin;
	
	@FindBy(xpath = "//a[@href='/index.php/pim/viewPimModule']")
	private WebElement PIM;	
	
	@FindBy(xpath = "//a[@href='/index.php/leave/viewLeaveModule']")
	private WebElement leave;
	
	@FindBy(xpath = "//a[@href='/index.php/time/viewTimeModule']")
	private WebElement time;
	
	@FindBy(xpath = "//a[@href='/index.php/recruitment/viewRecruitmentModule']")
	private WebElement recruitment;

	@FindBy(xpath = "//a[@href='/index.php/pim/viewMyDetails']")
	private WebElement MyDetails;

	@FindBy(xpath = "//a[@href='#']")
	private WebElement performance;

	@FindBy(xpath = "//a[@href='/index.php/dashboard']")
	private WebElement dashboard;
	
	@FindBy(xpath = "//a[@href='/index.php/directory/viewDirectory/reset/1']")
	private WebElement directory;

	@FindBy(xpath = "//a[@href='/index.php/maintenance/purgeEmployee']")
	private WebElement maintenance;

	@FindBy(xpath = "//a[@href='/index.php/buzz/viewBuzz']")
	private WebElement buzz;

	@FindBy(xpath = "//input[@value='Marketplace']")
	private WebElement marketplace;
	
	@FindBy(xpath = "//input[@id='Subscriber_link']")
	private WebElement subscriber;
	
	public Mainpage6(WebDriver driver1) {
		
		PageFactory.initElements(driver1,this);
		
	}
	public void admin() {
		avmin.click();
	}
	public void PIM() {
		PIM.click();
	}
	public void leave() {
		leave.click();
	}
	public void time() {
		time.click();
	}
	public void recruitment() {
		recruitment.click();
	}
	public void MyDetails() {
		MyDetails.click();
	}
	public void performance() {
		performance.click();
	}
	public void dashboard() {
		dashboard.click();
	}
	public void directory() {
		directory.click();
	}
	public void maintenance() {
		maintenance.click();
	}
	public void buzz() {
		buzz.click();
	}
	public void marketplace() {
		marketplace.click();
	}
	public void subscriber() {
		subscriber.click();
	} 

}
