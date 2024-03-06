package basicTestNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AjioTest {

		@Test(priority=1)
		public void facebook() 
		{
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com");	
		}
		
		@Test(priority=2,invocationCount = 2)
		public void amazon()
		{
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://www.amazon.in");
		}
}