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

    By AddtoCompareIphone = By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/ul/li[2]/a");
    By mainMobileIphone = By.xpath("//h2/a[@title='IPhone']");
    By AddtoCompareSonyXperiae = By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a");

    By mainMobileSonyXperiae = By.xpath("//h2/a[@title='Sony Xperia']");
    By CompareBtn=By.xpath("//button[@title='Compare']");
    By compHead=By.xpath("//*[@id='top']/body/div[1]/div[1]/h1");
    By popupMobileIphone = By.xpath("//h2/a[@title='IPhone']");
    By popupMobileSonyXperiae = By.xpath("//h2/a[@title='Sony Xperia']");
    By CloseCompareWindow=By.xpath("//button[@title='Close Window']");





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
    public void clickAddtoCompareSonyXperiae() {
        timeTofindElement(AddtoCompareSonyXperiae);
        driver.findElement(AddtoCompareSonyXperiae).click();
    }
    public String getmainMobileSonyXperiae() {
        timeTofindElement( mainMobileSonyXperiae);
        return driver.findElement( mainMobileSonyXperiae).getText();
    }


    public void clickAddtoCompareIphone() {
        timeTofindElement(AddtoCompareIphone);
        driver.findElement(AddtoCompareIphone).click();
    }
    public String getmainMobileIphone() {
        timeTofindElement(mainMobileIphone);
        return driver.findElement(mainMobileIphone).getText();
    }
    public void clickCompareBtn() {
        timeTofindElement(CompareBtn);
        driver.findElement(CompareBtn).click();
    }
    public String getcompHead() {
        timeTofindElement(compHead);
        return driver.findElement(compHead).getText();
    }
    public String getpopupMobileIphone() {
        timeTofindElement(popupMobileIphone);
        return driver.findElement(popupMobileIphone).getText();
    }
    public String getpopupMobileSonyXperiae() {
        timeTofindElement(popupMobileSonyXperiae);
        return driver.findElement(popupMobileSonyXperiae).getText();
    }
    public void CloseCompareWindow() {
        timeTofindElement(CloseCompareWindow);
        driver.findElement(CloseCompareWindow).click();
    }




}


