package basicTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assertions {


	@Test
	public void MyntraPage() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		
		if(url.equals("https://www.myntra.com")) 
		{
			System.out.println("url is matching");
		}
		else
		{
			System.out.println("url is not matching");
		}
	}
	

}
