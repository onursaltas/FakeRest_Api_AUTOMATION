package steps;

import Activities.Activities_Get_ID.ActivitiesList;
import Activities.Activities_Get_ID.ActivitiesListResponse;
import Activities.Activities_Post.ActivitiesPost;
import Activities.Activities_Post.ActivitiesPostResponse;
import config.Logger;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.text.ParseException;

public class ActivitiesLIST_IDSteps {
    private ActivitiesList activitiesList = new ActivitiesList();
    private ActivitiesListResponse activitiesListResponse;
    String actID;


    private String id;
    private String title;
    private String DueDate;
    private Boolean completed = true;

    @Given("go to List Activities : {string}")
    public void listActivite (String actID) {
        this.actID = actID;
    }

    @When("List Activites")
    public void getUser() {
        activitiesListResponse = activitiesList.getListUsersWithPageParameter(actID);
    }

    @Then("Check the List Activite response")
    public void checkCreate() throws ParseException {

        Assert.assertEquals(activitiesListResponse.getId(), actID, "Checking User ID succesfull ");
        Assert.assertEquals(activitiesListResponse.getCompleted(), completed, "Checking Completed succesfull ");

        Logger.info("User succesfull created!");


    }
}
