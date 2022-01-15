package com.interview.selenium.tests;

import com.interview.selenium.pages.IframePage;
import com.interview.utilities.Driver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class IframeTest {
    IframePage iframePage = new IframePage();
    @Test
    public void test(){
        //1. Go to website: http://practice.cydeo.com/iframe
        Driver.getDriver().get("http://practice.cydeo.com/iframe");
        //2. Locate as WebElement
        Driver.getDriver().switchTo().frame(iframePage.iframe);
        //3. Pass index number
        //4. Pass id or name attribute value (IF THERE ARE ANY)
        //5. Assert: "Your content goes here." Text is displayed.
        assertTrue(iframePage.message.isDisplayed(),"message is not displayed");
        //6. switch back to default frame
        Driver.getDriver().switchTo().parentFrame();
        assertTrue(iframePage.paragraph.isDisplayed(),"Driver did not switch to parent");
    }
}
