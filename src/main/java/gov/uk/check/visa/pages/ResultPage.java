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

public class ResultPage extends Utilities {
    // resultMessage locator and create methods 'String getResultMessage()'
// and 'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='result-info']//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")//string expected=You need a visa to work in health and care for chile
    WebElement resultMessage;
    /*
    @CacheLookup
    @FindBy(xpath = "//h2[@class=\"gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6\"")
    WebElement resultMessage;

     */
    @FindBy(xpath = "//h2[@class=\"gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6\"]")
    WebElement chileResultMessage;


    public String getResultMessage() {
        log.info("Result Text is" + resultMessage.getText() + "<br>");
        String result = getTextFromElement(resultMessage);
        return result;
    }
    public String getChileResultMessage() {
        log.info("Result Text is" + chileResultMessage.getText() + "<br>");
        String result = getTextFromElement(chileResultMessage);
        return result;
    }

    public void confirmResultMessage(String expectedMessage) {
        // Assert.assertTrue(expectedMessage.equals(getResultMessage()));
        // Assert.assertTrue(expectedMessage.equals(getResultMessage()));

    }
}
