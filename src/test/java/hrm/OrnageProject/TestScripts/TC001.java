package hrm.OrnageProject.TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import hrm.OrnageProject.Pages.LoginPage;
import hrm.OrnageProject.Utilities.Browser;
import hrm.OrnageProject.Utilities.ReadData;




public class TC001 {
	WebDriver driver;
	@BeforeClass()
	public void browserSetup() {
	driver=Browser.openBrowser();
	Browser.openURL();
	}
	@AfterClass
	public void tearDown() {
		Browser.closeBrowser();
	}
	@Test()
	public void verifyHRMLogin() throws Exception {
		
		String uname=ReadData.getData("logindetails","username");
		String pass=ReadData.getData("logindetails","password");
		LoginPage login=new LoginPage(driver);
		login.hrmLogin(uname,pass);
		
		
	}
	

}
