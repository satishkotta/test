package com.Guru99ecommerce.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quantityerrormessage {
	
	public WebDriver ldriver;
	
	public Quantityerrormessage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath=".//*[@class='messages']/li/ul/li/span")WebElement errormsg;
	@FindBy(xpath="//*[@type='submit'][2]/span")WebElement emptycart;
	@FindBy(xpath="//H1[text()='Shopping Cart is Empty']")WebElement emptycart_msg;
	
	public String error_msg()
	{
		return errormsg.getText();
	}
	public void Empty_cart()
	{
		emptycart.click();

	}
	
	public String empty_msg_text()
	{
		return emptycart_msg.getText();
	}
	

}
