package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.ChromeBrowser;

public class WikiPOM {

	
	WebDriver driver;

	// constructor
	public WikiPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		//this(driver);
	}
	
	// search field
	@FindBy(xpath = "//input[@name=\\\"search\\\"]")
	private WebElement searchField1;

	public void clickOnSearchField1() {

		// searchField1.click();
		searchField1.sendKeys("Pushpa: The Rise - Part 1");
	}

	//search button
	
	@FindBy(xpath = "//input[@class=\\\"searchButton\\\"]")
	private WebElement searchButton;

	public void clickOnSearchButton() {

		 searchButton.click();	
	}
	
	
	public void testWikiMethod() throws InterruptedException {
		
		ChromeBrowser.LaunchChrome();
		Thread.sleep(5000);
		 clickOnSearchField1() ;
		 Thread.sleep(5000);
		 clickOnSearchButton();
		 Thread.sleep(5000);
		WebElement c=driver.findElement(By.xpath("//table[@class='infobox vevent']/tbody/tr[12]"));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		

		js.executeScript("arguments[0].scrollIntoView();", c);
		
		String compare2=c.getText();
		
		System.out.println(compare2);
		
		
	}
	
	
	
	
	
	
	
	
	
}
