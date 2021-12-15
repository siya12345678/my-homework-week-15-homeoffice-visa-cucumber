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

public class StartPage extends Utilities {
    //startNowButton locators and create method 'void clickStartNow()'
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());
    public StartPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(css = ".gem-c-button.govuk-button.govuk-button--start")
    WebElement startNowButton;
    @CacheLookup
    @FindBy(xpath = "//button[text()='Accept additional cookies']")
    WebElement cookies;

    public void acceptCookies(){
        log.info("click on cookies " +cookies.getText() + "<br>");
        clickOnElement(cookies);
    }
    public void clickStartNow(){


        log.info("Clicking on start now link " +startNowButton.getText() + "<br>");
        clickOnElement(startNowButton);
    }

}
