package project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends Base{
    By submitBtmNameLocator = By.name("submit");
    By singInLinTextLocator = By.linkText(" sign-in ");
    By singInUserNameLocator = By.name("userName");
    By passwordNameLocator = By.name("password");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void  signIn(){
        if (isDisplayed(singInUserNameLocator)){
            type("Fede",singInUserNameLocator);
            type("pass1",passwordNameLocator);
            click(submitBtmNameLocator);
        }else {
            System.out.println("username textbos wasn't present");
        }
    }

    public  boolean isHomePageDisplayed(){
        return isDisplayed(singInLinTextLocator);
    }
}
