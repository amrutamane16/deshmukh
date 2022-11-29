package main_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_Page5 
{
	@FindBy(xpath="//span[@id='undefined_dropdown_btn']")private WebElement logout;
	@FindBy(xpath="(//div[@class='uqbo_NEcoyS6gkP91WmvE _1efklOF1Q_zOjHS0rpulvi']/div)[2]")private WebElement logout1;
	
	public Upstox_Page5(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickUpstox_Page5LogOut()
	{
		logout.click();
	}
	public void clickUpstox_Page5LogOut1()
	{
		logout1.click();
	}

}
