package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	
	private static WebDriver driver;
	
	public Browser(WebDriver _driver){
		this.driver = _driver;
	}

	public static WebDriver OpenBrowser(String browsername){
		if(browsername == "Chrome"){
			//System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browsername == "Firefox"){
			driver= new FirefoxDriver();
		}
		else if(browsername == "IE"){
			//System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void OpenURL(String url){
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
}
