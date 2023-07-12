package BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImdbExtractText {
	
	static WebDriver driver;
	static String compare2;
	
	@BeforeTest
	public static WebDriver LaunchChrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Skharade\\Downloads\\MystoreTestNG\\MystoreTestNG\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://www.imdb.com/");
		driver.manage().window().maximize(); 
		return driver; 

	}
	 
	@Test(priority=1)
	public void extractTextFromIMDB() throws InterruptedException {
		
		//ChromeBrowser.LaunchChrome("https://www.imdb.com/");
		WebElement a=driver.findElement(By.xpath("//input[@name='q']"));
		
		
		
		a.sendKeys("Pushpa: The Rise Part-1");
		Thread.sleep(10000);
		WebElement b=driver.findElement(By.xpath("//*[@id='iconContext-magnify']"));
		b.click();
		
		Thread.sleep(15000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement c=driver.findElement(By.xpath("//div[@class=\"ipc-metadata-list-summary-item__tc\"]"));
		c.click();
		Thread.sleep(8000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(3000);
		WebElement e = driver.findElement(By.xpath("//a[@href=\"/title/tt9389998/releaseinfo?ref_=tt_dt_rdat\"][2]"));

		js.executeScript("arguments[0].scrollIntoView();", e);
		Thread.sleep(2000);
		String compare=e.getText();
		e.getText();
		System.out.println(e.getText());
		//System.out.println(e);
		
	}
	/*
	 * @Test(priority=2) public void extractTextFromWiki() throws
	 * InterruptedException {
	 * ChromeBrowser.LaunchChrome("https://en.wikipedia.org/"); WebElement
	 * a=driver.findElement(By.xpath("//input[@name=\"search\"]"));
	 * Thread.sleep(8000);
	 * 
	 * a.sendKeys("Pushpa: The Rise - Part 1");
	 * 
	 * WebElement
	 * b=driver.findElement(By.xpath("//input[@class=\"searchButton\"]"));
	 * b.click(); Thread.sleep(8000);
	 * 
	 * WebElement
	 * c=driver.findElement(By.xpath("//table[@class='infobox vevent']/tbody/tr[12]"
	 * ));
	 * 
	 * 
	 * JavascriptExecutor js = (JavascriptExecutor) driver;
	 * 
	 * Thread.sleep(3000); js.executeScript("arguments[0].scrollIntoView();", c);
	 * 
	 * String compare2=c.getText();
	 * 
	 * System.out.println(compare2);
	 * 
	 * }
	 */
	
}
