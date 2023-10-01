package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(name = "username")
    public WebElement username;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(css = "[type='submit']")
    public WebElement loginBtn;
    @FindBy(linkText = "Log Out")
    public WebElement logOut;
    @FindBy(css = "[id='rightPanel'] h1")
    public WebElement error;

}
