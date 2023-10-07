package Pages;

import Utilities.GWD;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CenterPage extends Parent{
    public CenterPage() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(name = "customer.firstName")
    public WebElement firstName;
    @FindBy(xpath = "//input[@value='Register']")
    public WebElement registerBtn;
    @FindBy(id = "rightPanel")
    public WebElement successful;

    public void actions(String data){
        Actions TABactions = new Actions(GWD.getDriver());
        TABactions.sendKeys(Keys.TAB).sendKeys(data).build().perform();
    }


}
