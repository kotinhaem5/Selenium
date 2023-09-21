package Test_Scenarios_BankGuru;

import Actions.PageObject.LoginPageObject;
import Actions.PageObject.MainPageObject;
import Actions.PageObject.NewCustomerPageObject;
import Actions.PageObject.RegisterPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class test1 {
    WebDriver driver;
    String loginPageUrl, userID, password;
    LoginPageObject loginPage;
    RegisterPageObject registerPage;
    MainPageObject mainPage;
    NewCustomerPageObject newCustomerPage;


    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver","D:\\Selenium\\FrameWork_Selenium\\src\\main\\resources\\chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver", ".\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("before class:----  " + driver.toString() + "----");
        driver.get("https://demo.guru99.com/v4");
//        driver.get("https://google.com");
        loginPage = new LoginPageObject(driver);
        mainPage = new MainPageObject(driver);
        newCustomerPage = new NewCustomerPageObject(driver);

    }
    @Test
    public void TC_01_Register_To_System() {

        System.out.println("TC_01_Register_To_System");
        loginPageUrl = loginPage.getLoginPageUrl();
        System.out.println(loginPageUrl);
//	  loginPage.clickToHereLink();
//	  registerPage.inputToEmailTextBox("vandang916@gamil.com");
//	  registerPage.clickToSubmitButton();
//	  userID = registerPage.getUserIDText();
//	  password = registerPage.getPasswordText();
    }

    @AfterClass
    public void afterClass() {
        driver.quit();


}
}
