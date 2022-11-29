package main_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_Page3 
{
	@FindBy(xpath="//button[@data-id='declineTour']")private WebElement okbtn;
	
	public Upstox_Page3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickUpstox_Page3OkBtn()
	{
		okbtn.click();
	}

}
