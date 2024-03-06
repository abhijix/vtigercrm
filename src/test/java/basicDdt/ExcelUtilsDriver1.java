package basicDdt;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonUtils.ExcelUtils;

public class ExcelUtilsDriver1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		ExcelUtils xl=new ExcelUtils();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url=xl.getDataFromExcel("Sheet1", 0, 1);
		driver.get(url);

	}

}
