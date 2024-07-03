package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Alertpage;


 

	public class AlertTest extends Baselibrary
	{
		Alertpage ob;
		
		@BeforeTest
		public void lunchURL1()
		{
			launchUrl();
			ob=new Alertpage();
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
	     public void Clickonalert()
	     {
	     	ob.clickonAlert();
	     }
		 @Test(priority = 5)
		 public void Clickonalertstab() 
		 {
			 ob.clickonalertsTab();
		 }
		 @Test(priority = 6)
		 public void Clickonclickme() 
		 {
			 ob.clickonClickme();
		 }
	     
	     
	     	
	}
