package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pageElements.Element;
import utilities.Utility;

import java.util.concurrent.TimeUnit;

public class TestingApplication {
    static Utility util = new Utility();
    static WebDriver driver = util.initializeDriver("chrome");
    static Element element = new Element();

    public static void main(String[] args) throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://practicesoftwaretesting.com/#/");
        changePrice();
        getCategories();
        getSorting();
        driver.quit();

    }

    public static void getCategories() throws InterruptedException {
        WebElement categories = util.waitForElementToBeLocated(driver, 10, element.categoriesLink);
        categories.click();

        WebElement handTool = util.waitForElementToBeLocated(driver, 10, element.handToolLink);
        handTool.click();
        categories.click();

        WebElement specialTool = util.waitForElementToBeLocated(driver, 10, element.specialToolLink);
        specialTool.click();
        categories.click();

        WebElement powerTool = util.waitForElementToBeLocated(driver, 10, element.powerToolLink);
        powerTool.click();
    }

    public static void getSorting() throws InterruptedException {
        Select dropdown = new Select(driver.findElement(element.sortingLink));
        dropdown.selectByValue("price,desc");
        dropdown.selectByValue("name,desc");
        dropdown.selectByValue("price,asc");

    }

    public static void changePrice() {
        WebElement slider = driver.findElement(element.priceSlider);
        if(slider.isDisplayed()) {
            System.out.println("Is slider Displayed: " + slider.isDisplayed());

            Actions dragger = new Actions(driver);
//
//            Action action = (Action) dragger.dragAndDropBy(slider, 30, 0).build();
//            ((Actions) action).perform();
//
//            int distanceToMove = 50;
//            dragger.moveToElement(slider).clickAndHold().moveByOffset(0, distanceToMove).release().perform();
        }
        else {
            System.out.println("Slider isn't present on the Page.");
        }
    }

}



