package Com.NewTours.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.NewTours.BaseTest.baseTest;
import Com.NewTours.Pages.FlightsPage;

public class FlightsPageTest extends baseTest {

	FlightsPage FlightsPage;

	public FlightsPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		inilization();
		FlightsPage = new FlightsPage();
	}

	@Test
	public void verifyHomePageTest() throws InterruptedException {
		FlightsPage.verifyFlights();

	}

	@AfterMethod
	public void dearDown() {
		driver.quit();
	}

}
