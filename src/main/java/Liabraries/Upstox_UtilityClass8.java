package Liabraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Upstox_UtilityClass8 
{

	
	public static String getTD(int rowindex,int cellindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\amrut\\eclipse-workspace\\Upstox\\Data\\Harshad.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		 String value=sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		 return value;
	}
	
	public static  void  capturescreenshot(WebDriver driver,int TestCaseID) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\amrut\\eclipse-workspace\\Upstox\\ScrShot\\TCID"+TestCaseID+".jpg");
		FileHandler.copy(src, dest);
	}
}
