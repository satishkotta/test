package com.Guru99ecommerce.PageObjects;

import java.awt.dnd.DragGestureEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareProducts {
	
	public WebDriver ldriver;
	public  CompareProducts(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath=".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a")WebElement Sony_comapre;
	
	@FindBy(xpath=".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a")WebElement Iphone_compare;
	
	@FindBy(xpath="//SPAN[text()='Compare']") WebElement Comparebutton;
	
	@FindBy(xpath=".//*[@id='top']/body/div[1]/div[1]/h1")WebElement chaildwindowverification;
	
	@FindBy(xpath=".//*[@id='product_comparison']/tbody[1]/tr[1]/td[1]/h2/a") WebElement sony_presnt;
	
	@FindBy(xpath=".//*[@id='product_comparison']/tbody[1]/tr[1]/td[2]/h2/a")WebElement iphone_present;
	
	@FindBy(xpath="//*[@class='button']") WebElement closewindow;
	
	
	
	public void sony_compare_btn()
	{
		Sony_comapre.click();
	}
	
	public void iphone_compare_btn()
	{
		Iphone_compare.click();
	}
	
	
	
	
	public void comparebtn() throws InterruptedException
	{
		String winHandleBefore = ldriver.getWindowHandle();
		Comparebutton.click();
		Thread.sleep(3000);
		
		for (String winHandle : ldriver.getWindowHandles()) {
			ldriver.manage().timeouts().implicitlyWait(800,
					TimeUnit.MILLISECONDS);
			ldriver.switchTo().window(winHandle);
			ldriver.manage().timeouts().implicitlyWait(800,
					TimeUnit.MILLISECONDS);
		}
		//ldriver.close();
		ldriver.manage().timeouts().implicitlyWait(800,
				TimeUnit.MILLISECONDS);
		ldriver.switchTo().window(winHandleBefore);
		Thread.sleep(9000);

	
	}
	
	
	
	public String windowverification()
	{
		return chaildwindowverification.getText();
	}
	
	public String sony_text()
	{
		return sony_presnt.getText();
	}
	

	public String iphone_text()
	{
		return iphone_present.getText();
	}
	
	
	
	

}
