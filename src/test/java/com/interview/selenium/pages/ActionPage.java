package com.interview.selenium.pages;

import com.interview.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionPage {
    public ActionPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//div[@class='figure'][1]")
    public WebElement image1;

    @FindBy(xpath = "//div[@class='figure'][2]")
    public WebElement image2;

    @FindBy(xpath = "//div[@class='figure'][3]")
    public WebElement image3;

    @FindBy(xpath = "//h5[.='name: user2']")
    public WebElement user2;

    @FindBy(xpath = "//h5[.='name: user1']")
    public WebElement user1;

    @FindBy(xpath = "//h5[.='name: user3']")
    public WebElement user3;

    @FindBy(id = "hot-spot")
    public WebElement rightClick;
}
