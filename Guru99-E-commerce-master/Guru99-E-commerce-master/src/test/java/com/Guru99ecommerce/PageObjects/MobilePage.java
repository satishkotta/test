package com.Guru99ecommerce.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePage {
	
	public  WebDriver ldriver;
	
	public MobilePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//SPAN[@class='price'][text()='$100.00']") WebElement sonyPrice;
	
	@FindBy(xpath="//*[text()='Sony Xperia']")WebElement mobiletext;
	
	@FindBy(xpath="//*[@id='product-price-1']/span")WebElement moblesonyprice;
	
	
	public String mobileprice()
	{
		 return sonyPrice.getText();
		 
	}
	public void mobile_click()
	{
		mobiletext.click();
	}
	
	public String msprice()
	{
		return moblesonyprice.getText();
		
	}

}
