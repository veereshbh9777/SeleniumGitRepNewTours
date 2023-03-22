package Com.NewTours.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.NewTours.BaseTest.baseTest;

public class RegisterPage extends baseTest {

	public RegisterPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='REGISTER']")
	WebElement clickOnRegister;

	@FindBy(xpath = "//input[@name=\"firstName\"]")
	WebElement enterFirstName;

	@FindBy(xpath = "//input[@name=\"lastName\"]")
	WebElement enterLastName;

	@FindBy(xpath = "//input[@name=\"phone\"]")
	WebElement enterPhone;

	@FindBy(xpath = "//input[@name=\"userName\"]")
	WebElement enterEmail1;

	@FindBy(xpath = "//input[@name=\"address1\"]")
	WebElement enterAddress;

	@FindBy(xpath = "//input[@name=\"city\"]")
	WebElement enterCity;

	@FindBy(xpath = "//input[@name=\"state\"]")
	WebElement enterState;

	@FindBy(xpath = "//input[@name=\"postalCode\"]")
	WebElement enterPostalCode;

	@FindBy(xpath = "//select[@name=\"country\"]")
	WebElement selectCountry;

	@FindBy(xpath = "//option[text()=\"ANDORRA\"]")
	WebElement selectAndorra;

	@FindBy(xpath = "//input[@id=\"email\"]")
	WebElement enterEmailUN;

	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement enterPassword;

	@FindBy(xpath = "//input[@name=\"confirmPassword\"]")
	WebElement selectConfirmPassword;

	@FindBy(xpath = "//input[@name=\"submit\"]")
	WebElement clickOnSubmitBtn;

	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b")
	WebElement getTextOfRegister;

	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/font/b")
	WebElement getTextOfRegisterUsers;

	@FindBy(xpath = "//a[text()=\"Home\"]")
	WebElement goToHomePage;

	
	public void verifyRegister(String Fname, String Lname, String Phone, String Email, String Address, String City,
			String State, String Postcode, String EmailUn, String Pwd, String CPwd) {
		clickOnRegister.click();
		enterFirstName.sendKeys(Fname);
		enterLastName.sendKeys(Lname);
		enterPhone.sendKeys(Phone);
		enterEmail1.sendKeys(Email);
		enterAddress.sendKeys(Address);
		enterCity.sendKeys(City);
		enterState.sendKeys(State);
		enterPostalCode.sendKeys(Postcode);
		selectCountry.click();
		selectAndorra.click();
		enterEmailUN.sendKeys(EmailUn);
		enterPassword.sendKeys(Pwd);
		selectConfirmPassword.sendKeys(CPwd);
		clickOnSubmitBtn.click();
		System.out.println(getTextOfRegister.getText());
		System.out.println(getTextOfRegisterUsers.getText());
//		goToHomePage.click();
		driver.navigate().to("https://demo.guru99.com/test/newtours/index.php");
	}
}
