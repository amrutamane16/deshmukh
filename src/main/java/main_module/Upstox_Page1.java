package main_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_Page1 
{
	@FindBy(xpath="//input[@name='userId']")private WebElement userid;
	@FindBy(xpath="//input[@name='password']")private WebElement password;
	@FindBy(xpath="//button[@id='submit-btn']")private WebElement signin;
	
	public Upstox_Page1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUpstox_Page1UserId(String uid)
	{
		userid.sendKeys(uid);
	}
	public void setUpstox_Page1PassWord(String paswd)
	{
		password.sendKeys(paswd);
	}
	public void clickUpstox_Page1SignIn()
	{
		signin.click();
	}

}
