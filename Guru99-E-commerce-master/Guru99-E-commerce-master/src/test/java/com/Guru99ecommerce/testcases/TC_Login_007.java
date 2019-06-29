package com.Guru99ecommerce.testcases;

import org.testng.annotations.Test;

import com.Guru99ecommerce.PageObjects.Login;

public class TC_Login_007 extends BaseClass {
	
	@Test(priority=10)
	public void login() throws InterruptedException
	{
		Login login=new Login(driver);
		login.Account();
		Thread.sleep(2000);
		login.login();
		Thread.sleep(2000);
		login.setusername(username);
		Thread.sleep(2000);
		login.setpassword(password);
		Thread.sleep(2000);
		login.submit();
	}

}
