package basicDdt;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonUtils.PropertyUtils;

public class PropertyUtilsDriver {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		PropertyUtils pu=new PropertyUtils();
		String email=pu.getDataFromPropertyFile("email");
		System.out.println(email);

	}
	

}
