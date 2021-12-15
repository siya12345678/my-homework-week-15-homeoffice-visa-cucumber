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

public class WorkTypePage extends Utilities {
    //nextStepButton, selectJobTypeList locators and create methods  'void selectJobType(String job)'
    //  and 'void clickNextStepButton()'
    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());
    public WorkTypePage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(css = "button[class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement nextStepButton;
    @CacheLookup
    @FindBy(id="response-0")//for chile
    WebElement selectJobTypeList;
    public void selectJobType(String job){
        if(job.contains("Health and care professional")){

            log.info("job type is" +selectJobTypeList.getText() + "<br>");
            clickOnElement(selectJobTypeList);
        }else {
            System.out.println("not a valid selection");

        }

    }
    public void clickNextStepButton(){
       log.info("Clicking on login link " +nextStepButton.getText() + "<br>");
        clickOnElement(nextStepButton);
    }
}
