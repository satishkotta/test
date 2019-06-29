package com.Guru99ecommerce.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Item_tv_menu {
	
public WebDriver ldriver;
	
	public Item_tv_menu(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[@href='http://live.guru99.com/index.php/tv.html']")WebElement item_tv;
	@FindBy(xpath=".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a")WebElement tv_wishlist;
	@FindBy(xpath="//SPAN[text()='Share Wishlist']")WebElement sharewishlist;
	@FindBy(name="emails")WebElement email;
	@FindBy(id="message")WebElement description;
	@FindBy(xpath="(//BUTTON[@type='submit'])[2]")WebElement sharewishlistbtn;
	
	@FindBy(xpath="//SPAN[text()='Your Wishlist has been shared.']")WebElement successmessage;
	public void tv_menu()
	{
		item_tv.click();
	}
	
	public void cart()
	{
		tv_wishlist.click();
	}
	
	public void wishlist()
	{
		sharewishlist.click();
	}
	
	public void mail()
	{
		email.sendKeys("purnapcn@gmail.com");
	}
	
	public void description()
	{
		description.sendKeys("HI hello");
	}
	
	public void wishlistbtn()
	{
		sharewishlistbtn.click();
	}
	
	public String  message()
	{
		return successmessage.getText();
	}

}
