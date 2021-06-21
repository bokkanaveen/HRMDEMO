package com.JavaProject;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample_Test {
	static WebDriver driver;
	private static By CurrentWorldPopulation=By.xpath("//div[@class='maincounter-number']//span[@class='rts-counter'] ");
	private static By todayWorldBirths=By.xpath("//div//div[@class='col1in']//div[@class='sec-counter']//span[@class='rts-counter'] [@rel='births_today']");
	private static By todayWorldDeaths=By.xpath("//div//div[@class='col1in']//div[@class='sec-counter']//span[@class='rts-counter'] [@rel='dth1s_today']");
	private static By todayworldPopulationGrowth=By.xpath("//div//div[@class='col1in']//div[@class='sec-counter']//span[@class='rts-counter'] [@rel='absolute_growth']");
	private static By worldBirthsThisYear=By.xpath("//div//div[@class='col2in']//div[2]//div//span[@class='rts-counter'][@rel='births_this_year'] ");
	private static By worldDeathsThisYear=By.xpath("//div//div[@class='col2in']//div[3]//div//span[@class='rts-counter'][@rel='dth1s_this_year']");
	private static By worldPopulationGrowthThisYear=By.xpath("//div//div[@class='col2in']//div[4]//div//span[@class='rts-counter'][@rel='absolute_growth_year']");
	
	@BeforeClass
	public  void browser_Setup() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		
		
	}
	private  void cuurent_World_Population() {
		WebElement Current_World_Population=driver.findElement(CurrentWorldPopulation);
		System.out.println("Current World Population:"+Current_World_Population.getText());		
	}
	private void today_World_Births() {
		WebElement today_World_Births=driver.findElement(todayWorldBirths);
		System.out.println("Today World Births:"+today_World_Births.getText());
	}
	private void today_World_Deaths() {
		WebElement today_World_Deaths=driver.findElement(todayWorldDeaths);
		System.out.println("Today World Deaths:"+today_World_Deaths.getText());
	}
	private void today_World_Population_Growth() {
		WebElement Today_World_Population_Growth=driver.findElement(todayworldPopulationGrowth);
		System.out.println("Today World Population Growth:"+Today_World_Population_Growth.getText());
	}
	private void world_Births_This_Year() {
		WebElement World_Births_This_Year=driver.findElement(worldBirthsThisYear);
		System.out.println("World Births This Year:"+World_Births_This_Year.getText());
	}
	private void world_Deaths_This_Year() {
		WebElement World_Deaths_This_Year=driver.findElement(worldDeathsThisYear);
		System.out.println("World Births This Year:"+World_Deaths_This_Year.getText());
	}
	private void world_Population_Growth_This_Year() {
		WebElement World_Population_Growth_This_Year=driver.findElement(worldPopulationGrowthThisYear);
		System.out.println("World Population Growth This Year:"+World_Population_Growth_This_Year.getText());
	}
	@Test
	public void world_Population_Updates() {
		this.today_World_Births();
		this.today_World_Deaths();
		this.today_World_Population_Growth();
		this.world_Births_This_Year();
		this.world_Deaths_This_Year();
		this.world_Population_Growth_This_Year();
		this.cuurent_World_Population();
	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
