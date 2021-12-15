package gov.uk.check.visa;

import com.cucumber.listener.Reporter;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import gov.uk.check.visa.propertyreader.PropertyReader;
import gov.uk.check.visa.utility.Utilities;

import java.io.IOException;

public class Hooks extends Utilities {

    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        Reporter.assignAuthor("Anchal");
    }
    @After
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()){
            String screenShortPath=Utilities.getScreenshot(driver,scenario.getName().replace(" ","_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShortPath);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        closeBrowser();
    }


}