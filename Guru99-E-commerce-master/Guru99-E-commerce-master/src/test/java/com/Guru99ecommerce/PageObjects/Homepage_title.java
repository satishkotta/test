package com.Guru99ecommerce.PageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage_title {
	
	public WebDriver ldriver;
	
	public  Homepage_title(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath=".//*[@id='nav']/ol/li[1]/a")
	WebElement Mclic;

	@FindBy(xpath=".//*[@class='sort-by']/select[@title='Sort By']") 
	WebElement sort;
	
	@FindBy(xpath=".//*[@class='product-name']")
	WebElement namesort;
	
	public void Moblecat()
	{
		Mclic.click();
	}
	
	public void select_sort()
	{
		Select select=new Select(sort);
		select.selectByIndex(1);
	}
	
	public void select_sort1()
	{
		Select select=new Select(sort);
		select.selectByIndex(0);
	}
	public void getname()
	{
		List<WebElement> elements = ldriver.findElements(By.xpath(".//*[@class='product-name']"));
		System.out.println(elements.size());
		
		for (int i = 0; i < elements.size(); i++) {
			
			System.out.println("Prodcut names "   +elements.get(i).getText());
			
		}
		
		ArrayList<String> names=new ArrayList<String>();
		for (int i = 0; i < elements.size(); i++) {
			
			names.add(elements.get(i).getText());
			
			
		}
		
		Collections.sort(names);
		
		for (int i = 0; i < elements.size(); i++) {
			
			if(!elements.get(i).getText().equalsIgnoreCase(names.get(i)))
			{
				System.out.println("Not mahed");
				break;
			}
			
			
			
		}
		
		
	}
	
	
	
	
	
	

}
