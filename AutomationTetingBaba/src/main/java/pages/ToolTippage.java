package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class ToolTippage extends Baselibrary {
	
	public ToolTippage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath="//button[@class=\"btn btn-block p-0 text-left\"]")
	private WebElement element;
	
	@FindBy(xpath="//button[@data-target=\'#widget\']")
	private WebElement widgets;
	
	@FindBy(xpath="//a[text()='tool tips']")
	private WebElement tooltip;
	
	@FindBy(xpath="//button[@data-toggle=\"tooltip\"]")
	private WebElement hoverme;
	
	
	
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
	public void Clickonwidgets() 
	{
		waitforClick(widgets);
	}
	public void Clickontooltip() 
	{
		waitforClick(tooltip);
	}
	public void getattribute() 
	{
		mouseOver(hoverme);
		String title = hoverme.getAttribute("title");
		System.out.println(title);
		
		
	}
	


	
}
