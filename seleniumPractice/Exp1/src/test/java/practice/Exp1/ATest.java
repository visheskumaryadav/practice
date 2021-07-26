package practice.Exp1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ATest {
  
	WebDriver driver;
	@Parameters({"URL"})
	@BeforeClass
	public void setup(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		driver=new ChromeDriver(); driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	
	@Test
	public void LinkCheck()
	{
		List<WebElement>LinkWebElements=driver.findElements(By.tagName("a"));
		for(WebElement x:LinkWebElements)
		{
			String url=x.getAttribute("href");
			try {
				HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
				conn.setRequestMethod("HEAD");
				conn.connect();
				int ResponseCode=conn.getResponseCode();
				if(ResponseCode>=400)
				{
					System.out.println("Broken link: " + url);
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
		}
	
	}
	
	@AfterClass
	public void setclose() {
		driver.close();
	}
}
