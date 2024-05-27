package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PagePbject.PhonePage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DigitalNSEsteps {

	public WebDriver driver;
	public PhonePage Pp;

	@Given("user launch the Chrome Browser")
	public void user_launch_the_chrome_browser() {
		driver = new ChromeDriver();
		WebDriverManager.chromiumdriver().setup();
		driver.manage().window().maximize();
		Pp = new PhonePage(driver);

	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("User click on the Samsung s24 phone")
	public void user_click_on_the_samsung_s24_phone() throws InterruptedException {

		Pp.ClickOnPhone();
	}

	@When("User selects Specifications")
	public void user_selects_specifications() {
		Pp.clickOnSpecification();
	}

	@When("User clicks on next page")
	public void user_clicks_on_next_page() throws InterruptedException {
		Pp.clickNextPage();
	}

	@When("User lands on offer page and select continue")
	public void user_lands_on_offer_page_and_select_continue() throws InterruptedException {
		Pp.continueOffer();
	}

	@Then("User lands on plan page and selects plan")
	public void user_lands_on_plan_page_and_selects_plan() throws InterruptedException {
		
		Pp.selectPlan();
		Pp.deviceProtection();
	}

}
