package pageElements;

import org.openqa.selenium.By;

public class Element {
    public static final By categoriesLink = By.xpath("//a[@class='nav-link dropdown-toggle']");
    public static final By handToolLink = By.xpath("//a[@routerlink='/category/hand-tools']");
    public static final By specialToolLink = By.xpath("//a[@routerlink='/category/special-tools']");
    public static final By powerToolLink = By.xpath("//a[@routerlink='/category/power-tools']");
    public static final By sortingLink = By.xpath("//select[@class='form-select']");
    public static final By priceSlider = By.xpath("//span[@class='ngx-slider-span ngx-slider-bar-wrapper ngx-slider-full-bar']");



}
