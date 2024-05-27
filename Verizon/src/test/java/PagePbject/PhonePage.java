package PagePbject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhonePage {

	public WebDriver ldriver;

	public PhonePage pp;

	public PhonePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//div[@id='Samsung Galaxy S24-client']")
	WebElement selectphone;

	@FindBy(xpath = "//input[@id='clr13210362']")
	WebElement phoneColor;

	@FindBy(xpath = "//span[text()='128 GB']")
	WebElement phoneStorage;

	@FindBy(xpath = "//span[text()='New customer']")
	WebElement newCustomer;

	@FindBy(xpath = "//span[text()='one time payment']")
	WebElement modeOfPayment;

	@FindBy(xpath = "//span[text()='Next steps']")
	WebElement btnNextstep;

	@FindBy(xpath = "//span[text()='Continue']")
	WebElement btnContinue;

	@FindBy(xpath = "(//span[@class='HitArea-VDS__sc-pwxi3s-0 kmnnok'])[4]")
	WebElement continueOffer;
	
	@FindBy(xpath = "(//span[text()='Add popular plan'])[2]")
	WebElement selectPlan;
	
	@FindBy(xpath = "//span[text()='Add']")
	WebElement DeviceProtection;

	public void Scrollto(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView;", element);
		js.executeScript("arguments[0].click();", element);
	}

	public void Wait(WebElement element) {

		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(45));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void ClickOnPhone() throws InterruptedException {

		pp = new PhonePage(ldriver);
		pp.Scrollto(selectphone);
	}

	public void clickOnSpecification() {
		pp.Wait(phoneColor);	pp.Scrollto(phoneColor);
		pp.Wait(phoneStorage);	pp.Scrollto(phoneStorage);
		pp.Wait(newCustomer);  pp.Scrollto(newCustomer);
		pp.Wait(modeOfPayment);  pp.Scrollto(modeOfPayment);

	}

	public void clickNextPage() throws InterruptedException {
		pp.Scrollto(btnNextstep);
		Thread.sleep(3000);
		pp.Wait(btnContinue);
		pp.Scrollto(btnContinue);
	}

	 public void continueOffer() throws InterruptedException {
		pp.Wait(continueOffer);
		pp.Scrollto(continueOffer);
		Thread.sleep(3000);
	} 
	
	 public void selectPlan() throws InterruptedException {
		 pp.Wait(selectPlan);
		 pp.Scrollto(selectPlan);
		 Thread.sleep(3000);
	 }
	 
	 public void deviceProtection() throws InterruptedException {
		 pp.Wait(DeviceProtection);
		 pp.Scrollto(DeviceProtection);
		 Thread.sleep(3000);
	 }

}
