package StepDefinitions;

import Pages.CenterPage;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class US1_Register {
    LeftNav ln = new LeftNav();
    CenterPage cp = new CenterPage();

    @Then("Complete the registration process")
    public void completeTheRegistrationProcess() {
        ln.myClick(ln.register);
        cp.firstName.sendKeys("team");
        cp.pressTab().sendKeys("yedi").build().perform();
        cp.pressTab().sendKeys("address_1").build().perform();
        cp.pressTab().sendKeys("city_1").build().perform();
        cp.pressTab().sendKeys("state_1").build().perform();
        cp.pressTab().sendKeys("71").build().perform();
        cp.pressTab().sendKeys("1234567").build().perform();
        cp.pressTab().sendKeys("7").build().perform();
        cp.pressTab().sendKeys("teamyedi").build().perform();
        cp.pressTab().sendKeys("team7").build().perform();
        cp.pressTab().sendKeys("team7").build().perform();
        cp.myClick(cp.registerBtn);

    }

    @And("User should register successfully")
    public void userShouldRegisterSuccessfully() {
        //Assert.assertTrue(cp.successful.getText().contains("successful"),"Kayıt yapılamadı");
        cp.verifyContainsText(cp.successful,"successful");
    }
}
