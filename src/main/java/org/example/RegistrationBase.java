package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationBase {
    WebDriver driver;
    By AccountText=By.xpath("/html/body/div[1]/div/header/div/div[2]/div/a/span[2]");
    By MyAccount=By.linkText("My Account");
    By CreateanAccountBtn=By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[2]/a");
    By firstnameTextfild=By.id("firstname");
    By middlenameTextfild=By.id("middlename");
    By lastnameTextfild=By.id("lastname");
    By email_addressTextfild=By.id("email_address");
    By passwordTextfild=By.id("password");
    By confirmationfild=By.id("confirmation");
    By RegisterBtn=By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div[2]/button/span/span");
    By welcomeName=By.xpath("//*[@id='top']/body/div[1]/div/div[1]/div/p");
    By TVmenu=By.xpath("/html/body/div/div/header/div/div[3]/nav/ol/li[2]/a");
    By SHAREWISHLISText=By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a");
    By email_addressShare=By.id("email_address");
    By messageShare=By.id("message");
    By SHAREWISHLISTbtn=By.xpath("//button[@title='Share Wishlist']");
    By wishListConfirm=By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span");

    public RegistrationBase(WebDriver driver) {
        this.driver = driver;
    }
    public void timeTofindElement(By Text) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Text));
    }
    public void clickAccountText() {
        timeTofindElement(AccountText);
        driver.findElement(AccountText).click();
    }
    public void clickMyAccount() {
        timeTofindElement(MyAccount);
        driver.findElement(MyAccount).click();
    }
    public void clickCreateanAccountBtn() {
        timeTofindElement(CreateanAccountBtn);
        driver.findElement(CreateanAccountBtn).click();
    }
    public void EnterfirstnameTextfild(String Text) {
        timeTofindElement(firstnameTextfild);
        driver.findElement(firstnameTextfild).sendKeys(Text);
    }
    public void EntermiddlenameTextfild(String Text) {
        timeTofindElement(middlenameTextfild);
        driver.findElement(middlenameTextfild).sendKeys(Text);
    }
    public void EnterlastnameTextfild(String Text) {
        timeTofindElement(lastnameTextfild);
        driver.findElement(lastnameTextfild).sendKeys(Text);
    }
    public void Enteremail_addressTextfild(String Text) {
        timeTofindElement(email_addressTextfild);
        driver.findElement(email_addressTextfild).sendKeys(Text);
    }
    public void EnterpasswordTextfild(String Text) {
        timeTofindElement(passwordTextfild);
        driver.findElement(passwordTextfild).sendKeys(Text);
    }
    public void Enterconfirmationfild(String Text) {
        timeTofindElement(confirmationfild);
        driver.findElement(confirmationfild).sendKeys(Text);
    }
    public void ClickRegisterBtn() {
        timeTofindElement(RegisterBtn);
        driver.findElement(RegisterBtn).click();
    }
    public String getwelcomeName() {
        timeTofindElement(welcomeName);
        return driver.findElement(welcomeName).getText();
    }
    public void clickTVmenu() {
        timeTofindElement(TVmenu);
        driver.findElement(TVmenu).click();
    }
    public void clickSHAREWISHLISText() {
        timeTofindElement(SHAREWISHLISText);
        driver.findElement(SHAREWISHLISText).click();
    }
    public void Enteremail_addressShare(String Text) {
        timeTofindElement(email_addressShare);
        driver.findElement(email_addressShare).sendKeys(Text);
    }
    public void EntermessageShare(String Text) {
        timeTofindElement(messageShare);
        driver.findElement(messageShare).sendKeys(Text);
    }
    public void clickSHAREWISHLISTbtn() {
        timeTofindElement(SHAREWISHLISTbtn);
        driver.findElement(SHAREWISHLISTbtn).click();
    }
    public String getwishListConfirm() {
        timeTofindElement(wishListConfirm);
        return driver.findElement(wishListConfirm).getText();
    }

}
