package StepDefinitions;

import Pages.CenterPage;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US7_UpdateContactInfo {
    LeftNav ln = new LeftNav();
    CenterPage cp = new CenterPage();

    @When("Navigate to Update Profile")
    public void navigateToUpdateProfile() {
        ln.myClick(ln.updateContactInfo);
    }

    @Then("Update registration information")
    public void updateRegistrationInformation() {
        cp.firstName.sendKeys("teamDENEMELER");
        cp.actions("yedi");
        cp.actions("address_1");
        cp.actions("city_1");
        cp.actions("state_1");
        cp.actions("71");
        cp.actions("1234567");
        cp.myClick(cp.UpdateProfileBtn);
    }

    @And("Updates have been added to the system")
    public void updatesHaveBeenAddedToTheSystem() {
    }

    @And("Error message")
    public void errorMessage() {
    }

    @And("View current changes")
    public void viewCurrentChanges() {
    }
}
