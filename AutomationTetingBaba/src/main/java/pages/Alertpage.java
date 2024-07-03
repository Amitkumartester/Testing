package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Alertpage extends Baselibrary{
	
	public Alertpage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath="//button[@class=\"btn btn-block p-0 text-left\"]")
	private WebElement element;
	
	@FindBy(xpath="//button[@data-target=\"#alerts\"]")
	private WebElement alert;
	
	@FindBy(xpath="//a[text()='alerts']")
	private WebElement alertsTab;
	
	@FindBy(xpath="//button[@onclick=\"myalert()\"]")
	private WebElement Clickme;
	
	
	
	
	public void ClickOnClose()
	{
		close.click();
	}
	public void ClickOnPractice()
	{
		practice.click();
	}
	public void ClickOnElement()
	{
		element.click();
	}
	public void clickonAlert() 
	{
		waitforClick(alert);
	}
	
	public void clickonalertsTab() 
	{
		waitforClick(alertsTab);
	}
	public void clickonClickme() 
	{
		waitforClick(Clickme);
		driver.switchTo().alert().accept();
	}

	
	
}
