package com.Guru99ecommerce.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.Guru99ecommerce.PageObjects.Billing_Info;
import com.Guru99ecommerce.utility.XLUtilites;

public class TC_BillingInfoAddress_011 extends BaseClass {
	
	@Test(priority=14,dataProvider="registerdata",dataProviderClass=XLUtilites.class)
	public void Billingaddress(String name,String llname,String addresss,String city,String zzip,String mobile)
	{
		try {
			
			
			Billing_Info info=new Billing_Info(driver);
			info.dropdown();
			info.fname(name);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			info.lname(llname);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			info.add(addresss);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			info.city(city);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			info.zip(zzip);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			info.phone(mobile);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			info.altaddress();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			info.continue1();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test(priority=15,dataProvider="registerdata",dataProviderClass=XLUtilites.class)
	public void Shippingaddress(String bname,String bllname,String baddresss,String bcity,String bzzip,String bmobile)
	{
		try {
			
			Billing_Info info=new Billing_Info(driver);
			Thread.sleep(10000);
			info.dropdown1();
			info.bfname(bname);
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			info.blname(bllname);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			info.badd(baddresss);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			info.bcity(bcity);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			info.bzip(bzzip);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			info.bphone(bmobile);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			info.continues();
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
			info.shipingmethod();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			info.shippngradio();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			info.Shpcontinue();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	

}
