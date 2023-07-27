package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckoutPage extends TestBase{
	@FindBy(css= "div.checkout h1")
	WebElement  pageHeading;
	
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}
	public boolean isCheckoutPage() {
		return pageHeading.isDisplayed();
	}

}
