package com.qualitystream.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class NewToursTest {

    private WebDriver driver = new ChromeDriver();
    By registerLinkLocator =  By.linkText("REGISTER");
    By registerPageLocator = By.xpath("//img[@src='images/mast_register.gif']");
    By userNameIdLocator = By.id("email");
    By passwordNameLocator = By.name("password");
    By passwordConfirmNameLocator = By.name("confirmPassword");
    By submitBtmNameLocator = By.name("submit");

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/");
    }

    @Test
    public void test() throws InterruptedException {
        driver.findElement(registerLinkLocator).click();
        Thread.sleep(2000);
        if (driver.findElement(registerPageLocator).isDisplayed()){
            System.out.println("por ahora todo bien");
            driver.findElement(userNameIdLocator).sendKeys("Federator");
            driver.findElement(passwordNameLocator).sendKeys("123465aA");
            driver.findElement(passwordConfirmNameLocator).sendKeys("123465aA");
            driver.findElement(submitBtmNameLocator).click();
        }else {
            System.out.println("Register pages wasn't fonud");
        }

        List<WebElement> fonts = driver.findElements(By.tagName("font"));
        assertEquals("Note: Your user name is Federator.",fonts.get(13).getText());
    }

    @After
    public void tearDown(){
        //driver.close();
    }
}