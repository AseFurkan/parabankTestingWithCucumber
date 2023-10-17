package StepDefinitions;

import Pages.CenterPage;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class US7_UpdateContactInfo {
    LeftNav ln = new LeftNav();
    CenterPage cp = new CenterPage();
    Parent parent = new Parent();

    @When("Navigate to Update Profile")
    public void navigateToUpdateProfile() {
        parent.wait.until(ExpectedConditions.elementToBeClickable(ln.updateContactInfo));
        ln.myClick(ln.updateContactInfo);
    }

    @Then("Update registration information")
    public void updateRegistrationInformation() {
        cp.mySendKeys(cp.firstName, "teamDENEME");
        cp.pressTab().sendKeys("yedi").build().perform();
        cp.pressTab().sendKeys("address_1").build().perform();
        cp.pressTab().sendKeys("city_1").build().perform();
        cp.pressTab().sendKeys("state_1").build().perform();
        cp.pressTab().sendKeys("").build().perform();  // Boş girdiğimiz için Zip code is required şeklinde uyarı alacağız
        cp.pressTab().sendKeys("1234567").build().perform();
    }

    @And("Error message")
    public void errorMessage() {
        cp.verifyContainsText(cp.errorMessage, "is required");
    }

    @And("Fix the error and update profile again")
    public void fixTheErrorAndUpdateProfileAgain() {
        cp.mySendKeys(cp.firstName, "teamDENEME");
        cp.pressTab().sendKeys("yedi").build().perform();
        cp.pressTab().sendKeys("address_1").build().perform();
        cp.pressTab().sendKeys("city_1").build().perform();
        cp.pressTab().sendKeys("state_1").build().perform();
        cp.pressTab().sendKeys("88").build().perform();  // Boş girdiğimiz Zip code tekrar doğru olarak giriyoruz
        cp.pressTab().sendKeys("1234567").build().perform();
        cp.myClick(cp.UpdateProfileBtn);
    }

    @And("Updates have been added to the system")
    public void updatesHaveBeenAddedToTheSystem() {
        cp.verifyContainsText(cp.ProfileUpdated, "updated");
    }


    @And("View current changes")
    public void viewCurrentChanges() {
        parent.wait.until(ExpectedConditions.attributeToBe(cp.firstName, "value", "teamDENEME"));
        Assert.assertEquals(cp.firstName.getAttribute("value"), "teamDENEME");
    }


}
