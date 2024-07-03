package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Checkboxpages extends Baselibrary 
{

	public Checkboxpages() 
    {
    	PageFactory.initElements(driver, this);
    }
    
	
	@FindBy(xpath ="//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath ="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath ="//button[@data-target=\"#elements\"]")
	private WebElement elements;
	
	@FindBy(xpath ="//a[text()=\"check box\"]")
	private WebElement checkbox;
	
	@FindBy(xpath ="//input[@id=\"myCheck\"]")
	private WebElement mobile;
	
	@FindBy(xpath ="//iframe[@src=\"Checkbox.html\"]")
	private WebElement frame;
	
	
	
	public void ClickonClose() 
	{
		close.click();
	}
	
	public void ClickonPractice() 
	{
		practice.click();
	}
	
	public void ClickonElements() 
	{
		elements.click();
	}
	public void Clickoncheckbox() 
	{
		checkbox.click();
	}
	public void Clickonmobile() 
	{
		driver.switchTo().frame(frame);
		mobile.click();
		driver.switchTo().defaultContent();
	}
	
	
	
	
	}

