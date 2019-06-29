package com.Guru99ecommerce.PageObjects;

import org.apache.commons.codec.language.Nysiis;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList {
	
	public WebDriver ldriver;
	
	public WishList(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath=".//*[@id='top']/body/div[1]/div/div[2]/div/div[1]/div/div[2]/ul/li[8]/a")WebElement mywishlist;
	@FindBy(xpath="//SPAN[text()='Add to Cart']")WebElement Addtocart;
	
	
	public void wishlist()
	{
		mywishlist.click();
	}
	
	public void cart()
	{
	Addtocart.click();
	}

}
