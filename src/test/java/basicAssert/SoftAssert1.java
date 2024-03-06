package basicAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {

		@Test
		public void MyntraPage() 
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.myntra.com/");
			String actualUrl=driver.getCurrentUrl();
			String expectedUrl="https://www.myntra.com/";
			//create object of softassert class
			SoftAssert sa=new SoftAssert();
			//call assertequal(String actual, String expected)
			sa.assertEquals(actualUrl, expectedUrl);
			
			System.out.println("soft assert equals");
			sa.assertAll();
		}

}
