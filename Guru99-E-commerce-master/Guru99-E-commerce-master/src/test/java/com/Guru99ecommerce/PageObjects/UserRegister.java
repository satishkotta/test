package com.Guru99ecommerce.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserRegister {
	
	public WebDriver ldriver;
	
	public UserRegister(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	
	@FindBy(xpath=".//*[@id='header']/div/div[2]/div/a/span[2]") WebElement Account;
	
	@FindBy(xpath=".//*[@id='header-account']/div/ul/li[5]/a") WebElement Register;
	
	@FindBy(id="firstname") WebElement firstname;
	@FindBy(id="lastname") WebElement lastname;
	@FindBy(id="email_address") WebElement email;
	@FindBy(id="password") WebElement password;
	@FindBy(id="confirmation") WebElement conformpassword;
	@FindBy(id="is_subscribed") WebElement Checkbox;
	@FindBy(xpath=".//*[@id='form-validate']/div[2]/button") WebElement Regbtn;
	
	@FindBy(xpath="//SPAN[text()='Thank you for registering with Main Website Store.']") WebElement RegiterText;
	
	public void Account(){
		Account.click();
		Register.click();
	}
	
	public void Fname(String finame)
	{
		firstname.sendKeys(finame);
	}
	
	public void Lname(String liname)
	{
		lastname.sendKeys(liname);
	}
	
	public void Email(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void password(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void cpassword(String cpwd)
	{
		conformpassword.sendKeys(cpwd);
	}
	
	public void Registerbtn()
	{
		Regbtn.click();
	}
	
	public String Registertextverify()
	{
		return RegiterText.getText();
	}
	

}
