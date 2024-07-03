package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import baselibrary.Baselibrary;
import pages.LoginPage;

public class Logintest extends LoginPage {
	
	LoginPage ob;
	
	@BeforeTest
	public void launchurl() 
	{
		launchURL();
		ob = new LoginPage();
	}
	
	@Test
	public void clickonclose() 
	{
		ob.ClickonClose();
	}
	@Test
	public void clickonpractice() 
	{
		ob.Clickonpractice();
	}

}
