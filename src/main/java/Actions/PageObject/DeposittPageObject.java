package Actions.PageObject;

import Actions.Commons.AbstractPage;
import Actions.Commons.PageGeneratoManager;
import interfaces.PageUI_BankGuru.EditCustomerPageUI;
import org.openqa.selenium.WebDriver;


public class DeposittPageObject extends AbstractPage {
	WebDriver driver;
	public DeposittPageObject(WebDriver driver) {
		this.driver = driver;
	}
	public EditCustomerPageObject openEditCustomerPage() {
		// TODO Auto-generated method stub
		waitToElementClickable(driver, EditCustomerPageUI.EDIT_CUSTOMER_LINK);
		clickToElement(driver, EditCustomerPageUI.EDIT_CUSTOMER_LINK);
		return PageGeneratoManager.getEditCustomerPage(driver);
	}

}
