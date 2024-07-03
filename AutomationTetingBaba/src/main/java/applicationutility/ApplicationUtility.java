package applicationutility;

import org.openqa.selenium.WebElement;

public interface ApplicationUtility {

		public void doubleclick(WebElement ele);
		public void rightclick(WebElement ele);
		public void clickme(WebElement ele);
		public void switchtowindow(int index );
		public void waitforClick(WebElement ele);
		public void waitforVisibilty(WebElement ele);
		public void waitforalert();
		public void selectbyvisibletext(WebElement ele, String text);
		public void selectbyindex(WebElement ele , int index);
		public void selectbyvalue(WebElement ele, String value);
		public void mouseOver(WebElement ele);
		public void uploadFile(String path);
	}
