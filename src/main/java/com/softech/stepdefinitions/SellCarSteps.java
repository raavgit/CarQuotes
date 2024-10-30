package com.softech.stepdefinitions;

import com.softech.Utility.BasePage;
import com.softech.pages.QuoteDetailsPage;
import com.softech.pages.QuoteHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SellCarSteps extends BasePage {
   WebDriver driver =new ChromeDriver();
    QuoteHomePage quoteHomePage =new QuoteHomePage(driver);
    QuoteDetailsPage quoteDetailsPage =new QuoteDetailsPage(driver);
    @Given("User is on homepage")
    public void user_is_on_homepage() {
        quoteHomePage.userIsOnHomePage();
        quoteHomePage.acceptAllCookies();
    }


    @When("he click on get my valuation")
    public void he_click_on_get_my_valuation() {
      quoteHomePage.getValuation();
    }


    @When("user enters {} and {}")
    public void userEntersAnd(String carNumber, String miles) {
        quoteHomePage.enterCarReg(carNumber);
        quoteHomePage.enterMileage(miles);
    }

    @Then("user should see valid car {}, {} , {} and {}")
    public void userShouldSeeValidCarAnd(String registrationNumber, String make, String model, String year) {
        Assert.assertEquals(registrationNumber,quoteDetailsPage.getCarNumber());
//        Assert.assertEquals(make,quoteDetailsPage.getManufactureName());
//        Assert.assertEquals(model,quoteDetailsPage.getModelName());
//        Assert.assertEquals(year,quoteDetailsPage.getYear());
    }
}
