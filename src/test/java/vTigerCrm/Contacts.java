package vTigerCrm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonUtils.ExcelUtils;
import commonUtils.JavaUtil;
import commonUtils.PropertyUtils;
import commonUtils.WebDriverUtils;

public class Contacts {
	ExcelUtils eutil = new ExcelUtils();
	JavaUtil jutil = new JavaUtil();
	PropertyUtils putil = new PropertyUtils();
	WebDriverUtils wutil = new WebDriverUtils();

	@Test
	public void loginConLogout() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		wutil.maximize(driver);
		wutil.implicitwait(driver);

		String url = putil.getDataFromPropertyFile("url");
		String username = putil.getDataFromPropertyFile("username");
		String password = putil.getDataFromPropertyFile("password");
		String fname = eutil.getDataFromExcel("Contacts", 0, 1);
		String lname = eutil.getDataFromExcel("Contacts", 1, 1);
		String group = eutil.getDataFromExcel("Contacts", 2, 1);

		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.xpath("(//a[text()='Contacts'])[1]")).click();
		driver.findElement(By.cssSelector("img[alt='Create Contact...']")).click();
		driver.findElement(By.name("firstname")).sendKeys(fname + jutil.getRandomNumber());
		driver.findElement(By.name("lastname")).sendKeys(lname + jutil.getRandomNumber());

		driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
		WebElement dropdwn = driver.findElement(By.name("assigned_group_id"));
		wutil.handledropdown(dropdwn, group);
		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		WebElement img = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
		wutil.mousehover(driver, img);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();


	}

}
