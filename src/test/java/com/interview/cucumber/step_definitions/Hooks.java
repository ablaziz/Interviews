package com.interview.cucumber.step_definitions;


import com.interview.utilities.BrowserUtils;
import com.interview.utilities.DBUtils;
import com.interview.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUpScenario() {

        System.out.println("------Setting up browser with further details...");
    }


    @After
    public void tearDownScenario(Scenario scenario) {
        //if my scenario failed
        // go and take screen shot
        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }
        BrowserUtils.wait(1);
        Driver.closeDriver();

    }

    @Before("@db")
    public void dbHook() {
        System.out.println("creating database connection");
        DBUtils.createConnection();
    }

    @After("@db")
    public void afterDbHook() {
        System.out.println("closing database connection");
        DBUtils.destroyConnection();
    }
}