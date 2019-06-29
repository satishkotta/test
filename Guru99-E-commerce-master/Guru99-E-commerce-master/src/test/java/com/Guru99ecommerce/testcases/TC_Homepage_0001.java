package com.Guru99ecommerce.testcases;

import java.awt.List;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Guru99ecommerce.PageObjects.Homepage_title;
import com.Guru99ecommerce.PageObjects.MobilePage;

public class TC_Homepage_0001 extends BaseClass {
	@Test(priority=1)
	public void title_verification() throws IOException
	{
		try {
			String Actual=driver.getTitle();
			//System.out.println(Actual);
			
			if(Actual.equals("Home page"))
			{
				
			Assert.assertTrue(true);
			System.out.println("Title Matched");
			}
			else
			{
				
				timestamp=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
				capturescreen(driver,timestamp);
				
				//Assert.fail();
				System.out.println("Title Not Matched");
				Assert.assertTrue(false);
			}
			
		} catch (Exception e) {
			errorMsg=e.getMessage();
		}
		
	}
	@Test(priority=2)
	public void Sort() throws InterruptedException
	{
		Homepage_title title=new Homepage_title(driver);
		title.Moblecat();
		Thread.sleep(3000);
		
	}
	
	
	@Test(priority=3)
	public void title_verification1()
	{
		String Actual=driver.getTitle();
		System.out.println(Actual);
		
		if(Actual.equals("Mobile"))
		{
			Assert.assertTrue(true);
			System.out.println("Title Matched");
		}
		
		else
		{
			timestamp=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
			try {
				capturescreen(driver,timestamp);
			} catch (IOException e) {
				errorMsg=e.getMessage();
			}
			Assert.assertTrue(false);
			System.out.println("Title Not Matched");
		}
	}
	@Test(priority=4)
	public void Sort_Name() throws InterruptedException
	{
		Thread.sleep(3000);
		Homepage_title title=new Homepage_title(driver);
		title.select_sort();
		Thread.sleep(3000);
		title.getname();
		Thread.sleep(5000);

	}

}
