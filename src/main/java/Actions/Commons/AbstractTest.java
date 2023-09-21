package Actions.Commons;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public abstract class AbstractTest {
    protected enum Browser {
        CHROME,FIREFOX;
    }
    private WebDriver driver;
    private String projectPath = System.getProperty("user.dir");


    protected WebDriver getBrowserDriver(String browserName, String AppUrl) {
        Browser browser = Browser.valueOf(browserName.toUpperCase());
//		switch (browserName) {
//	case "chrome":
        switch (browser) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver","D:\\Selenium\\FrameWork_Selenium\\src\\main\\resources\\chromedriver.exe");
//                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                System.out.println("app test");
//			WebDriverManager.chromedriver().browserVersion("77.0.3865.40").setup();
//			System.setProperty("webdriver.chrome.driver", ".\\BrowserDriver\\chromedriver.exe");

                break;
            default:
                throw new RuntimeException("Please choose browser name");
        }
        driver.get(AppUrl);
        driver.manage().timeouts().implicitlyWait(GlobalConstant.TIME_OUT, TimeUnit.SECONDS);
        return driver;

    }
    protected WebDriver getBrowserDriver(String browserName) {
        Browser browser = Browser.valueOf(browserName.toUpperCase());
        switch (browser) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver","D:\\Selenium\\FrameWork_Selenium\\src\\main\\resources\\chromedriver.exe");

//                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            default:
                throw new RuntimeException("Please choose browser name");
        }
        driver.get("https://demo.guru99.com/v4");
        driver.manage().timeouts().implicitlyWait(GlobalConstant.TIME_OUT, TimeUnit.SECONDS);
        return driver;

    }
}

