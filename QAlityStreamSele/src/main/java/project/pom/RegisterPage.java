package project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegisterPage extends Base{

    By registerLinkLocator =  By.linkText("REGISTER");
    By registerPageLocator = By.xpath("//img[@src='images/mast_register.gif']");
    By userNameIdLocator = By.id("email");
    By passwordNameLocator = By.name("password");
    By passwordConfirmNameLocator = By.name("confirmPassword");
    By submitBtmNameLocator = By.name("submit");
    By singInLinTextLocator = By.linkText(" sign-in ");
    By singInUserNameLocator = By.name("userName");

    By registeredMessage = By.tagName("font");
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void registerUser() throws InterruptedException {
        click(registerLinkLocator);
        Thread.sleep(2000);
        if (isDisplayed(registerPageLocator)){
            type("Fede3000",userNameIdLocator);
            type("pass1",passwordNameLocator);
            type("pass2",passwordConfirmNameLocator);

            click(submitBtmNameLocator);
        }else {
            System.out.println("Reagiste page wasn't found");
        }


    }

    public  String registerUserMessage(){
        List<WebElement> fonts = findElements(registeredMessage);
        return getText(fonts.get(5));
    }
}
