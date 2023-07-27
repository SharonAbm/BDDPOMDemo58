package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ShoppingCartPage extends TestBase{
	@FindBy(css= "div.cart > button.call-to-action")
	WebElement chkoutBtn;
	WebElement totalAmt;
	
	public ShoppingCartPage() {
		PageFactory.initElements(driver, this);
	}
	public boolean isItemAdded() {
		String strAmt= totalAmt.getText();
		double dblAmt= Double.parseDouble(strAmt);
		if(dblAmt>0) {
			return true;
		}
		else
			return false;

	}
	public void checkOut() {
		chkoutBtn.click();
	}
	//applyCoupon()
	//emptyCart()

}
