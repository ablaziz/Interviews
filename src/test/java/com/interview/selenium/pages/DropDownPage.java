package com.interview.selenium.pages;

import com.interview.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPage {

    public DropDownPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="state")
    public WebElement stateSelector;

    @FindBy(id="year")
    public WebElement year;

    @FindBy(id="month")
    public WebElement month;

    @FindBy(id="day")
    public WebElement day;

    @FindBy(xpath="//select[@name='Languages']")
    public WebElement language;
}
