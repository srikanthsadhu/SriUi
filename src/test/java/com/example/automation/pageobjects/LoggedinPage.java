package com.example.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoggedinPage extends BasePage{

    public LoggedinPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how=How.LINK_TEXT, using="Sign out")
    public static WebElement signout;


}
