package tests;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.RadioButtonPage;

public class RadioButtonTest extends Baselibrary
{
	RadioButtonPage ob1;
	@BeforeTest
	public void lunchURL1()
	{
		launchURL();
		ob1=new RadioButtonPage();
	}
	 @Test(priority = 1)
     public void Clickonclose()
     {
     	ob1.ClickOnClose();
     }
     @Test(priority = 2)
     public void clickonpractice()
     {
     	ob1.ClickOnPractice();
     }
     @Test(priority = 3)
     public void clickonelement()
     {
     	ob1.ClickOnElement();
     }
	@Test(priority=4)
	public void clickonradiobutton()
	{
		ob1.ClickOnRadioButton();
	}
	@Test(priority=5)
	public void clickonyes()
	{
		ob1.ClickOnYes();
	}
}
