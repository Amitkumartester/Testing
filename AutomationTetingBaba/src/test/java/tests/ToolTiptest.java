package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.ToolTippage;

public class ToolTiptest extends Baselibrary {
	
	
		ToolTippage ob;
		
		@BeforeTest
		public void lunchURL1()
		{
			launchUrl();
			ob=new ToolTippage();
        }
		
		
		
		@Test(priority = 1)
	     public void Clickonclose()
	     {
	     	ob.ClickOnClose();
	     }
	     @Test(priority = 2)
	     public void clickonpractice()
	     {
	     	ob.ClickOnPractice();
	     }
	     @Test(priority = 3)
	     public void clickonelement()
	     {
	     	ob.ClickOnElement();
	     }
		@Test(priority = 4)
		public void ClickONWidgets() 
		{
			ob.Clickonwidgets();
		}
		@Test(priority = 5)
		public void ClickONTooltip() 
		{
			ob.Clickontooltip();
		}
		@Test(priority = 6)
		public void getAttribute() 
		{
			ob.getattribute();
		}
		
}
