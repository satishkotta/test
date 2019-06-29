package com.Guru99ecommerce.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Guru99ecommerce.PageObjects.CompareProducts;

public class TC_CompareProducts_005 extends BaseClass {
	
	@Test(priority=8)
	public void Mobile_Comparison() throws InterruptedException
	{
		CompareProducts compare=new CompareProducts(driver);
		compare.sony_compare_btn();
		Thread.sleep(3000);
		compare.iphone_compare_btn();
		Thread.sleep(5000);
		compare.comparebtn();
		Thread.sleep(5000);		
		/*String headingcompare=compare.windowverification();
		
		String chaildsony=compare.sony_text();
		
		String chaildiphone=compare.iphone_text();
		
		
		if(headingcompare.equalsIgnoreCase("Compare Products"))
		{
			Assert.assertTrue(true);
		}
		
		else
		{
			Assert.assertTrue(false);
		}
		
		if(chaildsony.equalsIgnoreCase("Sony Xperia"))
		{
			Assert.assertTrue(true);
		}
		
		else {
			Assert.assertTrue(false);
			
		}
		
		if (chaildiphone.equalsIgnoreCase("IPhone")) {
			Assert.assertTrue(true);
			
		}
		
		else {
			Assert.assertTrue(false);
			
		}*/
	}

}
