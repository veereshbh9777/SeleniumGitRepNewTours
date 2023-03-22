package Com.NewTours.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.NewTours.BaseTest.baseTest;
import Com.NewTours.Pages.HomePage;

public class HomePageTest extends baseTest {

	HomePage HomePage;

	public HomePageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		inilization();
		HomePage = new HomePage();
	}

	@Test
	public void verifyHomePageTest() throws InterruptedException {
		HomePage.verifyHomePage();

	}

	@AfterMethod
	public void dearDown() {
		driver.quit();
	}

}
