package com.interview.selenium.tests;

import com.interview.selenium.pages.ActionPage;
import com.interview.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ActionTest {
    ActionPage actionPage = new ActionPage();

    @Test
    public void test1() {
        //TC#1
        //1. Go to http://practice.cydeo.com/hovers
        Driver.getDriver().get("http://practice.cydeo.com/hovers");
        Actions actions = new Actions(Driver.getDriver());
        //2. Hover over to first image
        actions.moveToElement(actionPage.image1).perform();
        //3. Assert: “name: user1” is displayed
        assertTrue(actionPage.image1.isDisplayed(), "Image1 is not displayed");
        //4. Hover over to second image
        actions.moveToElement(actionPage.image2).perform();
        //5. Assert: “name: user2” is displayed
        assertTrue(actionPage.image2.isDisplayed(), "Image2 is not displayed");
        //6. Hover over to third image
        actions.moveToElement(actionPage.image3).perform();
        //7. Assert: “name: user3” is displayed
        assertTrue(actionPage.image3.isDisplayed(), "Image3 is not displayed");
    }

    @Test
    public void testC2() {
        Driver.getDriver().manage().window().fullscreen();
        //1. Go    to https://the-internet.herokuapp.com/context_menu
    Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
    Actions actions = new Actions(Driver.getDriver());
        //2. Right click to the    box.
    actions.contextClick(actionPage.rightClick).perform();
        Alert alert =Driver.getDriver().switchTo().alert();
        //3. Alert will open.
        alert.accept();
        //4. Accept    alert.

    }
}