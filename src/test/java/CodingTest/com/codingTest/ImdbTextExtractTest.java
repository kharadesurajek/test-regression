package CodingTest.com.codingTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.ChromeBrowser;
import POM.IMDBpage;
import POM.WikiPOM;

public class ImdbTextExtractTest extends IMDBpage{

	static WebDriver driver;
	static String compare;
	IMDBpage ip=new IMDBpage(driver);
	WikiPOM wp=new WikiPOM(driver);
	
	
	public ImdbTextExtractTest() {
		super(driver);
	}

	
	  @BeforeTest
	  
	  public void callBrowser() {
	  ChromeBrowser.LaunchChrome() ; }
	 
@Test
public void extractTextTestt() throws InterruptedException {
	
	wp.testWikiMethod();
	ip.clickSearchFieldMethod();

	
}

}
