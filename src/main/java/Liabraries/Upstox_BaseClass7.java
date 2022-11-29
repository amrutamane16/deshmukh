package Liabraries;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upstox_BaseClass7 
{
	public WebDriver driver;
	public void invokebrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amrut\\eclipse-workspace\\Upstox\\Browser\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login-v2.upstox.com/");
	}

}
