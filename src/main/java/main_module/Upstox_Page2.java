package main_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_Page2 
{
	@FindBy(xpath="//input[@name='yob']")private WebElement code;



public Upstox_Page2(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void setUpstox_Page2Code(String pin)
{
	code.sendKeys(pin);
}
}