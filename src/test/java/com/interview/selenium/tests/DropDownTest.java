package com.interview.selenium.tests;

import com.interview.selenium.pages.DropDownPage;
import com.interview.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class DropDownTest {
    DropDownPage dropDownPage = new DropDownPage();
@BeforeMethod
public void before(){
    Driver.getDriver().get("http://practice.cydeo.com/dropdown");
}
    @Test
    public void testC1() {

        //1. Go to http://practice.cydeo.com/dropdown

        //2. Select Illinois --> select by visible text
        Select selectState = new Select(dropDownPage.stateSelector);
        selectState.selectByVisibleText("Illinois");
        //3. Select Virginia --> select by value
        selectState.selectByValue("VA");
        //4. Select California --> select by index
        selectState.selectByIndex(5);
        //5. Verify final selected option is California.
        String actualSelection = selectState.getFirstSelectedOption().getText();
        assertEquals(actualSelection, "California", "Final Selection is not California");
    }

    @Test()
    public void testC2() {
       // Driver.getDriver().get("http://practice.cydeo.com/dropdown");
        Select selectDay = new Select(dropDownPage.day);
        Select selectYear = new Select(dropDownPage.year);
        Select selectMonth = new Select(dropDownPage.month);
        //Select “December 1st, 1950g” and verify it is selected.

        //2. Select Year --> by visible text
        selectYear.selectByVisibleText("1950");
        //3. Select Month -->  by value
        selectMonth.selectByValue("11");
        //4. Select Day -->  by index
        selectDay.selectByIndex(0);
    }

    @Test
    public void testC3() {
       // Driver.getDriver().get("http://practice.cydeo.com/dropdown");
      Select selectLanguages = new Select(dropDownPage.language);
        //1.Go to http://practice.cydeo.com/dropdown

        //2. Select all the options from multiple language select dropdown.
        List<WebElement> allLanguages = selectLanguages.getOptions();
//            allLanguages.forEach(language->{language.click();
//
//                //verify each is selected.
//            assertTrue(language.isSelected());
//            //3. Print out all selected values
//                System.out.println("language.getText() = " + language.getText());});
        //4.Deselect all values and verify each is deselected.
        for(WebElement each : allLanguages) {
            each.click();
            //Verify it is selected
            Assert.assertTrue(each.isSelected());
            //PrintOut the selected value
            System.out.println("each.getText() = " + each.getText());
        }
        selectLanguages.deselectAll();
        }

        }




