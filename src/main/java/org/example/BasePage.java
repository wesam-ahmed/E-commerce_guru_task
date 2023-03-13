package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Text;

public class BasePage {
    WebDriver driver;
    By Mobbtn = By.linkText("MOBILE");
    By Select = By.cssSelector("select[title=\"Sort By\"]");
    By costvalue = By.id("product-price-1");
    By sonyimg = By.id("product-collection-image-1");

    By costValueditelesbage = By.xpath("//*[@id=\"product-price-1\"]");
    By addCartsonybtn = By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/button");
    By QtytextBox = By.xpath("//input[@title='Qty']");
    By updatebtn = By.xpath("//button[@title='Update']");
    By errormsg = By.xpath("//li[@class='error-msg']");
    By Emptycart = By.id("empty_cart_button");
    By CarTisEmpty = By.xpath("//div[@class='page-title']");

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void timeTofindElement(By Text) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Text));
    }

    public void clickmobbtn() {
        timeTofindElement(Mobbtn);
        driver.findElement(Mobbtn).click();
    }

    public String getCostbox() {
        timeTofindElement(costvalue);
        return driver.findElement(costvalue).getText();
    }

    public void clickmobimg() {
        timeTofindElement(sonyimg);
        driver.findElement(sonyimg).click();
    }

    public String getCostdiels() {
        timeTofindElement(costValueditelesbage);
        return driver.findElement(costValueditelesbage).getText();
    }

    public void clickaddCartbtn() {
        timeTofindElement(addCartsonybtn);
        driver.findElement(addCartsonybtn).click();
    }

    public void addqty(String Text) {
        timeTofindElement(QtytextBox);
        driver.findElement(QtytextBox).sendKeys(Text);
    }

    public void clickUpdate() {
        timeTofindElement(updatebtn);
        driver.findElement(updatebtn).click();
    }

    public String getErrormsg() {
        timeTofindElement(errormsg);
        return driver.findElement(errormsg).getText();
    }

    public void clickEmptyCart() {
        timeTofindElement(Emptycart);
        driver.findElement(Emptycart).click();
    }

    public String getCarTisEmpty() {
        timeTofindElement(CarTisEmpty);
        return driver.findElement(CarTisEmpty).getText();
    }
}


