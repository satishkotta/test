package com.Guru99ecommerce.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GeneralShipping {
	public WebDriver ldriver;
	
	public GeneralShipping(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(id="region") WebElement state;
	@FindBy(id="postcode")WebElement zip;
	@FindBy(xpath=".//*[@id='shipping-zip-form']/div/button")WebElement Estimatelink;
	@FindBy(xpath=".//*[@id='co-shipping-method-form']/dl/dt")WebElement flatrate;
	
	@FindBy(xpath="(//SPAN[text()='Proceed to Checkout'][text()='Proceed to Checkout'])[1]") WebElement proceedcheckoutbtn;
	@FindBy(xpath=".//*[@id='co-shipping-method-form']/dl/dd/ul/li/label")WebElement ffrate;
	
	public void  countryname()
	{
		Select state=new Select(ldriver.findElement(By.id("country")));
		state.selectByIndex(14);
	}
	public void statename()
	{
		state.clear();
		state.sendKeys("New South Wales");
		/*Select country=new Select(ldriver.findElement(By.id("region")));
		country.selectByVisibleText("karnten");*/
		
	}
	
	
	public void zipcode()
	{
		zip.clear();
		zip.sendKeys("2000");
	}
	
	
	public void estimatebtn()
	{
		Estimatelink.click();
	}
	public String  frate()
	{
		return flatrate.getText();
	}
	
	public String  fixedfrate()
	{
		return ffrate.getText();
	}
	
	
	
	public void checkoutbtn()
	{
		proceedcheckoutbtn.click();
	}
}
