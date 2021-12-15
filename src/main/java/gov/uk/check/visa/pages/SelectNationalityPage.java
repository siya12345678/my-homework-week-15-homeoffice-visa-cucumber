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

public class SelectNationalityPage extends Utilities {
    //-nationalityDropDownList, nextStepButton locators and create methods  'void selectNationality(String nationality)'
    //  and 'void clickNextStepButton()'
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());
    public SelectNationalityPage(){
         PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(id = "response")
    WebElement nationalityDropDownList;
    @CacheLookup
    @FindBy(css = "button[class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement nextStepButton;

    public void selectNationality(String nationality) {
       /* clickOnElement(nationalityDropDownList);
        if (nationality.equalsIgnoreCase("Australia")) {
            selectByVisibleTextFromDropDown(nationalityDropDownList, "Australia");
        } else if (nationality.equalsIgnoreCase("Colombia")) {
            selectByVisibleTextFromDropDown(nationalityDropDownList, "Colombia");
        } else if (nationality.equalsIgnoreCase("Chile")) {
            selectByVisibleTextFromDropDown(nationalityDropDownList, "Chile");
        }

        */
        log.info("select Nationality" + nationalityDropDownList.getText() + "<br>");
        selectByVisibleTextFromDropDown(nationalityDropDownList,nationality);




    }

    public void clickNextStepButton() {

        log.info("click on button" + nextStepButton.getText() + "<br>");
        clickOnElement(nextStepButton);
    }
}
