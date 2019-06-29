package com.Guru99ecommerce.testcases;

import org.testng.annotations.Test;

import com.Guru99ecommerce.PageObjects.Addtocart;

public class TC_Addtocart_errormessageverification_003 extends BaseClass {
	
	@Test(priority=6)
	public void addcarterrorverification() throws InterruptedException
	{
		Addtocart cart=new Addtocart(driver);
		cart.addcart();
		Thread.sleep(3000);
		cart.qty_clr();
		Thread.sleep(3000);
		cart.qty_add();
		Thread.sleep(3000);
		cart.qtyupdatebtn();
		Thread.sleep(3000);
	}
	

}
