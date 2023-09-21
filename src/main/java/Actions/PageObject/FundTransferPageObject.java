package Actions.PageObject;

import Actions.Commons.AbstractPage;
import Actions.Commons.PageGeneratoManager;
import interfaces.PageUI_BankGuru.FundTransferPageUI;
import org.openqa.selenium.WebDriver;


public class FundTransferPageObject extends AbstractPage {
	WebDriver driver;
	public FundTransferPageObject(WebDriver driver) {
		this.driver =driver;
	}
	public LoginPageObject clickToLogoutLink() {
		// TODO Auto-generated method stub
		waitToElementClickable(driver, FundTransferPageUI.LOGOUT_LINK);
		clickToElement(driver, FundTransferPageUI.LOGOUT_LINK);
		waitToAlertPresence(driver);
		acceptAlert(driver);
//		return new LoginPageObject(driver);
		return PageGeneratoManager.getLoginPage(driver);
		}	

}
