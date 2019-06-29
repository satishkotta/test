package com.Guru99ecommerce.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Guru99ecommerce.PageObjects.Login;
import com.Guru99ecommerce.PageObjects.UserRegister;
import com.Guru99ecommerce.utility.XLUtilites;

public class TC_Regitration_0006 extends BaseClass {
	
	@Test(priority=9,dataProvider="registerdata",dataProviderClass=XLUtilites.class,enabled=false)
	
	public void signup(String ffname,String llname,String eeemail,String ppword,String ccpaowrd) throws InterruptedException
	{
		UserRegister register=new UserRegister(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		register.Account();
		Thread.sleep(3000);
		register.Fname(ffname);
		Thread.sleep(2000);
		register.Lname(llname);
		Thread.sleep(2000);
		register.Email(eeemail);
		Thread.sleep(2000);
		register.password(ppword);
		Thread.sleep(2000);
		register.cpassword(ccpaowrd);
		Thread.sleep(2000);
		register.Registerbtn();
		Thread.sleep(5000);
		
		String VerifyMessage=register.Registertextverify();
		
		if(VerifyMessage.equals("Thank you for registering with Main Website Store."))
		{
			Assert.assertTrue(true);
			System.out.println("Registration is Success");
		}
		
		else
		{
			Assert.assertTrue(false);
			System.out.println("Registration is Fails");
			
			
			
		}
	}

}
