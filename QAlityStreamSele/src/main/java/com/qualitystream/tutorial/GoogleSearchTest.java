package com.qualitystream.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class GoogleSearchTest {
    private WebDriver driver = new ChromeDriver();

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @Test
    public void testGooglePage(){

        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.clear();
        searchbox.sendKeys("Introduccion a la autmatizacion de pruebas");
        searchbox.submit();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals("Introduccion a la autmatizacion de pruebas - Buscar con Google",driver.getTitle());
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
