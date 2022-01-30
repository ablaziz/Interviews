package com.interview.cucumber.pages;

import com.interview.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UIPage {
    public UIPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@placeholder='password']")
    public WebElement password;

    @FindBy(xpath = "//button[.='sign in']")
    public WebElement signIn;

    @FindBy(linkText = "my")
    public WebElement myIcon;

    @FindBy(linkText = "self")
    public WebElement myself;

    @FindBy(xpath = "//h1[@class='title']")
    public WebElement title;



}
