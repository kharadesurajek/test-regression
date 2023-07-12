package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.ChromeBrowser;

public class IMDBpage {

	WebDriver driver;

	// constructor
	public IMDBpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		//this(driver);
	}



//search field
	@FindBy(xpath = "//input[@name='q']")
	private WebElement searchField1;

	public void clickOnSearchField1() {

		// searchField1.click();
		searchField1.sendKeys("Pushpa: The Rise - Part 1");
	}

	// search button
	@FindBy(xpath = "//*[@id='iconContext-magnify']")
	private WebElement searchButton;
	public void clickOnSearchButton() {

		searchButton.click();
	}

	
	
//exact match

	@FindBy(xpath = "//div[text()=\"Exact matches\"]")
	private WebElement exactMatchField;

	public void clickOnexactMatchField() {

		exactMatchField.click();

	}

	//result click
	@FindBy(xpath = "//div[@class=\"ipc-metadata-list-summary-item__tc\"]")
	private WebElement exactMatchField2;

	public void clickOnexactMatchField2() {

		exactMatchField2.click();

	}

	//release date
	@FindBy(xpath = "//a[@href=\"/title/tt9389998/releaseinfo?ref_=tt_dt_rdat\"][2]")
	private WebElement releaseDate;
	public void clickOnReleaseDate() {

		releaseDate.click();

	}
	
	
	public void clickSearchFieldMethod() throws InterruptedException {
ChromeBrowser.LaunchChrome();
Thread.sleep(3000);
		clickOnSearchField1();
		Thread.sleep(3000);
		clickOnSearchButton();
		Thread.sleep(5000);
		clickOnexactMatchField();
		Thread.sleep(8000);
		clickOnexactMatchField2();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.xpath("//a[@href=\"/title/tt9389998/releaseinfo?ref_=tt_dt_rdat\"][2]"));
		
		js.executeScript("arguments[0].scrollIntoView();", e);
		Thread.sleep(2000);
		e.getText();
		System.out.println(e.getText());
		
	}

}
