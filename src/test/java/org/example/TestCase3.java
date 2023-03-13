package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase3 {
    WebDriver driver;

    @BeforeTest
    public void driverSetup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("http://live.techpanda.org/");
        driver.manage().window().maximize();
    }

    @Test
    public void TestCase3() {
        BasePage basePage = new BasePage(driver);
        SoftAssert softAssert = new SoftAssert();
        basePage.clickmobbtn();
        basePage.clickaddCartbtn();
        basePage.addqty("1000");
        basePage.clickUpdate();
        basePage.getErrormsg();
        softAssert.assertEquals(basePage.getErrormsg(), "Some of the products cannot be ordered in requested quantity.");
        basePage.clickEmptyCart();
        basePage.getCarTisEmpty();
        softAssert.assertEquals(basePage.getCarTisEmpty(), "SHOPPING CART IS EMPTY");
        softAssert.assertAll();

    }

    @AfterTest
    public void closeweb() {
        driver.close();
    }
}
