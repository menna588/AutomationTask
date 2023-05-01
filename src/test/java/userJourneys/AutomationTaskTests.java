package userJourneys;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;

import io.qameta.allure.Description;
import pages.BasePage;


public class AutomationTaskTests {

	SHAFT.GUI.WebDriver driver;


	@Description("Given I am on Home page\nAnd I Navigate successfully to Jawy URL\nThen I can view all page elemnets as excepted")
	@Test(priority=1)
	public void NavigationTest_Success() {
		new BasePage(driver).navigate().assertonLogoIsDisplayed().assertonCurrentCountry();
	}
	@Description("Given I am on Home page\nAnd I Navigate successfully to Jawy URL\nThen I can view Light package")
	@Test(priority=2)
	public void LightPackageTest() {
		new BasePage(driver).navigate().assertonPackageLight().assertonPackageLightPrice();
	}

	@Description("Given I am on Home page\nAnd I Navigate successfully to Jawy URL\nThen I can view basic package")
	@Test(priority=3)
	public void BasicPackageTest() {
		new BasePage(driver).navigate().assertonPackageBasic().assertonPackageBasicPrice();
	}
	
	@Description("Given I am on Home page\nAnd I Navigate successfully to Jawy URL\nThen I can view Premium package")
	@Test(priority=4)
	public void PremiumPackageTest() {
		new BasePage(driver).navigate().assertonPackagePremium().assertonPackagePremiumPrice();
	}
	
	@Description("Given I am on Jawy page\nAnd select UAE country\nThen I can view all packages prices")
	@Test(priority=5)
	public void CountryUAEPackagesTest() {
		new BasePage(driver).navigate()
		.clickonCountryButton()
		.SelectCountry(BasePage.Country_UAE())
		.assertonPackageLightPrice()
		.assertonPackageBasicPrice()
		.assertonPackagePremiumPrice();
	}
	
	@Description("Given I am on Jawy page\nAnd select Algeria country\nThen I can view all packages prices")
	@Test(priority=6)
	public void CountryAlgeriaPackagesTest() {
		new BasePage(driver).navigate()
		.clickonCountryButton()
		.SelectCountry(BasePage.Country_Algeria())
		.assertonPackageLightPrice()
		.assertonPackageBasicPrice()
		.assertonPackagePremiumPrice();
	}
	
	@Description("Given I am on Jawy page\nAnd select Djibouti country\nThen I can view all packages prices")
	@Test(priority=7)
	public void CountryDjiboutiPackagesTest() {
		new BasePage(driver).navigate()
		.clickonCountryButton()
		.SelectCountry(BasePage.Country_Djibouti())
		.assertonPackageLightPrice()
		.assertonPackageBasicPrice()
		.assertonPackagePremiumPrice();
	}

	@Description("Given I am on Jawy page\nAnd select chad country\nThen I can view all packages prices")
	@Test(priority=8)
	public void CountrychadiPackagesTest() {
		new BasePage(driver).navigate()
		.clickonCountryButton()
		.SelectCountry(BasePage.Country_chad())
		.assertonPackageLightPrice()
		.assertonPackageBasicPrice()
		.assertonPackagePremiumPrice();
	}

	@Description("Given I am on Jawy page\nAnd select iraq country\nThen I can view all packages prices")
	@Test(priority=9)
	public void CountryiraqiPackagesTest() {
		new BasePage(driver).navigate()
		.clickonCountryButton()
		.SelectCountry(BasePage.Country_iraq())
		.assertonPackageLightPrice()
		.assertonPackageBasicPrice()
		.assertonPackagePremiumPrice();
	}

	@Description("Given I am on Jawy page\nAnd select Jordan country\nThen I can view all packages prices")
	@Test(priority=10)
	public void CountryJordanPackagesTest() {
		new BasePage(driver).navigate()
		.clickonCountryButton()
		.SelectCountry(BasePage.Country_Jordan())
		.assertonPackageLightPrice()
		.assertonPackageBasicPrice()
		.assertonPackagePremiumPrice();
	}
	
	@Description("Given I am on Jawy page\nAnd select Lebanon country\nThen I can view all packages prices")
	@Test(priority=11)
	public void CountryLebanonPackagesTest() {
		new BasePage(driver).navigate()
		.clickonCountryButton()
		.SelectCountry(BasePage.Country_Lebanon())
		.assertonPackageLightPrice()
		.assertonPackageBasicPrice()
		.assertonPackagePremiumPrice();
	}

	@Description("Given I am on Jawy page\nAnd select Morocco country\nThen I can view all packages prices")
	@Test(priority=12)
	public void CountryMoroccoPackagesTest() {
		new BasePage(driver).navigate()
		.clickonCountryButton()
		.SelectCountry(BasePage.Country_morocco())
		.assertonPackageLightPrice()
		.assertonPackageBasicPrice()
		.assertonPackagePremiumPrice();
	}
	
	@Description("Given I am on Jawy page\nAnd select Oman country\nThen I can view all packages prices")
	@Test(priority=13)
	public void CountryOmanPackagesTest() {
		new BasePage(driver).navigate()
		.clickonCountryButton()
		.SelectCountry(BasePage.Country_oman())
		.assertonPackageLightPrice()
		.assertonPackageBasicPrice()
		.assertonPackagePremiumPrice();
	}
	
	@Description("Given I am on Jawy page\nAnd select Tunisia country\nThen I can view all packages prices")
	@Test(priority=14)
	public void CountryTunisiaPackagesTest() {
		new BasePage(driver).navigate()
		.clickonCountryButton()
		.SelectCountry(BasePage.Country_Tunisia())
		.assertonPackageLightPrice()
		.assertonPackageBasicPrice()
		.assertonPackagePremiumPrice();
	}
	
	@Description("Given I am on Jawy page\nAnd select Yemen country\nThen I can view all packages prices")
	@Test(priority=15)
	public void CountryYemenPackagesTest() {
		new BasePage(driver).navigate()
		.clickonCountryButton()
		.SelectCountry(BasePage.Country_Yemen())
		.assertonPackageLightPrice()
		.assertonPackageBasicPrice()
		.assertonPackagePremiumPrice();
	}	@Description("Given I am on Jawy page\nAnd select Palestine country\nThen I can view all packages prices")
	@Test(priority=16)
	public void CountryPalestinePackagesTest() {
		new BasePage(driver).navigate()
		.clickonCountryButton()
		.SelectCountry(BasePage.Country_Palestine())
		.assertonPackageLightPrice()
		.assertonPackageBasicPrice()
		.assertonPackagePremiumPrice();
	}
	@Description("Given I am on the Sign In page\nAnd I attempt to Sign In with valid email and wrong password\nThen validation error message appears")
	@BeforeClass
	public void beforeClass() {		
		driver = new SHAFT.GUI.WebDriver();
		new BasePage(driver).navigate();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
