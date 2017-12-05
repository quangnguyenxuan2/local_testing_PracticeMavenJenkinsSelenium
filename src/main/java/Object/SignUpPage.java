package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Commons.Log;
import Utils.Extension;

public class SignUpPage {

	private WebDriver driver;
	private Extension ext;
	
	private static By txt_firstname = By.name("firstname");
	private static By txt_lastname = By.name("lastname");
	private static By txt_phone = By.name("phone");
	private static By txt_email = By.name("email");
	private static By txt_password = By.name("password");
	private static By txt_confirmpwd = By.name("confirmpassword");
	private static By btn_submit = By.cssSelector(".signupbtn.btn_full.btn.btn-action.btn-block.btn-lg");
	
	public SignUpPage(WebDriver _driver){
		this.driver = _driver;
		ext = new Extension(driver);
	}
	
	public void EnterFirstName(String firstname){
		WebElement elm_firstname = ext.CaptureElement(txt_firstname);
		elm_firstname.clear();
		elm_firstname.sendKeys(firstname);
	}
	
	public void EnterLastName(String lastname){
		WebElement elm_lastname = ext.CaptureElement(txt_lastname);
		elm_lastname.clear();
		elm_lastname.sendKeys(lastname);
	}
	
	public void EnterEmail(String email, String log){
		ext.EnterText(txt_email, email);
		Log.info(log);
	}
	
	public void EnterPhone(String phone, String log){
		ext.EnterText(txt_phone, phone);
		Log.info(log);
	}
	
}
