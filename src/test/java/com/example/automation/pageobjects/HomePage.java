package com.example.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public static WebElement sign_in;


    @FindBy(how = How.LINK_TEXT, using = "Sign out")
    public static WebElement sign_out;


}

