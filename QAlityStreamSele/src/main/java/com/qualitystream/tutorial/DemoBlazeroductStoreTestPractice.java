package com.qualitystream.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;



public class DemoBlazeroductStoreTestPractice {

    private String user = "Fede3012";
    private  String password = "koARDXi9JehE1uVvMbyp";
    private WebDriver driver = new ChromeDriver();
    private WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(10));
    By iconTittle = By.linkText("PRODUCT STORE");
    By signUpIdLocator = By.id("signin2");
    By signUpTittleIdLocator = By.id("signInModalLabel");
    By singUpUsernameIdLocator = By.id("sign-username");
    By singUpPasswordIdLocator = By.id("sign-password");

    By signUpBtmXpathLocator = By.xpath("//*[@id='signInModal']/div/div/div[3]/button[2]");
    By logInIdLocator = By.id("login2");

    By logInTittleFormIdLocator = By.id("logInModalLabel");
    By logInUsernameIdLocator = By.id("loginusername");
    By logInPasswordIdLocator = By.id("loginpassword");
    By logInBtmXpathLocator = By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]");
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver.get("https://www.demoblaze.com");
    }
    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void upTest(){
        assertTrue(driver.findElement(iconTittle).isDisplayed());
    }

    @Test
    public void registerUser(){
        driver.findElement(signUpIdLocator).click();
        if (driver.findElement(signUpTittleIdLocator).isDisplayed()){
            driver.findElement(singUpUsernameIdLocator).sendKeys(user);
            driver.findElement(singUpPasswordIdLocator).sendKeys(password);
            driver.findElement(signUpBtmXpathLocator).click();
        }else {
            System.out.println("Website wasn't found.");
        }
        //WebElement alert= ewait.until(EC.alert_is_present());
    }

    @Test
    public  void loginUser(){
        driver.findElement(logInIdLocator).click();
        if (driver.findElement(logInTittleFormIdLocator).isDisplayed()){
            driver.findElement(logInUsernameIdLocator).sendKeys(user);
            driver.findElement(logInPasswordIdLocator).sendKeys(password);
            driver.findElement(logInBtmXpathLocator).click();
        }else {
            System.out.println("Website wasn't found.");
        }
    }

}
