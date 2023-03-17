package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase4 {
    WebDriver driver;

    @BeforeTest
    public void driverSetup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("http://live.techpanda.org/");
        driver.manage().window().maximize();
    }

@Test public void TestCase4() throws InterruptedException {
    BasePage basePage = new BasePage(driver);
    SoftAssert softAssert = new SoftAssert();
    basePage.clickmobbtn();
    basePage.getmainMobileIphone();
    basePage.getmainMobileSonyXperiae();
    basePage.clickAddtoCompareIphone();
    basePage.clickAddtoCompareSonyXperiae();
    basePage.clickCompareBtn();

    for (String handle : driver.getWindowHandles()) {
        driver.switchTo().window(handle);
    }
    basePage.getcompHead();
    basePage.getpopupMobileIphone();
    basePage.getpopupMobileSonyXperiae();
    softAssert.assertEquals(basePage.getcompHead(),"Compare Products");
    softAssert.assertEquals(basePage.getmainMobileSonyXperiae(),basePage.getpopupMobileSonyXperiae());
    softAssert.assertEquals(basePage.getmainMobileIphone(),basePage.getpopupMobileIphone());
    basePage.CloseCompareWindow();
    for (String handle : driver.getWindowHandles()) {
        driver.switchTo().window(handle);
    }


}


    @AfterTest
    public void closeweb(){


        driver.close();
    }

}
