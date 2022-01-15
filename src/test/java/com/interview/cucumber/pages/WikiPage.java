package com.interview.cucumber.pages;

import com.interview.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPage {

    public WikiPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "searchInput")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;



    /**
     * TC#25: Wikipedia Search Functionality Title Verification
     * 1. User is on Wikipedia home page
     * 2. User types Steve Jobs in the wiki search box
     * 3. User clicks wiki search button
     * 4. User sees Steve Jobs is in the wiki title
     *
     * Note: Follow POM
     * TC#26: Wikipedia Search Functionality Header Verification
     * 1. User is on Wikipedia home page
     * 2. User types Steve Jobs in the wiki search box
     * 3. User clicks wiki search button
     * 4. User sees Steve Jobs is in the main header
     *
     * Note: Follow POM
     * TC#27: Wikipedia Search Functionality Image Header Verification
     * 1. User is on Wikipedia home page
     * 2. User types Steve Jobs in the wiki search box
     * 3. User clicks wiki search button
     * 4. User sees Steve Jobs is in the image header
     */
}
