package vTigerCrm;

import java.io.IOException;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commonUtils.BaseClassContacts;
import commonUtils.ExcelUtils;
import commonUtils.JavaUtil;
import commonUtils.ListenerImplementation;
import commonUtils.PropertyUtils;
import commonUtils.WebDriverUtils;


public class ContactsTestNg extends BaseClassContacts{
	ExcelUtils eutil = new ExcelUtils();
	JavaUtil jutil = new JavaUtil();
	PropertyUtils putil = new PropertyUtils();
	WebDriverUtils wutil = new WebDriverUtils();
	
	@Test
	public void contactChangeWindow() throws IOException, InterruptedException 
	{
//		WebDriver driver = new ChromeDriver();
//		wutil.maximize(driver);
//		wutil.implicitwait(driver);
//		String url = putil.getDataFromPropertyFile("url");
//		String username = putil.getDataFromPropertyFile("username");
//		String password = putil.getDataFromPropertyFile("password");
		String fname = eutil.getDataFromExcel("Contacts", 0, 1);
		String lname = eutil.getDataFromExcel("Contacts", 1, 1);
		String group = eutil.getDataFromExcel("Contacts", 2, 1);
		String org = eutil.getDataFromExcel("Contacts", 3, 1);
//		driver.get(url);
//		driver.findElement(By.name("user_name")).sendKeys(username);
//		driver.findElement(By.name("user_password")).sendKeys(password);
//		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("(//a[text()='Contacts'])[1]")).click();
		driver.findElement(By.cssSelector("img[alt='Create Contact...']")).click();
		driver.findElement(By.name("firstname")).sendKeys(fname + jutil.getRandomNumber());
		driver.findElement(By.name("lastname")).sendKeys(lname + jutil.getRandomNumber());
		driver.findElement(By.xpath("(//img[@src='themes/softed/images/select.gif'])[1]")).click();
		String childurl="http://localhost:8888/index.php?module=Accounts&action=Popup&popuptype=specific_contact_account_address&form=TasksEditView&form_submit=false&fromlink=&recordid=";
		wutil.switchwindow(driver,childurl);
		driver.findElement(By.name("search_text")).sendKeys(org+Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='qsp']")).click();
		String parenturl="http://localhost:8888/index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing";
		wutil.switchwindow(driver,parenturl);
		driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
		WebElement dropdwn = driver.findElement(By.name("assigned_group_id"));
		wutil.handledropdown(dropdwn, group);
		Thread.sleep(1000);
		LocalDateTime ldt=LocalDateTime.now();
//		System.out.println(ldt);
		String ldt1=ldt.toString().replace(':','-');
		wutil.screenshot(driver,"screenshot"+ldt1);
		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
//		WebElement img = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
//		wutil.mousehover(driver, img);
//		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}
}
