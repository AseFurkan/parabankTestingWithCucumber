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
    @FindBy(css = "[value='Update Profile']")
    public WebElement UpdateProfileBtn;
    @FindBy(xpath = "//div[@class='ng-scope']")
    public WebElement ProfileUpdated;
    @FindBy(xpath = "//*[ contains( text(), 'is required.' )  ]")
    public WebElement errorMessage;
    @FindBy(css = "[id='customer.lastName']")
    public WebElement updated;

    public Actions pressTab(){
        Actions TABactions = new Actions(GWD.getDriver());
        Actions pressTAB=TABactions.sendKeys(Keys.TAB);
        return pressTAB;
    }


}
