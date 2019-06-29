package com.Guru99ecommerce.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Guru99ecommerce.PageObjects.Item_tv_menu;

public class TC_TvMenu_008 extends BaseClass {
	
	@Test(priority=11)
	public void TV() throws InterruptedException
	{
		Item_tv_menu tv=new Item_tv_menu(driver);
		tv.tv_menu();
		Thread.sleep(2000);
		tv.cart();
		Thread.sleep(2000);
		/*tv.wishlist();
		Thread.sleep(2000);
		tv.mail();
		Thread.sleep(2000);
		tv.description();
		Thread.sleep(2000);
		tv.wishlistbtn();
		String msg=tv.message();
		if (msg.equalsIgnoreCase("Your Wishlist has been shared.")) {
			
			Assert.assertTrue(true);
			System.out.println("added wishlist successfully");
			
		}
		
		else
		{
			Assert.assertTrue(false);
			System.out.println("added wishlist fails");
		}
		*/
	}
}
