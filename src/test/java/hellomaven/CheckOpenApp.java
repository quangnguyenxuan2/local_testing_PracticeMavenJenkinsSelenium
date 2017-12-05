package hellomaven;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CheckOpenApp {
	
	public static WebDriver Driver;
 
	@Test
	public void CheckOpenAppSuccess() throws InterruptedException {  
      Driver = new FirefoxDriver();
      Driver.navigate().to("http://google.com.vn");
      //Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      Thread.sleep(5000);
      Driver.close();     
  }
}
