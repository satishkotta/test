package com.Guru99ecommerce.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Guru99ecommerce.PageObjects.Homepage_title;
import com.Guru99ecommerce.PageObjects.Quantityerrormessage;

public class TC_Verifyerrormessage_qantity_004 extends BaseClass {
	
	@Test(priority=7)
	public void error_qty_msg() throws InterruptedException
	{
		Quantityerrormessage msg=new Quantityerrormessage(driver);
		String Actualmsg=msg.error_msg();
		System.out.println(Actualmsg);
		
		if(Actualmsg.equals("Some of the products cannot be ordered in requested quantity."))
		{
			Assert.assertTrue(true);
			System.out.println("Error message matched");
		}
		
		else
		{
			Assert.assertTrue(false);
			System.out.println("Error message not matched");
		}
		msg.Empty_cart();
		String msg1=msg.empty_msg_text();
		System.out.println(msg1);
		
		if (msg1.equalsIgnoreCase("Shopping Cart is Empty")) {
			
			Assert.assertTrue(true);
			
		}
		
		else
		{
			Assert.assertTrue(false);
		}
		
		Thread.sleep(3000);
		Homepage_title title=new Homepage_title(driver);
		title.Moblecat();
		title.select_sort1();
	}
	
	

}
