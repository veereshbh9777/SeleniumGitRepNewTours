package Com.NewTours.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.NewTours.BaseTest.baseTest;

public class FlightsPage extends baseTest {

	public FlightsPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Flights']")
	WebElement clickFlights;

	@FindBy(xpath = "//input[@name=\"tripType\"][2]")
	WebElement selectTripleRadioBtn;

	@FindBy(xpath = "//input[@value=\"Business\"]")
	WebElement selectBusinessRadioBtn;

	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/p/font/b/font[1]")
	WebElement getTextOfFlight;

	@FindBy(xpath = "//input[@name=\"findFlights\"]")
	WebElement clickOnContinueBtn;

	public void verifyFlights() throws InterruptedException {
		clickFlights.click();
		if (driver.getCurrentUrl().equals("https://demo.guru99.com/test/newtours/reservation.php")) {
			selectTripleRadioBtn.click();
			Select passangers = new Select(driver.findElement(By.xpath("//select[@name=\"passCount\"]")));
			passangers.selectByIndex(2);
			Thread.sleep(2000);
			Select selectDepFrom = new Select(driver.findElement(By.xpath("//select[@name=\"fromPort\"]")));
			selectDepFrom.selectByVisibleText("New York");
			Thread.sleep(2000);
			Select selectMonths = new Select(driver.findElement(By.xpath("//select[@name=\"fromMonth\"]")));
			selectMonths.selectByVisibleText("May");
			Thread.sleep(2000);
			Select selectDay = new Select(driver.findElement(By.xpath("//select[@name=\"fromDay\"]")));
			selectDay.selectByIndex(7);
			Thread.sleep(2000);
			Select selectArrivingIn = new Select(driver.findElement(By.xpath("//select[@name=\"toPort\"]")));
			selectArrivingIn.selectByVisibleText("Sydney");
			selectBusinessRadioBtn.click();
			Select selectAirline = new Select(driver.findElement(By.xpath("//select[@name=\"airline\"]")));
			selectAirline.selectByVisibleText("Unified Airlines");
			clickOnContinueBtn.click();
			System.out.println(getTextOfFlight.getText());
		} else {
			driver.getCurrentUrl().equals("https://demo.guru99.com/test/newtours/reservation2.php#google_vignette");
				driver.navigate().refresh();
				Thread.sleep(2000);
				verifyFlights();
			}
		driver.navigate().to("https://demo.guru99.com/test/newtours/index.php");
	}
}
