package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pimclass {
	
	@FindBy(xpath = "//input[@id='empsearch_employee_name_empName']")
	private WebElement pim_empname;

	@FindBy(xpath = "//input[@id='empsearch_id']")
	private WebElement pim_empid;

	@FindBy(xpath = "//select[@id='empsearch_employee_status']")
	private WebElement Employment_status;

	@FindBy(xpath = "//select[@id='empsearch_termination']")
	private WebElement Include;

	@FindBy(xpath = "//input[@id='empsearch_supervisor_name']")
	private WebElement Supervisor_name;

	@FindBy(xpath = "//select[@id='empsearch_job_title']")
	private WebElement Job_title;

	@FindBy(xpath = "//select[@id='empsearch_sub_unit']")
	private WebElement Sub_title;

	@FindBy(xpath = "//input[@id='searchBtn']")
	private WebElement searchbtn;

	@FindBy(xpath = "//input[@id='resetBtn']")
	private WebElement resetbtn;

	//Add button's all elements will have to find & implement
	
	public Pimclass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void pim_empname() {
		pim_empname.sendKeys("Amit");
	}
	public void pim_empid() {
		pim_empid.sendKeys("1001");
	}
	public void Employment_status() {
		Select s = new Select(Employment_status);
		s.selectByVisibleText("All");
//		s.selectByVisibleText("Freelance");
//		s.selectByVisibleText("Full-Time Contract");
//		s.selectByVisibleText("Full-Time Permanent");
//		s.selectByVisibleText("Full-Time Probation");
//		s.selectByVisibleText("Part-Time Contract");
//		s.selectByVisibleText("Part-Time Internship");
//		s3.selectByVisibleText("");
	}
	public void Include() {
		Select s1 = new Select(Include);
		s1.selectByVisibleText("Current Employees Only");
//		s1.selectByVisibleText("Current and Past Employees");
//		s1.selectByVisibleText("Past Employees Only");
	}	
	public void Supervisor_name() {
		Supervisor_name.sendKeys("supervisor");
	}
	public void Job_title() {
		Select s2 = new Select(Job_title);
		s2.selectByVisibleText("All");
//		s2.selectByVisibleText("Automation Tester");
//		s2.selectByVisibleText("CEO");
//		s2.selectByVisibleText("Marketing Executive");
//		s2.selectByVisibleText("Vice President");
//		s3.selectByVisibleText("");		
	}
	public void Sub_title() {
		Select s3 = new Select(Sub_title);
		s3.selectByVisibleText("All");
//		s3.selectByVisibleText("Administration");
//		s3.selectByVisibleText("Engineering");
//		s3.selectByVisibleText("Development");
//		s3.selectByVisibleText("Quality Assurance");
//		s3.selectByVisibleText("  TechOps");
//		s3.selectByVisibleText("Sales & Marketing");
//		s3.selectByVisibleText("  Sales");
//		s3.selectByVisibleText("  Marketing");
//		s3.selectByVisibleText("Client Services");
//		s3.selectByVisibleText("  Technical Support");
//		s3.selectByVisibleText("Finance");
//		s3.selectByVisibleText("Human Resources");
//		s3.selectByVisibleText("");
	}
	public void searchbtn() {
		searchbtn.click();
	}
	public void resetbtn() {
		resetbtn.click();
	}

}
