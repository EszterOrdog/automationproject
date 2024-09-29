package test.automationtestproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
	
	
	
	
	
	@Test
	public void openbrowser()
	{
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://anilmishraqatesting.com/");
		driver.close();
		
		
		
		
		
		
		
	}
	

}
