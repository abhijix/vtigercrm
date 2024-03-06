package basicDdt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

//		Properties p=new Properties();
		
		//step1: create object of dileinputstream class and in constructor pass the path of external file 
		//if we want to read the data from external resources then we use
		FileInputStream fis=new FileInputStream("src\\test\\resources\\Book1.xlsx");
		//step2: call a workbookfactory class from apache poi abd call create(inputstream)
		Workbook wb=WorkbookFactory.create(fis);
		
//		step3:call getsheet(string name) and enter sheet name
		Sheet sh=wb.getSheet("Sheet1");
		
//		step4:call getrow(int num) and enter the row number
		Row rw=sh.getRow(0);
		
//		step5:call getcell(int cell)
		Cell c1=rw.getCell(1);
		
//		step6:call getstringcellvalue()
		String data=c1.getStringCellValue();
		
		System.out.println(data);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(data);
		
		
		
		

	}

}
