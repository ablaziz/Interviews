package com.interview.cucumber.step_definitions;

import com.interview.cucumber.pages.AmazonPage;
import com.interview.utilities.ConfigurationReader;
import com.interview.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Amazon_step_def {
AmazonPage amazonPage = new AmazonPage();
    @Given("User on the home page and search for {string}")
    public void user_on_the_home_page_and_search_for(String oil) {
        String url = ConfigurationReader.getProperty("amazonUrl");
        Driver.getDriver().get(url);
        amazonPage.searchBox.sendKeys(oil, Keys.ENTER);
    }
    @When("User click on the {string}")
    public void user_click_on_the(String nameOfProduct) {
    Driver.getDriver().findElement(By.linkText(nameOfProduct)).click();
    }
    @When("User click on button Sell on Amazon")
    public void user_click_on_button_sell_on_amazon() {
     amazonPage.addToList.click();

        Assert.assertEquals("Amazon Sign-In",Driver.getDriver().getTitle());


    }
    @Then("User go to Log in Page")
    public void user_go_to_log_in_page() {

    }

}
