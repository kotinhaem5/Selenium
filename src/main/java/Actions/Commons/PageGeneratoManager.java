package Actions.Commons;

import Actions.PageObject.*;
import org.openqa.selenium.WebDriver;


public class PageGeneratoManager {

    public static LoginPageObject getLoginPage(WebDriver driver) {
        return new LoginPageObject(driver);
    }

    public static RegisterPageObject getRegisterPage(WebDriver driver) {
        return new RegisterPageObject(driver);
    }

    public static MainPageObject getMainPage(WebDriver driver) {
        return new MainPageObject(driver);
    }

    public static NewCustomerPageObject getNewCustomerPage(WebDriver driver) {
        return new NewCustomerPageObject(driver);
    }

    public static DeposittPageObject getDeposittPage(WebDriver driver) {
        return new DeposittPageObject(driver);
    }

    public static EditCustomerPageObject getEditCustomerPage(WebDriver driver) {
        return new EditCustomerPageObject(driver);
    }

    public static FundTransferPageObject getFundTransferPage(WebDriver driver) {
        return new FundTransferPageObject(driver);
    }
}
