package hrm.OrnageProject.TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import hrm.OrnageProject.Pages.AddEmpolyee;
import hrm.OrnageProject.Pages.LoginPage;
import hrm.OrnageProject.Utilities.Browser;
import hrm.OrnageProject.Utilities.ReadData;



public class TC002 {
	static WebDriver driver;
	@BeforeClass()
	public void browserSetup() {
	driver=Browser.openBrowser();
	Browser.openURL();
	}
	@AfterClass()
	public void tearDown() {
		Browser.closeBrowser();
	}
	@Test(priority=1)
	public void verifyHRMLogin() throws Exception {
		
		String uname=ReadData.getData("logindetails","username");
		String pass=ReadData.getData("logindetails","password");
		LoginPage login=new LoginPage(driver);
		login.hrmLogin(uname,pass);
		
		
	}
	@Test(priority=2,dependsOnMethods="verifyHRMLogin")
	public void verifyHRMAddEmplyee() throws Exception {
		
		AddEmpolyee add=new AddEmpolyee(driver);
		String fname=ReadData.getData("empdetails","firstname");
		String lname=ReadData.getData("empdetails","lastname");
		System.out.println(fname+" "+lname);
		add.hrmAddEmpolyee(fname,lname);
		
	}

}
