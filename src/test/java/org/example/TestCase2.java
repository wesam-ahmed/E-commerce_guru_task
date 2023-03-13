package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {
    WebDriver driver;

    @BeforeTest
    public void driverSetup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("http://live.techpanda.org/");
        driver.manage().window().maximize();
    }

    @Test
    public void Testcase2() {
        BasePage basePage = new BasePage(driver);
        SoftAssert softAssert = new SoftAssert();

        basePage.clickmobbtn();
        basePage.getCostbox();
        basePage.clickmobimg();
        basePage.getCostdiels();
        softAssert.assertEquals(basePage.getCostdiels(), basePage.getCostbox());
softAssert.assertAll();



    }
    @AfterTest
    public void closeweb(){
        driver.close();
    }
}
