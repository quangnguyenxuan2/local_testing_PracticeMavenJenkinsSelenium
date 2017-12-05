package phpTravel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Commons.Log;
import Object.LogInPage;
import Object.SignUpPage;
import Utils.Global;

public class CheckFunctionSignUp {

	public static WebDriver Driver;
	private SignUpPage signUpPage;
	
	@BeforeMethod
	public void Set_Up() throws InterruptedException{	  
	    Driver = new FirefoxDriver();
	    Driver.navigate().to(Global.URL_signUp);
	    //Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	//isue not a number FF48
	    Thread.sleep(5000);
	    Log.info("Browser has set up completed");
		signUpPage = new SignUpPage(Driver);
	}
	
	@Test
	public void CheckSignUpSuccess(){
		Log.debug("***Starting Check SignUp Success");
		signUpPage.EnterFirstName("QuangTester");
		Log.info("Entered Firstname has successed");
		signUpPage.EnterLastName("Nguyen");
		Log.info("Entered Lastname has successed");
		signUpPage.EnterPhone("0123456789","Entered Phone has successed" );
		signUpPage.EnterEmail("super_man_1111@gmai.com", "Entered Email has successed");
		
	}
	
	public void End_Test(){
		Driver.close();
		Log.info("Browser has closed completed");
	}
}
