package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser {

	
	public static WebDriver LaunchChrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Skharade\\Downloads\\chromedriver_win32 (5)\\chromedriver114.0.5735.90.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		return driver;
	}
	 
	/*
	 * public static WebDriver Launchedge(String URLS) {
	 * System.setProperty("webdriver.msedge.driver",
	 * "C:\\Users\\Skharade\\PlummWebAutomation\\plummHealth_webAutomation\\msedgedriver.exe"
	 * ); WebDriver driver = new ChromeDriver(); driver.get(URLS);
	 * driver.manage().window().maximize(); return driver; }
	 */
}
