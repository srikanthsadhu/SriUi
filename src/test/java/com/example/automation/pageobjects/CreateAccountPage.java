package com.example.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends BasePage {

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.ID, using = "submitAccount")
    public static WebElement acct_creation_Submit;

    @FindBy(how = How.CSS, using = "#id_gender1")
    public static WebElement title_Mr;

    @FindBy(how = How.ID, using = "customer_firstname")
    public static WebElement first_name;

    @FindBy(how = How.ID, using = "customer_lastname")
    public static WebElement last_name;

    @FindBy(how = How.ID, using = "passwd")
    public static WebElement passwd;

    @FindBy(how = How.ID, using = "days")
    public static WebElement days;

    @FindBy(how = How.ID, using = "months")
    public static WebElement months;
//    public static Select dropDownMonth = new Select(months);

    @FindBy(how = How.ID, using = "years")
    public static WebElement years;
//    public static Select dropDownYear = new Select(years);

    @FindBy(how = How.ID, using = "firstname")
    public static WebElement firstname;

    @FindBy(how = How.ID, using = "lastname")
    public static WebElement lastname;

    @FindBy(how = How.ID, using = "address1")
    public static WebElement address1;

    @FindBy(how = How.ID, using = "city")
    public static WebElement city;

    @FindBy(how = How.ID, using = "id_state")
    public static WebElement id_state;
//    public static Select dropDownState = new Select(id_state);

    @FindBy(how = How.ID, using = "postcode")
    public static WebElement postcode;

    @FindBy(how = How.ID, using = "id_country")
    public static WebElement id_country;

    @FindBy(how = How.ID, using = "phone_mobile")
    public static WebElement phone_mobile;

    @FindBy(how = How.ID, using = "alias")
    public static WebElement alias;

}
