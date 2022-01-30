package com.interview.cucumber.step_definitions;

import com.interview.cucumber.pages.UIPage;
import com.interview.utilities.ConfigurationReader;
import com.interview.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class UI_step_def {
    UIPage uiPage = new UIPage();

    @Given("User logs in with {string} and {string}")
    public void user_logs_in_with_and(String email, String password) {
        String Url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(Url);

        uiPage.email.sendKeys(email);
        uiPage.password.sendKeys(password);
        uiPage.signIn.click();

    }

    @When("User navigates to mySelf page")
    public void user_navigates_to_my_self_page() {
        WebDriver driver;
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(uiPage.myIcon).perform();
        uiPage.myself.click();
    }

    @DisplayName("Assertions")
    @Then("User gets the UI info")
    public void user_gets_the_ui_info() {
        Assertions.assertEquals("me", uiPage.title.getText());

    }




}
