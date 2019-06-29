package com.Guru99ecommerce.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Guru99ecommerce.PageObjects.MobilePage;

public class TC_ReadPrice_002 extends BaseClass {

	@Test(priority=5)
	public void priceverificaion() throws InterruptedException
	{
		
		MobilePage price=new MobilePage(driver);
		String xperialprice=price.mobileprice();
		System.out.println(xperialprice);
		price.mobile_click();
		Thread.sleep(3000);
		
		String detailsprice=price.msprice();
		System.out.println(detailsprice);
		
		
		try {
			Assert.assertEquals(xperialprice, detailsprice);
			System.out.println("price matched");
			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
		
	}
	
	

}
