package com.Guru99ecommerce.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public WebDriver ldriver;
	
	public Login(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath=".//*[@id='header']/div/div[2]/div/a/span[2]") WebElement Account;
	@FindBy(xpath=".//*[@id='header-account']/div/ul/li[6]/a") WebElement Login;
	@FindBy(name="login[username]")WebElement username;
	@FindBy(name="login[password]")WebElement password;
	@FindBy(name="send")WebElement Loginbtn;
	
	public void Account()
	{
		Account.click();
	}
	public void login()
	{
		Login.click();
	}
	
	public void setusername(String user)
	{
		username.sendKeys(user);
	}
	public void setpassword(String pwds)
	{
		password.sendKeys(pwds);
	}
	public void submit()
	{
		Loginbtn.click();
	}
	
	

}
