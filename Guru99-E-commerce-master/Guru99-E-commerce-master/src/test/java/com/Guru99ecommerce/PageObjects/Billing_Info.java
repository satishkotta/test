package com.Guru99ecommerce.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Billing_Info {
	
	public WebDriver ldriver;
	public Billing_Info(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//BillingInfo
	
	
	@FindBy(id="billing:firstname")WebElement firstname;
	@FindBy(id="billing:lastname")WebElement lastname;
	@FindBy(id="billing:street1")WebElement address;
	@FindBy(id="billing:city")WebElement city;
	@FindBy(id="billing:region_id")WebElement state;
	@FindBy(id="billing:postcode")WebElement zip;
	@FindBy(id="billing:telephone")WebElement teliphone;
	@FindBy(id="billing:use_for_shipping_no")WebElement shippinradio;
	@FindBy(xpath="(//BUTTON[@type='button'])[1]")WebElement continuebtn;
	
	
	//ShippingInfo
	
	@FindBy(id="shipping:firstname")WebElement bfirstname;
	@FindBy(id="shipping:lastname")WebElement blastname;
	@FindBy(id="shipping:lastname")WebElement baddress;
	@FindBy(id="shipping:city")WebElement bcity;
	@FindBy(id="shipping:region_id")WebElement bstate;
	@FindBy(id="shipping:postcode")WebElement bzip;
	@FindBy(id="shipping:country_id") WebElement country;
	@FindBy(id="shipping:telephone")WebElement bteliphone;
	
	@FindBy(xpath=".//*[@id='shipping-buttons-container']/button")WebElement continuebtns;
	
	
	//Shipping Method
	
	@FindBy(xpath=".//*[@id='shipping-method-buttons-container']/button")WebElement shipmethodcontinue;
	@FindBy(xpath=".//*[@id='dt_method_checkmo']/label") WebElement shippingradio;
	
	@FindBy(xpath=".//*[@id='review-buttons-container']/button")WebElement contin;
	
	//Billing methods
	
	public void dropdown()
	{
		Select drop=new Select(ldriver.findElement(By.id("billing-address-select")));
		drop.selectByVisibleText("New Address");
	}
	
	public void fname(String name)
	{
		firstname.clear();
		firstname.sendKeys(name);
	}
	
	public void lname(String laname)
	{
		lastname.clear();
		lastname.sendKeys(laname);
	}

	public void add(String addrs)
	{
		address.clear();
		address.sendKeys(addrs);
	}

	public void city(String cname)
	{
		city.clear();
		city.sendKeys(cname);
	}

	public void state()
	{
		Select state=new Select(ldriver.findElement(By.id("billing:region_id")));
		state.selectByIndex(9);
	}

	public void zip(String pin)
	{
		zip.clear();
		zip.sendKeys(pin);
	}

	public void phone(String cell)
	{
		teliphone.clear();
		teliphone.sendKeys(cell);
	}
	
	public void altaddress()
	{
		
		shippinradio.click();
	}
	
	public void continue1()
	{
		continuebtn.click();
	}

	//Shippingaddress methods
	
	
	public void dropdown1()
	{
		Select drop1=new Select(ldriver.findElement(By.id("shipping-address-select")));
		drop1.selectByVisibleText("New Address");
	}
	public void bfname(String bname) throws InterruptedException
	{
		Thread.sleep(10000);
		bfirstname.clear();
		bfirstname.sendKeys(bname);
	}
	
	public void blname(String blaname)
	{
		blastname.clear();
		blastname.sendKeys(blaname);
	}

	public void badd(String baddrs)
	{
		baddress.clear();
		baddress.sendKeys(baddrs);
	}

	public void bcity(String bcname)
	{
		bcity.click();
		bcity.sendKeys(bcname);
	}

	public void bstate()
	{
		Select state=new Select(ldriver.findElement(By.id("shipping:country_id")));
		state.selectByIndex(9);
	}

	public void bzip(String bpin)
	{
		bzip.clear();
		bzip.sendKeys(bpin);
	}
	
	public void country()
	{
		Select state=new Select(ldriver.findElement(By.id("shipping:region_id")));
		state.selectByIndex(9);
	}


	public void bphone(String bcell) throws InterruptedException
	{
		bteliphone.clear();
		bteliphone.sendKeys(bcell);
		Thread.sleep(10000);
		
	}
	
	
	
	public void continues() throws InterruptedException
	{
		Thread.sleep(10000);
		continuebtns.click();
	}
	
	public void shipingmethod()
	{
		shipmethodcontinue.click();
	}
	
	public void shippngradio()
	{
		shippingradio.click();
	}
	
	public void Shpcontinue()
	{
		contin.click();
	}

	
}
