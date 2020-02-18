package com.example.automation.stepdefs;

import static com.example.automation.pageobjects.CreateAccountPage.acct_creation_Submit;
import static com.example.automation.pageobjects.CreateAccountPage.title_Mr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.example.automation.pageobjects.CreateAccountPage;
import com.example.automation.pageobjects.HomePage;
import com.example.automation.pageobjects.LoggedinPage;
import com.example.automation.pageobjects.LoginPage;
import com.example.automation.pageobjects.MyAccountPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AutomationPractice{
    public WebDriver driver;
    public static List <HashMap<String,String>> datamap = null;
    HashMap userMap =null;
    public AutomationPractice()
    {
        driver = Hooks.driver;
        userMap = new HashMap();
        userMap.put("username","abc@xyz1234.com");
        userMap.put("password","Test@123");
        System.out.println("Current data" +userMap);
//        datamap.add(sampleData);
    }

    @Given("^a new user to website \"([^\"]*)\"$")
    public void a_new_user_to_website(String url) throws Throwable {
        System.out.println("url:"+url);
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("^the user clicks signin$")
    public void user_sign_in() throws Throwable {
        datamap = new ArrayList<HashMap<String, String>>();
        HashMap credentialsData = new HashMap();
        credentialsData.put("username","abc@xyz"+Math.random()+".com");
        credentialsData.put("password","Test@123");
        System.out.println("Current data" +credentialsData);
        datamap.add(credentialsData);

        PageFactory.initElements(driver, HomePage.class);
        PageFactory.initElements(driver, LoginPage.class);
        HomePage.sign_in.click();
        System.out.println("Signin link clicked" );
    }

    @Then("^they see option to create a new account$")
    public void they_see_option_to_create_a_new_account() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        LoginPage.email_create.sendKeys(datamap.get(0).get("username"));
        LoginPage.submit_create.click();

        PageFactory.initElements(driver, CreateAccountPage.class);
        Assert.assertTrue(acct_creation_Submit.isDisplayed());
    }

    @Then("^enters the details to register$")
    public void enters_the_details_to_register() throws Throwable {
        System.out.println("reg:"+"enter reg details");
        CreateAccountPage.title_Mr.click();
        Assert.assertTrue(title_Mr.isSelected());

        CreateAccountPage.first_name.sendKeys("AutomationTest");
        CreateAccountPage.last_name.sendKeys("LastTest");
        CreateAccountPage.passwd.sendKeys(datamap.get(0).get("password"));
        Select dropDownDays = new Select(CreateAccountPage.days);
        dropDownDays.selectByValue("6");
        Select dropDownMonth = new Select(CreateAccountPage.months);
        dropDownMonth.selectByValue("9");
        Select dropDownYear = new Select(CreateAccountPage.years);
        dropDownYear.selectByValue("1975");
        CreateAccountPage.firstname.sendKeys("AutomationTest");
        CreateAccountPage.lastname.sendKeys("LastTest");
        CreateAccountPage.address1.sendKeys("123 Great Portland street");
        CreateAccountPage.city.sendKeys("California");
        Select dropDownState = new Select(CreateAccountPage.id_state);
        dropDownState.selectByIndex(1);
        Select dropDownCountry = new Select(CreateAccountPage.id_country);
        dropDownCountry.selectByIndex(1);
        CreateAccountPage.postcode.sendKeys("94043");
        CreateAccountPage.phone_mobile.sendKeys("+447738021772");
        CreateAccountPage.alias.sendKeys("AutomationUser");
        CreateAccountPage.acct_creation_Submit.click();
    }

    @Then("^user enters signin details")
    public void enters_the_details_to_signin() throws Throwable {
        LoginPage.email.sendKeys(userMap.get("username").toString());
        System.out.println(" entered in UserName text box" );
        LoginPage.password.sendKeys(userMap.get("password").toString());
        System.out.println(" entered in Password text box" );
        LoginPage.signin_button.click();
        System.out.println("Click action is performed on Submit button");
    }

    @Then("^user is registered$")
    public void user_is_registered() throws Throwable {
        PageFactory.initElements(driver, MyAccountPage.class);
        Assert.assertTrue(MyAccountPage.my_account.getText().contains("My account"));
        System.out.println("regd:"+"regd user");
    }

    @Then("^user is logged in$")
    public void i_sign_out() throws Throwable {
        PageFactory.initElements(driver, LoggedinPage.class);
        Assert.assertTrue(LoggedinPage.signout.isDisplayed());

    }
}

