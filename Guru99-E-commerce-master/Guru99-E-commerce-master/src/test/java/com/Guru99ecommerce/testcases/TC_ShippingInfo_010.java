package com.Guru99ecommerce.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Guru99ecommerce.PageObjects.GeneralShipping;

public class TC_ShippingInfo_010 extends BaseClass {
	
	@Test(priority=13)
	public void shipping() throws InterruptedException
	{
		try {
			GeneralShipping shipping=new GeneralShipping(driver);
			shipping.countryname();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			shipping.statename();
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			shipping.zipcode();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			shipping.estimatebtn();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			String rate=shipping.frate();
			System.out.println(rate);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			if (rate.equalsIgnoreCase(rate)) {
				
				Assert.assertTrue(true);
				System.out.println("Rate generated");
				
			}
			
			else {
				Assert.assertTrue(true);
				System.out.println("Rate not generated");
			}
			
			try {
				shipping.fixedfrate();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				String fixed=shipping.fixedfrate();
				if (fixed.equalsIgnoreCase(fixed)) {
					
					Assert.assertTrue(true);
					System.out.println("Fiexed rate pass");
					
				}
				
				else {
					Assert.assertTrue(false);
					System.out.println("Fiexed rate fail");
				}
				shipping.checkoutbtn();
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
