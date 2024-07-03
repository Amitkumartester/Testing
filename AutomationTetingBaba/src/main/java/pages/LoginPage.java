package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

import org.openqa.selenium.WebElement;

public class LoginPage extends Baselibrary{
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath ="//a[text()='Practice']")
	private WebElement practice;
	
	public void ClickonClose() 
	{
		close.click();
	}
	
	public void Clickonpractice() 
	{
		practice.click();
	}

}
