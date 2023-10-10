package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utility {
    WebDriver driver;

    public WebDriver initializeDriver(String browserName) {
//        switch (browserName) {
//            case "chrome":
//                driver = new ChromeDriver();
//                break;
//            case "firefox":
//                driver = new FirefoxDriver();
//                break;
//            default:
//                System.out.println("Invalid Browser name");
//                System.exit(1);
//        }

        if(browserName.equals("chrome")) {
            driver = new ChromeDriver();
            System.out.println("Chrome driver is now initialized");
        }
        else {
            System.out.println("Please pass the browser name as Chrome");
            System.exit(1);
        }
        return driver;

    }

    public Wait<WebDriver> genericWait(long time, WebDriver driver) {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        return wait;
    }


    public WebElement waitForElementToBeLocated(WebDriver driver, long time, By element) {
        Wait<WebDriver> wait = genericWait(time, driver);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

}








