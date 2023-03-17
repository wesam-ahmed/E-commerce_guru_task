package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.Random;

import static org.testng.AssertJUnit.assertEquals;

public class TestCase5 {
    WebDriver driver;

    public String firstName = "BERRY";    // Firstname and Lastname will be placed
    public String lastName = "BERRYTWO";
    public String medelname = "WESAM";

    @BeforeTest
    public void driverSetup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("http://live.techpanda.org/");
        driver.manage().window().maximize();
    }
    @Test
    public void TestCase5(){
    RegistrationBase registrationBase=new RegistrationBase(driver);
        Random random=new Random();
    registrationBase.clickAccountText();
    registrationBase.clickMyAccount();
    registrationBase.clickCreateanAccountBtn();
    registrationBase.EnterfirstnameTextfild(firstName);
    registrationBase.EntermiddlenameTextfild(medelname);
    registrationBase.EnterlastnameTextfild(lastName);
    registrationBase.Enteremail_addressTextfild("wesamahmed88"+random.nextInt()+"@gmail.com");
    registrationBase.EnterpasswordTextfild("1234567");
    registrationBase.Enterconfirmationfild("1234567");
    registrationBase.ClickRegisterBtn();
        String vWelcome = ("WELCOME, " + firstName + " " +medelname+" "+ lastName + "!");
        try {
            assertEquals(registrationBase.getwelcomeName(), vWelcome);
        } catch (Exception e) {
            e.printStackTrace();
        }
        registrationBase.clickTVmenu();
        registrationBase.clickSHAREWISHLISText();
        registrationBase.clickSHAREWISHLISTbtn();
        registrationBase.Enteremail_addressShare("support@guru99.com");
        registrationBase.EntermessageShare("Hey Mary!! this LCD TV looks ok, check it out !!.. cheers .. Berry");
        registrationBase.clickSHAREWISHLISTbtn();
        String vWishList = "Your Wishlist has been shared.";
        try {
            assertEquals(registrationBase.getwishListConfirm(),vWishList);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }






     @AfterTest
   public void closeweb(){
        driver.close();


    }

}
