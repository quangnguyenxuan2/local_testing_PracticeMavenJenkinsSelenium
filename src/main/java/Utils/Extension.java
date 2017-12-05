package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Commons.Log;

public class Extension {

	private WebDriver driver;
	
	public Extension(WebDriver _driver){
		this.driver = _driver;
	}
	
	public WebElement CaptureElement(By locator){
		if (locator == null)
		{
			Log.error("Locator/Element is null");
		}
		return driver.findElement(locator);
	}
	
	public void EnterText(By locator, String text){
		WebElement element = CaptureElement(locator);
		element.clear();
		element.sendKeys(text);		
	}
	
	public void WaitToPageLoad(){
		
	}
}
