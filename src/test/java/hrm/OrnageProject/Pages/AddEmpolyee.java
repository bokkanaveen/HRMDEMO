package hrm.OrnageProject.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import hrm.OrnageProject.Utilities.Browser;





public class AddEmpolyee {
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	static WebDriver driver;
	private WebDriverWait wait;
	private By pim=By.xpath("//li[2]//a[@class='firstLevelMenu']");
	private By addEmp=By.xpath("//*[@id=\"menu_pim_addEmployee\"]");
	private By firstname=By.id("firstName");
	private By lastname=By.id("lastName");
	private By savebtn=By.id("btnSave");
	
	public AddEmpolyee(WebDriver driver) {
		this.driver=driver;
	}
	
		
	
	private void mousehover() {
		WebElement pimtab=driver.findElement(pim);
		Actions action=new Actions(driver);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		//js.executeScript("Arguments[0].click", pimtab);
		action.moveToElement(pimtab).build().perform();
	}
	private void clickOnAddEmp() {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(addEmp));
		//js.executeScript("Arguments[0].click", addEmp);
		driver.findElement(addEmp).click();
	}
	private void setFirstName(String fname){
		driver.findElement(firstname).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstname));
		driver.findElement(firstname).sendKeys(fname);
		
	}
	private void setLastName(String lname) {
		driver.findElement(lastname).clear();
		driver.findElement(lastname).sendKeys(lname);
	}
	private void clickOnSave() {
		driver.findElement(savebtn).click();
	}
	public void hrmAddEmpolyee(String fname,String lname) {
		this.mousehover();
		this.clickOnAddEmp();
		this.setFirstName(fname);
		this.setLastName(lname);
		this.clickOnSave();
		Browser.verifyHRMLogin("empNumber");
		Reporter.log("Add HRM Empolyee Functionality Verified");
		
	}

}
