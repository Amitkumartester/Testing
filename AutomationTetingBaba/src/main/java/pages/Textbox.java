package pages;


import java.util.ArrayList;
import java.util.List;

import org.apache.poi.util.IntList;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Textbox extends Baselibrary {
public Textbox() {
	PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath ="//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath ="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath ="//button[@data-target=\"#elements\"]")
	private WebElement elements;
	
	@FindBy(xpath ="//a[text()='text box']")
	private WebElement textbox;
	
	@FindBy(xpath ="//input[@id=\"fullname1\"]")
	private WebElement fullname;
	
	@FindBy(xpath ="//input[@id=\"fullemail1\"]")
	private WebElement fullemail;
	
	@FindBy(xpath ="//textarea[@id=\"fulladdresh1\"]")
	private WebElement fulladdress;
	
	@FindBy(xpath ="//textarea[@id=\"paddresh1\"]")
	private WebElement prmanentaddess;
	
	@FindBy(xpath ="//input[@value=\"Submit\"]")
	private WebElement submit;
	
	@FindBy(xpath ="//div[@class=\"col-md-6 mt-5\"]/label")
	private List<WebElement> list;
	
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
	
	public void Clickontextbox() 
	{
		textbox.click();
	}
	public void ClickonFillDetails() 
	{
		fullname.sendKeys(getreaddata(0,1,0));
		fullemail.sendKeys(getreaddata(0,1,1));
		fulladdress.sendKeys(getreaddata(0,1,2));
		prmanentaddess.sendKeys(getreaddata(0,1,3));
		submit.click();
		
	}
	
	public void getValidate() 
	{
		ArrayList<String> expected = new ArrayList<>();
		ArrayList<String> actual = new ArrayList<>();
		for(int i=0; i<=3; i++) 
		{
			expected.add(getreaddata(0,1,i));
		}
		for(int i=1; i<list.size(); i=i+2) 
		{
			actual.add(list.get(i).getText());
		}
		for(int i=0; i<=3; i++) 
		{
			Assert.assertEquals(actual.get(i),expected.get(i));
		}
		
	}
	
	
	
	
	
	
}
