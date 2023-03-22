package Com.NewTours.TestCases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.NewTours.BaseTest.baseTest;
import Com.NewTours.Pages.HomePage;
import Com.NewTours.Pages.RegisterPage;

public class RegisterPageTest extends baseTest {

	RegisterPage RegisterPage;
	HomePage HomePage;

	public RegisterPageTest() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@BeforeMethod
	public void setUp() throws IOException {
		inilization();
		RegisterPage = new RegisterPage();
	}

	@Test
	public void verifyHomePageTest() {
		RegisterPage.verifyRegister("abc", "xyz", "563565262", "abc@gmail.com", "AdrUK", "CtyBA", "SK", "344333", "abx",
				"abc@123", "abc@123");

	}

	@AfterMethod
	public void dearDown() {
		driver.quit();
	}

}
