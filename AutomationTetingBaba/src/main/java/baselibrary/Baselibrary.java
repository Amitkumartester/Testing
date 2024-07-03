package baselibrary;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import applicationutility.ApplicationUtility;
import excelutility.ExcelUtility;
import screenshotutility.ScreenShotUtility;

import org.apache.commons.collections4.iterators.ArrayListIterator;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Baselibrary implements ExcelUtility , ApplicationUtility , ScreenShotUtility {
		
	public static WebDriver driver;
	
	public void launchUrl(
			) throws InterruptedException 
	{
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\eclipse-workspace\\AutomationTetingBaba\\webdriver1\\chromedriver.exe");
	   driver = new ChromeDriver();
		driver.get("https://testingbaba.com/old/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Override
public String getreaddata(int sheetno, int rowno, int colno) 
{
	String path ="C:\\Users\\Arjun\\eclipse-workspace\\AutomationTetingBaba\\ExcelRead\\BDK.xlsx"; 
	String value="";
	try 
	{
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(sheetno);
		value=sheet.getRow(rowno).getCell(colno).getStringCellValue();
		
	}catch(Exception e) {
		System.out.println("Issue in get read data :"+e);
	}
	return value;
}

	@Override
	public String getReadData(String key) {
		String path="C:\\Users\\Arjun\\eclipse-workspace\\AutomationTetingBaba\\ExcelRead\\config.properties";
		 String val ="";
		 try
		 {
			 FileInputStream fis = new FileInputStream (path);
			 Properties prop =new Properties();
			 prop.load(fis);
			 val = prop.getProperty(key);
		 } catch(Exception e) 
		 {
			 System.out.println("Issue in get read data :" +e); 
		 }
		 return val;
	}

	@Override
	public void switchtoWindow(int index) {
		
		Set<String> handles = driver.getWindowHandles();
		ArrayListIterator<String> listofhandles = new ArrayListIterator<String>(handles);
		
		
	}

	@Override
	public void waitforClick(WebElement ele) {
		WebDriverWait Wait = new WebDriverWait(driver, 20);
		Wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		
		
	}

	@Override
	public void waitforVisibility1(WebElement ele) {
		WebDriverWait Wait = new WebDriverWait(driver, 20);
		Wait.until(ExpectedConditions.visibilityOf(ele));
		
		
	}

	@Override
	public void waitforalert() {
		WebDriverWait Wait = new WebDriverWait(driver, 20);
		Wait.until(ExpectedConditions.alertIsPresent());
		
		
	}

	@Override
	public void mouseOver(WebElement ele) {
		Actions act = new Actions (driver);
		act.moveToElement(ele).build().perform();
		
	}

	@Override
	public void doubleclick(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rightclick(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickme(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchtowindow(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void waitforVisibilty(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectbyvisibletext(WebElement ele, String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectbyindex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectbyvalue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseOver(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getScreenShot(String folderName, String FileName) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMddhhmmss");
		String currentdate = sdf.format(date);
		String loc = System.getProperty("user.dir");
		String path = loc +" //Screenshot//"+ folderName +"//"+ FileName+ currentdate +".png";
		try {
			EventFiringWebDriver efw = new EventFiringWebDriver(driver);
			File src = efw.getScreenshotAs(OutputType.FILE);
			File des = new File(path);
			FileUtils.copyFile(src, des);
		} catch (Exception e) {
			System.out.println("issue in take screen shot" + e);
		}
		
	}
	@AfterMethod
	public void getresultanalysis(ITestResult result)
	{
		String filename = result.getMethod().getMethodName();
		if(result.getStatus()==ITestResult.SUCCESS) 
		{
			getScreenShot("pass", filename);
		}
		else if(result.getStatus()==ITestResult.FAILURE) 
		{
			getScreenShot("failed", filename);
		}
		
	}

	@Override
	public void uploadFile(String path) {
	
		try {
			StringSelection sel = new StringSelection(path);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(sel, null);
			
			Robot rob = new Robot();
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
			rob.keyPress(KeyEvent.VK_CONTROL);
			rob.keyPress(KeyEvent.VK_V);
			rob.keyPress(KeyEvent.VK_V);
			rob.keyPress(KeyEvent.VK_CONTROL);
			
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.delay(250);
			rob.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			System.out.println("issue in upload file" + e);
			
		}
		
	}

}

	
