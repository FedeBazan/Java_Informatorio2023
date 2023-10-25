package waits;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class GoogleSearchTest2 {
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
        searchbox.sendKeys("Introduccion a la automatizacion de pruebas");
        searchbox.submit();

        //Implicit Wait
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //Explicit Wait
        //WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //ewait.until(ExpectedConditions.titleContains("automatizacion de pruebas"));

        //Fluent Wait
        Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchFieldException.class);
        assertEquals("Introduccion a la automatizacion de pruebas - Buscar con Google",driver.getTitle());
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
