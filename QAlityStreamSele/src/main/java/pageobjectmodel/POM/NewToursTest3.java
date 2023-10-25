package pageobjectmodel.POM;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class NewToursTest3 {

    private final WebDriver driver = new ChromeDriver();
    By registerLinkLocator =  By.linkText("REGISTER");
    By registerPageLocator = By.xpath("//img[@src='images/mast_register.gif']");
    By userNameIdLocator = By.id("email");
    By passwordNameLocator = By.name("password");
    By passwordConfirmNameLocator = By.name("confirmPassword");
    By submitBtmNameLocator = By.name("submit");
    By singInLinTextLocator = By.linkText(" sign-in ");
    By singInUserNameLocator = By.name("userName");

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver.get("https://demo.guru99.com/test/newtours/");
    }
    @After
    public void tearDown(){
        driver.close();
    }
    @Test
    public void registerUser() throws InterruptedException {
        driver.findElement(registerLinkLocator).click();
        Thread.sleep(2000);
        if (driver.findElement(registerPageLocator).isDisplayed()){
            driver.findElement(userNameIdLocator).sendKeys("Federator");
            driver.findElement(passwordNameLocator).sendKeys("123465aA");
            driver.findElement(passwordConfirmNameLocator).sendKeys("123465aA");
            driver.findElement(submitBtmNameLocator).click();
        }else {
            System.out.println("Register pages wasn't fonud");
        }

        List<WebElement> fonts = driver.findElements(By.tagName("font"));
        assertEquals("Note: Your user name is Federator.",fonts.get(5).getText());
    }
    @Test
    public void singIn(){
        driver.findElement(singInUserNameLocator).sendKeys("Federator");
        driver.findElement(passwordNameLocator).sendKeys("123465aA");
        driver.findElement(submitBtmNameLocator).click();
        List<WebElement> title = driver.findElements(By.tagName("h3"));
        assertEquals("Login Successfully",title.get(0).getText());
    }
}