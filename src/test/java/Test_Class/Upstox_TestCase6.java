package Test_Class;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Liabraries.Upstox_BaseClass7;
import Liabraries.Upstox_UtilityClass8;
import main_module.Upstox_Page1;
import main_module.Upstox_Page2;
import main_module.Upstox_Page3;
import main_module.Upstox_Page4;
import main_module.Upstox_Page5;

public class Upstox_TestCase6 extends  Upstox_BaseClass7
{
	Upstox_Page1 obj1;
	Upstox_Page2 obj2;
	Upstox_Page3 obj3;
	Upstox_Page4 obj4;
	Upstox_Page5 obj5;
	
	
	@BeforeClass
	public void browseropen() throws EncryptedDocumentException, IOException
	{
		
		
		 invokebrowser();
		 
		 obj1=new Upstox_Page1(driver);
		 obj2=new Upstox_Page2(driver);
		 obj3=new Upstox_Page3(driver);
		 obj4=new Upstox_Page4(driver);
		 obj5=new Upstox_Page5(driver);
		
		
	}
	@BeforeMethod
	public void logintoapp() throws InterruptedException, EncryptedDocumentException, IOException
	{
       
       obj1.setUpstox_Page1UserId(Upstox_UtilityClass8.getTD(0, 0));
       
       obj1.setUpstox_Page1PassWord(Upstox_UtilityClass8.getTD(0, 1));
       obj1.clickUpstox_Page1SignIn();
       Thread.sleep(3000);
       
      
      obj2.setUpstox_Page2Code(Upstox_UtilityClass8.getTD(0, 2));
      
     obj3.clickUpstox_Page3OkBtn();
     Thread.sleep(3000);
		
	}
	
	@Test
	public void verifyUN() throws EncryptedDocumentException, IOException
	{
		
		String actname=obj4.verifyUpstox_Page4UserName();
		String exsname= Upstox_UtilityClass8.getTD(0, 3);
		
		Assert.assertEquals(actname, exsname);
		
	}
	
	@AfterMethod
	public void logouttoapp(ITestResult res) throws IOException
	{
		if(res.getStatus()==res.FAILURE) {
			
			Upstox_UtilityClass8.capturescreenshot(driver, 12);
			
		}
		
		
		obj5.clickUpstox_Page5LogOut();
		obj5.clickUpstox_Page5LogOut1();
	}
	
	@AfterClass
	public void browserclose()
	{
		obj1=null;
		obj2=null;
		obj3=null;
		obj4=null;
		obj5=null;
	
		driver=null;
	}
	
	

}
