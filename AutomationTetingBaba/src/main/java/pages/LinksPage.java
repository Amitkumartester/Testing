package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;
	
	public class LinksPage extends Baselibrary
	{
		public LinksPage()
		{
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//button[text()='×']")
		private WebElement close;
		
		@FindBy(xpath="//a[text()='Practice']")
		private WebElement practice;
		
		@FindBy(xpath="//button[@class=\"btn btn-block p-0 text-left\"]")
		private WebElement element;
		
		@FindBy(xpath="//a[@href ='#tab_6']")
		private WebElement link;
		
		@FindBy(xpath="//a[@href ='index.html']")
		private WebElement demo;
		
		
		
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
		public void ClickonLink() 
		{
			link.click();
		}
		public void Clickondemopage() 
		{
			demo.click();
			driver.switchTo().alert().accept();
		}
		
		

}
