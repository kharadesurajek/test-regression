package BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WikiTextExtractTest {

	static WebDriver driver;
	static String compare2;
	
	
	@BeforeTest
	public static WebDriver LaunchChrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Skharade\\Downloads\\MystoreTestNG\\MystoreTestNG\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/");
		driver.manage().window().maximize();
		// return driver;
		return driver;
}
	
	@Test
	public void extractTextFromWiki() throws InterruptedException {
		
		WebElement a=driver.findElement(By.xpath("//input[@name=\"search\"]"));
		Thread.sleep(8000);
		
		a.sendKeys("Pushpa: The Rise - Part 1");
		
		WebElement b=driver.findElement(By.xpath("//input[@class=\"searchButton\"]"));
		b.click();
		Thread.sleep(8000);
		
		WebElement c=driver.findElement(By.xpath("//table[@class='infobox vevent']/tbody/tr[12]"));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", c);
		
		String compare2=c.getText();
		
		System.out.println(compare2);
		
	}
}
