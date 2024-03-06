package basicDdt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream fis=new FileInputStream("src\\test\\resources\\data.properties");
		Properties p=new Properties();
		
		
		p.load(fis);

		String urlVar=p.getProperty("url");
		driver.get(urlVar);
		String emailVar=p.getProperty("email");
		String passwordVar=p.getProperty("password");
		
		
		driver.findElement(By.id("email")).sendKeys(emailVar);
		driver.findElement(By.id("pass")).sendKeys(passwordVar);
		driver.findElement(By.id("last")).click();
		

	}

}
