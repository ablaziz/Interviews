package com.interview.selenium.pages;

import com.interview.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IframePage {
    public IframePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "mce_0_ifr")
    public WebElement iframe;

    @FindBy(xpath = "//p[.='Your content goes here.']")
    public WebElement message;

    @FindBy(xpath = "//span[.='Paragraph']")
    public WebElement paragraph;
}
