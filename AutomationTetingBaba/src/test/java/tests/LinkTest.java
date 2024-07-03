package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.w3c.dom.stylesheets.LinkStyle;

import baselibrary.Baselibrary;
import pages.LinksPage;




	
	public class LinkTest extends Baselibrary
	{
		LinksPage ob1;
		
		@BeforeTest
		public void lunchURL1()
		{
			launchURL();
			ob1=new LinksPage();
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
	     @Test(priority = 4)
	     public void clickonlink() 
	     {
	    	 ob1.ClickonLink();
	     }
	     @Test(priority = 5)
	     public void clickondemopage() 
	     {
	    	 ob1.Clickondemopage();
	     }

	}
