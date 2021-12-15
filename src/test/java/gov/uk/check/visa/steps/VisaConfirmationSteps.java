package gov.uk.check.visa.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uk.check.visa.pages.*;
import org.junit.Assert;

public class VisaConfirmationSteps {
    @Given("^I am on home office page$")
    public void iAmOnHomeOfficePage() {

    }

    @When("^I click on start button$")
    public void iClickOnStartButton() {
        new StartPage().acceptCookies();
       new StartPage().clickStartNow();

    }
    @And("^I select nationality \"([^\"]*)\"$")
    public void iSelectNationality(String nationality)  {
        new SelectNationalityPage().selectNationality(nationality);

    }

    @And("^I select reason to come is \"([^\"]*)\"$")
    public void iSelectReasonToComeIs(String reason) {
        new ResponseForTravelPage().selectReasonForVisit(reason);

    }


    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();


    }

    @And("^I click on continue buttonAgain$")
    public void iClickOnContinueButtonAgain() {
        new ResponseForTravelPage().clickNextStepButton();
    }

    @Then("^I should verify message successfully$")
    public void iShouldVerifyMessageSuccessfully() {
        String expected="You will not need a visa to come to the UK";
        String actual=new ResultPage().getResultMessage();
        Assert.assertEquals("Not in correct page",expected,actual);
    }


    @And("^I click on duration page continue button$")
    public void iClickOnDurationPageContinueButton() {
        new DurationOfStayPage().clickNextStepButton();
    }

    @And("^I select planning to work for \"([^\"]*)\"$")
    public void iSelectPlanningToWorkFor(String jobRole)  {
        new WorkTypePage().selectJobType(jobRole);

    }

    @And("^I click on continue button on work for page$")
    public void iClickOnContinueButtonOnWorkForPage() {
        new WorkTypePage().clickNextStepButton();
    }




    @And("^I select length of stay \"([^\"]*)\"$")
    public void iSelectLengthOfStay(String arg0)  {
        new DurationOfStayPage().selectLengthOfStay(arg0);

    }

    @And("^I click on \"([^\"]*)\" option that my partners family member have uk immigration$")
    public void iClickOnOptionThatMyPartnersFamilyMemberHaveUkImmigration(String option)  {
      new FamilyImmigrationStatusPage().selectImmigrationStatus(option);
    }

    @And("^I click on continue button after selecting yes option$")
    public void iClickOnContinueButtonAfterSelectingYesOption() {
        new FamilyImmigrationStatusPage().clickNextStepButton();
    }

    @And("^I should verify \"([^\"]*)\" message$")
    public void iShouldVerifyMessage(String message)  {
        String actual=new ResultPage().getResultMessage();
        Assert.assertEquals("not in correct page",message,actual);

    }
}
