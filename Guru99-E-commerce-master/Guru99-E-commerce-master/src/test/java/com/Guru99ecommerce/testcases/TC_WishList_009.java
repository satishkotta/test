package com.Guru99ecommerce.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.Guru99ecommerce.PageObjects.WishList;

public class TC_WishList_009 extends BaseClass {
	
	@Test(priority=12)
	public void wishlistcheck() throws InterruptedException
	{
		try {
			
			WishList list=new WishList(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			list.wishlist();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			list.cart();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
