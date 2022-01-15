package com.interview.selenium.tests;

import com.interview.selenium.pages.RadioButtonPages;
import com.interview.utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class RadioButtonTest {
    RadioButtonPages radioButtonPages = new RadioButtonPages();
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void test1() {
        //1.GO TO: http://practice.cydeo.com/radio_buttons
        Driver.getDriver().get("http://practice.cydeo.com/radio_buttons");
        //2. Confirm radio button #Blue is selected by default
        softAssert.assertTrue(radioButtonPages.blueButton.isSelected());
        softAssert.assertTrue(!radioButtonPages.blueButton.isSelected());
        assertTrue(radioButtonPages.blueButton.isSelected(),"blue button is selected by default");
        //3. Confirm radio button #Football is NOT selected by default
        assertFalse(radioButtonPages.footballButton.isSelected(),"Football button is selected");
        //4. Click radio button #Football to select it.
        radioButtonPages.footballButton.click();
        //5. Verify radio button #Football is selected.
        assertTrue(radioButtonPages.footballButton.isSelected(),"Football button is not selected");
        //6. Click radio button #Red to select it.
        radioButtonPages.redButton.click();
        //7. Verify radio button #Red is selected.
        assertTrue(radioButtonPages.redButton.isSelected(), "red button is not selected");
        //8. Verify radio button #Blue is not selected.
        assertFalse(radioButtonPages.blueButton.isSelected(),"Blue button is selected");
        //9. Verify radio button #Green is not Enabled.
        assertTrue(!radioButtonPages.greenButton.isEnabled(),"green button is enable");
        softAssert.assertAll();
    }
}
