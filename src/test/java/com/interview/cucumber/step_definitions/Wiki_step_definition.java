package com.interview.cucumber.step_definitions;

import com.interview.cucumber.pages.WikiPage;
import com.interview.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class Wiki_step_definition {

    WikiPage wikiPage = new WikiPage();
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }
    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        wikiPage.searchBox.sendKeys("Steve Jobs");
    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiPage.searchButton.click();
    }
    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        String expectedTitle = "Steve Jobs";
        String actualTitle = Driver.getDriver().getTitle();
        assertTrue(actualTitle.contains(expectedTitle));
    }


}
