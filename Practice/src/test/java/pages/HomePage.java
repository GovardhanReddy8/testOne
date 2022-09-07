package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	public void username(String text) {
		username.sendKeys(text);
	}
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	public void password(String text1) {
		password.sendKeys(text1);
	}
	@FindBy(xpath="//input[@id='login']")
	WebElement login;
	public void login() {
		login.click();	
	}
	
	public void doLogin(String text, String text1) {
		username.sendKeys(text);
		password.sendKeys(text1);
		login.click();
	}
}