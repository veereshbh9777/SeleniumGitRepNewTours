package Com.NewTours.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.NewTours.BaseTest.baseTest;

public class HomePage extends baseTest {

	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name=\"userName\"]")
	WebElement enterUserNameInHome;

	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement enterPassInHome;

	@FindBy(xpath = "//input[@name=\"submit\"]")
	WebElement clickOnSubmitBtn;

	@FindBy(xpath = "//td[h3=\"Login Successfully\"]")
	WebElement getLoginSuccText;

	@FindBy(xpath = "//a[text()='SIGN-ON']")
	WebElement clickOnSignOn;

	@FindBy(xpath = "//a[text()='SUPPORT']")
	WebElement clickSupport;

	@FindBy(xpath = "//a[text()='CONTACT']")
	WebElement clickContact;

	@FindBy(xpath = "//a[text()='Flights']")
	WebElement clickFlights;

	@FindBy(xpath = "//a[text()='Hotels']")
	WebElement clickHotels;

	@FindBy(xpath = "//a[text()='Car Rentals']")
	WebElement clickCarRentals;

//	@FindBy(xpath = "//a[text()='Cruises']")
//	WebElement clickCruises;
//
//	@FindBy(xpath = "//a[text()='Destinations']")
//	WebElement clickDestinations;
//
//	@FindBy(xpath = "//a[text()='Vacations']")
//	WebElement clickVacations;

	public void verifyHomePage() throws InterruptedException {
		if (driver.getCurrentUrl().equals("https://demo.guru99.com/test/newtours/")) {
			System.out.println("Home Page Title Passed");
		} else {
			System.out.println("Home Page Title Failed");
		}
		enterUserNameInHome.sendKeys("abc");
		enterPassInHome.sendKeys("Abcdef@123");
		clickOnSubmitBtn.click();
		Thread.sleep(2000);
		if (driver.findElement(By.xpath("//tbody /tr / td //h3")).equals("Login Successfully")) {
			System.out.println("Login Successfully Passed");
		} else {
			System.out.println("Login Successfully Failed");
		}
		driver.navigate().to("https://demo.guru99.com/test/newtours/index.php");
	}
}
