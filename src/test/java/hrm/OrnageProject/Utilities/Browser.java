package hrm.OrnageProject.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	static WebDriver driver;
	
	public static WebDriver openBrowser() {
		WebDriverManager.edgedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\MY DOC\\SOFTWARE TOOLS\\Drivers\\chromedriver.exe");
		
		driver=new EdgeDriver();
		return driver;
	}
	public static void openURL() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
	}
	public static void closeBrowser() {
		driver.close();
	}
	public static void verifyHRMLogin(String ExpectedUrl) {
		String actualUrl=driver.getCurrentUrl();
		boolean status=actualUrl.contains(ExpectedUrl);
		Assert.assertEquals(status, true,"Expected Url did not match with actualUrl");
		
	}

}
