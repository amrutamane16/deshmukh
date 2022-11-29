package main_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_Page4 
{
	@FindBy(xpath="//div[@data-id='accountDropDown']//span[1]")private WebElement username;
	
	public Upstox_Page4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	public void verifyUpstox_Page4UserName(String un)
//	{
//		String UN=username.getText();
//		boolean result=UN.equals(un);
//		System.out.println(result);
//		if(result==true)
//		{
//			System.out.println("TC PASS: VALID USER");
//		}
//		else
//		{
//			System.out.println("TC FAIL: INVALID USER");
//		}
//	}
//	
	public String verifyUpstox_Page4UserName()
	{
		String UN=username.getText();
		return UN;
	}
	

}
