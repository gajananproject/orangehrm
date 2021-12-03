package testpackage;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POMclasses.AdminModule6;
import POMclasses.Loginpage6;
import POMclasses.Mainpage6;
import POMclasses.Pimclass;
import basepackage.Baseclass;



public class LoginTestclass6 extends Baseclass {
	
	public static WebDriver driver;
	public static Loginpage6 login;
	public static Mainpage6 main;
	public static AdminModule6 am;
	public static Pimclass pim;
	
	@BeforeSuite
	
	public void setup() {
				
		System.out.println("Setup process is Completed \n");	
		
	}
	
	@BeforeTest
	@Parameters("browser")
	public void profile(String browser) {
		
		if(browser.equals("Chrome")) {
			driver = OpenChromeBrowser();
		}
		if(browser.equals("Firefox")) {
			driver = OpenFirefoxBrowser();
		}
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		
//		driver = OpenChromeBrowser();			
//		System.out.println(browser);
		System.out.println("Profile Setup process is completed \n");
	}
	
	@BeforeClass
	public void beforeclass() {		
		
		System.out.println("The Application Process is Completed \n");
		login = new Loginpage6(driver);	
		main = new Mainpage6(driver);
		am = new AdminModule6(driver);
		pim=new Pimclass(driver);
		
		login.sendusername();
		login.sendpassword();	
		login.clickonlogin();
		System.out.println("The login process of OrangeHMR is Completed \n");
	}
	
	@BeforeMethod
	public void beforemethod() throws InterruptedException {
		
		
		driver.navigate().refresh();
//		login.clickonwelcome();
//		Thread.sleep(3000);
//		login.clickonabout();
//		Thread.sleep(3000);
//		login.clickonclose();		
	}
	
	@Test(priority = 1)
	public void test1() throws InterruptedException{
		
		main.admin();
		if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		Thread.sleep(1000);
		
		am.username();
		am.usertype();
		am.emp_name();
		am.status();
		am.search_btn();
		am.add_btn();
		am.usertype1();
		am.empName();
		am.username1();
		am.status1();
		am.setpassword();
		am.confirmpassword();
		am.savebtn();
		//am.cancelbtn();
		
		
	}	
	@Test(priority = 2)
	public void test2() throws InterruptedException {
		
	main.PIM();	
	if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList")) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	Thread.sleep(1000);		
	pim.pim_empname();
	pim.pim_empid();
	pim.Employment_status();
	pim.Include();
	pim.Supervisor_name();
	pim.Job_title();
	pim.Sub_title();
	}
	
	@Test(priority = 3)
	public void test3() throws InterruptedException {
		main.leave();
		if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		Thread.sleep(1000);
		
	}
	
		@Test(priority = 4)
		public void test4() throws InterruptedException {
			main.time();
			if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/time/viewEmployeeTimesheet")) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
			Thread.sleep(1000);			
		}	
		
		@Test(priority = 5)
		public void test5() throws InterruptedException {
			main.recruitment();
			if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/recruitment/viewCandidates")) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
			Thread.sleep(1000);			
		}	
		
		@Test(priority = 6)
		public void test6() throws InterruptedException {
			main.MyDetails();			
			if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/pim/viewMyDetails")) {
				System.out.println("pass");
			}
		 	else {
				System.out.println("fail");
			}
			Thread.sleep(1000);
		}



		@Test(priority = 7)			
		public void test7() throws InterruptedException {
			System.out.println("Performance module is still under implementation/developing");
//			main.performance();
//			String url = driver.getCurrentUrl();   //For getting current url
//			System.out.println(url);			
//			if(driver.getCurrentUrl().equals("")) {
//				System.out.println("pass");
//			}
//			else {
//				System.out.println("fail");
//			}
//			Thread.sleep(1000);
		}

	
		@Test(priority = 8)
		public void test8() throws InterruptedException {
			main.dashboard();
			if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
			Thread.sleep(1000);			
		}	
		
		@Test(priority = 9)
		public void test9() throws InterruptedException {
			main.directory();
			if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/directory/viewDirectory/reset/1")) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
			Thread.sleep(1000);			
		}
		
		@Test(priority = 10)
		public void test10() throws InterruptedException {
			main.maintenance();

			if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/maintenance/purgeEmployee")) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
			Thread.sleep(1000);		
		}	
		
		@Test(priority = 11)
		public void test11() throws InterruptedException {
			main.buzz();
			if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/buzz/viewBuzz")) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
			Thread.sleep(1000);			
		}
		
		@Test(priority = 12)
		public void test12() throws InterruptedException {
			main.marketplace();

			if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/marketPlace/ohrmAddons")) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
			Thread.sleep(1000);			
		}		

		
	@AfterMethod
	public void aftermethod() throws InterruptedException {
		
				
	}
	
	@AfterClass
	public void afterclass() {
		login.clickonwelcome();
		login.clickonlogout();
		System.out.println("The logout process of OrangeHMR is Completed \n");
		
	}
	
	@AfterTest
	public void aftertest() {
		driver.quit();
		System.out.println("The Browser closing process Completed \n");
	}
	
	@AfterSuite
	public void aftersuite(){
		driver =null;
		System.gc();
		System.out.println("Garbage Collection method called\n");
	}

}
