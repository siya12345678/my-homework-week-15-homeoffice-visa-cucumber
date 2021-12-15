package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;

import gov.uk.check.visa.utility.Utilities;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FamilyImmigrationStatusPage extends Utilities {
    //nextStepButton, yes, no locators and create methods 'void selectImmigrationStatus(String status)'
    //  (Note: Use switch statement for select immigration status) and 'void clickNextStepButton()'
    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());
    public FamilyImmigrationStatusPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(css = "button[class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement nextStepButton;
    @CacheLookup
    @FindBy(id="response-0")
    WebElement yes;
    @CacheLookup
    @FindBy(id="response-1")
    WebElement no;
    public void selectImmigrationStatus(String status){
        //use switch method for select Immigration

        switch (status){
            case "Yes":

                log.info("option selected is " +yes.getText() + "<br>");
                clickOnElement(yes);
                break;
            case "No":

                log.info("option selected is  " +no.getText() + "<br>");
                clickOnElement(no);
                break;
            default:
                System.out.println(" Please select any of option");

        }

    }
    public void clickNextStepButton(){

        log.info("click on continue button " +nextStepButton.getText() + "<br>");
        clickOnElement(nextStepButton);
    }
}
