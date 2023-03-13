package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class TestCase1 {
WebDriver driver;
    private String baseUrl;
    public int scc = 0;

    private StringBuffer verificationErrors = new StringBuffer();
@BeforeTest
public void driverSetup() {
    WebDriverManager.firefoxdriver().setup();
    driver = new FirefoxDriver();
    baseUrl = "http://live.techpanda.org/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


}
@Test
public void testDay1TestCase1() throws Exception  {

    driver.get(baseUrl);

    String demoSite  = driver.findElement(By.cssSelector("h2")).getText();
    System.out.println(demoSite);
    try {
        AssertJUnit.assertEquals("THIS IS DEMO SITE FOR   ", demoSite);
    } catch (Error e) {
        verificationErrors.append(e.toString());
    }


    driver.findElement(By.linkText("MOBILE")).click();
    new Select(driver.findElement(By.cssSelector("select[title=\"Sort By\"]"))).selectByVisibleText("Name");


    scc = (scc+1);
    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    String png = ("E:\\projects\\E-commerce_gurutask\\Mobile Products are sorted" + scc + ".png");
    FileUtils.copyFile(scrFile, new File(png));
}
    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();

    }


}
