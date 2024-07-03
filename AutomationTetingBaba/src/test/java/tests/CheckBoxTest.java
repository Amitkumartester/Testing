package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Checkboxpages;

public class CheckBoxTest extends Baselibrary{
	
Checkboxpages ob;
	
	
	@BeforeTest
	public void launchUrl() 
	{
		launchURL();
		ob = new Checkboxpages();
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
	@Test(priority = 3)
	public void clickoncheckbox() 
	{
		ob.Clickoncheckbox();
	}
	@Test(priority = 4)
	public void clickonmobile() 
	{
		ob.Clickonmobile();
	}

}
