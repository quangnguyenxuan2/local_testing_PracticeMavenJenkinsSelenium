package phpTravel;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import javax.print.attribute.standard.PrinterLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import Object.AccountPage;
import Object.LogInPage;
import Object.SignUpPage;
import Utils.Browser;
import Utils.Global;
import bsh.Console;
import Commons.Log;

public class CheckFunctionLogin {

	public static WebDriver Driver;
	private LogInPage loginPage;
	
	@BeforeMethod
	public void Set_Up() throws InterruptedException{	  
	    Driver = new FirefoxDriver();
	    Driver.navigate().to(Global.URL_signIn);
	    //Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	//isue not a number FF48
	    Thread.sleep(5000);
	    Log.info("Browser has set up completed");
		loginPage = new LogInPage(Driver);
	}
	
	@Test
	public void CheckLoginAppNOTsuccess() throws InterruptedException{
		Log.debug("***Starting Check Login App Not Success");
		loginPage.EnterUsername("uncorrectemail@gmail.com");
		Log.info("Entered Username has successed");
		loginPage.EnterPassword("uncorrectpassword");
		Log.info("Entered Password has successed");
		loginPage.ClickRememberMe();
		Log.info("Checked Rememberme has successed");
		loginPage.ClickButtonLogin();
		Log.info("Clicked Submit has successed");
		Thread.sleep(1000);
		Assert.assertTrue(loginPage.isMessageInvalid());
	}
	
	@Test
	public void CheckLoginAppSuccess() throws InterruptedException{	
		Log.debug("***Starting Check Login App Success");
		loginPage.EnterUsername("super_man_9999@gmail.com");
		Log.info("Entered Username has successed");
		loginPage.EnterPassword("12345678");
		Log.info("Entered Password has successed");
		loginPage.ClickRememberMe();
		Log.info("Checked Rememberme has successed");
		loginPage.ClickButtonLogin();
		Log.info("Clicked Submit has successed");
		Thread.sleep(1000);
		Assert.assertTrue(loginPage.isMessageSuccess());
	}
	
	@AfterMethod
	public void End_Test(){
		Driver.close();
		Log.info("Browser has closed completed");
	}
}
