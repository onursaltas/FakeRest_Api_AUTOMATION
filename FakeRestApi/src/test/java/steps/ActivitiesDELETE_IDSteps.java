package steps;

import Activities.Activities_Get_ID.ActivitiesList;
import Activities.Activities_Get_ID.ActivitiesListResponse;
import config.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.text.ParseException;

public class ActivitiesDELETE_IDSteps {
    private ActivitiesList activitiesList = new ActivitiesList();
    private ActivitiesListResponse activitiesListResponse;
    String actID;


    private String id;
    private String title;
    private String DueDate;
    private Boolean completed = true;

    @Given("go to Delete Activities : {string}")
    public void listActivite (String actID) {
        this.actID = actID;
    }

    @When("List Activites")
    public void getUser() {
        activitiesListResponse = activitiesList.getListUsersWithPageParameter(actID);
    }

    @Then("Check the List Activite response")
    public void checkCreate() throws ParseException {

        Logger.info("User succesfull created!");

    }
}
