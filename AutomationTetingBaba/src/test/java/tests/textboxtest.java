package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Textbox;

public class textboxtest extends Baselibrary{
	Textbox ob;
	
	
	@BeforeTest
	public void launchUrl() 
	{
		launchURL();
		ob = new Textbox();
	}
	@Test(priority = 0)
	public void ClickonClose() 
	{
        ob.ClickonClose();
	}
	@Test(priority = 1)
	public void clickonpractice() 
	{
		ob.ClickonPractice();
	}
	@Test (priority = 2)
	public void clickonelement() 
	{
		ob.ClickonElements();
	}
	@Test (priority = 3)
	public void clickonTextbox() 
	{
		ob.Clickontextbox();
	}
	@Test (priority = 4)
	public void clickonfilldetails() 
	{
		ob.ClickonFillDetails();
	}
	@Test (priority = 5)
	public void getValidate() 
	{
		ob.getValidate();
	}
	

}
