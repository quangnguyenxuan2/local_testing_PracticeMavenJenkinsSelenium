package Object;

import org.apache.xpath.operations.NotEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Extension;

public class LogInPage {

	private WebDriver driver;
	private Extension ext;
	
	private static By txt_username = By.name("username");
	private static By txt_password = By.name("password");
	private static By chb_remember = By.id("remember-me");
	private static By btn_login = By.cssSelector(".btn.btn-action.btn-block.loginbtn");
	public static By msg_invalid = By.cssSelector(".alert.alert-danger");
	public static By msg_success = By.cssSelector(".alert.alert-success");
	
	public LogInPage(WebDriver _driver){
		this.driver = _driver;
		ext = new Extension(driver);
	}
	
	public boolean isPageCorrect(){
		String title_exp = "Login";
		String title_act = driver.getTitle();
		if(title_act.equals(title_exp)){
			return true;
		}
		return false;
	}
	
	public void EnterUsername(String username){
		WebElement elm_username = ext.CaptureElement(txt_username);
		elm_username.clear();
		elm_username.sendKeys(username);
	}
	
	public void EnterPassword(String password){
		WebElement elm_password = ext.CaptureElement(txt_password);
		elm_password.clear();
		elm_password.sendKeys(password);
	}
	
	public void ClickRememberMe(){
		WebElement elm_rememberme = ext.CaptureElement(chb_remember);
		if (!elm_rememberme.isSelected())
		{
			elm_rememberme.click();
		}
	}
	
	public void ClickButtonLogin(){
		WebElement elm_login = ext.CaptureElement(btn_login);
		elm_login.click();
	}
	
	public boolean isMessageInvalid(){
		WebElement elm_msg = ext.CaptureElement(msg_invalid);
		String msg_exp = "Invalid Email or Password";
		String msg_act = elm_msg.getText();
		if(msg_act.equals(msg_exp)){
			return true;
		}
		return false;			
	}
	
	public boolean isMessageSuccess(){
		WebElement elm_msg = ext.CaptureElement(msg_success);
		String msg_exp = "Redirecting Please Wait...";
		String msg_act = elm_msg.getText();
		if(msg_act.equals(msg_exp)){
			return true;
		}
		return false;
	}
}
