package StepDefinitions;

import Pages.CenterPage;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class US1_Register {
    LeftNav ln = new LeftNav();
    CenterPage cp = new CenterPage();

    @Then("Complete the registration process")
    public void completeTheRegistrationProcess() {
        ln.myClick(ln.register);
        cp.firstName.sendKeys("team");
        cp.actions("yedi");
        cp.actions("address_1");
        cp.actions("city_1");
        cp.actions("state_1");
        cp.actions("71");
        cp.actions("1234567");
        cp.actions("7");
        cp.actions("teamyedi");
        cp.actions("team7");
        cp.actions("team7");
        cp.myClick(cp.registerBtn);

    }

    @And("User should register successfully")
    public void userShouldRegisterSuccessfully() {
        Assert.assertTrue(cp.successful.getText().contains("successful"),"Kayıt yapılamadı");
    }
}
