package steps;

import Activities.Activities_Post.ActivitiesPost;
import Activities.Activities_Post.ActivitiesPostResponse;
import config.Logger;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.text.ParseException;

public class ActivitiesPOSTSteps {
    private ActivitiesPost activitiesPost = new ActivitiesPost();
    private ActivitiesPostResponse activitiesPostResponse;


    private String id;
    private String title;
    private String DueDate;
    private Boolean completed = true;

    @Given("User Id {string}, User Title {string},User DueDate {string}")
    public void giveCustomerInfo(String id, String title , String DueDate ) {
        this.id = id;
        this.title = title;
        this.DueDate = DueDate;
        this.completed = completed;

    }

    @When("Create User")
    public void post() {
        activitiesPostResponse = activitiesPost.activitiesPost(id, title , DueDate , completed);
    }

    @Then("Check response")
    public void checkCreate() throws ParseException {
        Assert.assertEquals(activitiesPostResponse.getId(), id, "Checking User ID succesfull ");
        Assert.assertEquals(activitiesPostResponse.getTitle(), title, "Checking User Title succesfull ");
        Assert.assertEquals(activitiesPostResponse.getDueDate(), DueDate, "Checking User DueDate succesfull ");
        Assert.assertEquals(activitiesPostResponse.getCompleted(), completed, "Checking Completed succesfull ");

        Logger.info("User succesfull created!");


    }
}
