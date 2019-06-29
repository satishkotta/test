package com.Guru99ecommerce.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.Guru99ecommerce.utility.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	
	public static WebDriver driver;
	public static String timestamp;
	public static String testMethodName;
	public static String errorMsg;
	public static Logger logger;
	
	public String url=readconfig.getApplicationurl();
	
	public String username=readconfig.getusername();
	
	public String password=readconfig.getpassword();
	
	
	@org.testng.annotations.Parameters("browser")
	@BeforeSuite
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedrive\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get(url); 
		/*logger=LogManager.getLogger("Guru99ecommerce");*/
		/*System.setProperty("log4j.configurationFile","./log4j2.properties");*/
		//PropertyConfiguratorManager.configure("log4j.properties");
		driver.manage().window().maximize();
		/*logger.info("Browser is Maximize");*/
		
	}
	
	@AfterSuite(enabled=false)
	
	public void Close()
	{
		driver.close();
	}
	public void capturescreen(WebDriver driver, String tname) throws IOException
	{
		timestamp=tname;
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir") + "/Screenshots/"+ timestamp + ".png");
		FileHandler.copy(source, target);
		System.out.println("screenshot taken");
		
	}

}
