package StepDefinitions;

import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class US1_LoginSteps {
    LeftNav ln = new LeftNav();
    @When("Navigate to Website")
    public void navigateToWebsite() {
        GWD.getDriver().get("https://para.testar.org/");

    }
    @Then("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        ln.mySendKeys(ln.username,"teamyedi");
        ln.mySendKeys(ln.password,"team7");
        ln.myClick(ln.loginBtn);

    }

    @And("User should login successfully")
    public void userShouldLoginSuccessfully() {
        Assert.assertTrue(ln.logOut.isDisplayed(),"Pozitif login yapılamadı.");
    }

    @And("Clik to logout")
    public void clikToLogout() {
        ln.myClick(ln.logOut);
    }

    @And("User should logout successfully")
    public void userShouldLogoutSuccessfully() {
        Assert.assertTrue(ln.loginBtn.isDisplayed(),"Pozitif çıkış yapılamadı");
    }

    @Then("Enter invalid {string} or invaliid {string} and click button")
    public void enterInvalidOrInvaliidAndClickButton(String username, String password) {
        ln.mySendKeys(ln.username,username);
        ln.mySendKeys(ln.password,password);
        ln.myClick(ln.loginBtn);
    }

    @And("User should not login successfully")
    public void userShouldNotLoginSuccessfully() {
        Assert.assertTrue(ln.error.isDisplayed(),"Kullanıcı geçersiz bilgilerle giriş yaptı");
    }
}
