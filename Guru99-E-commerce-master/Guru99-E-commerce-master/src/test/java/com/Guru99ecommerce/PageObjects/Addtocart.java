package com.Guru99ecommerce.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	
	public WebDriver ldriver;
	
	public Addtocart(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//BUTTON[@type='button']") WebElement Addcart_btn;
	
	@FindBy(xpath=".//*[@id='shopping-cart-table']/tbody/tr/td[4]/input")WebElement qty;
	
	@FindBy(xpath=".//*[@id='shopping-cart-table']/tbody/tr/td[4]/button") WebElement qty_update;
	
	public void addcart()
	{
		Addcart_btn.click();
	}
	
	public void qty_clr()
	{
		qty.clear();
	}
	
	public void qty_add()
	{
		qty.sendKeys("1000");
	}
	public void qtyupdatebtn()
	{
		qty_update.click();
	}
	

}
