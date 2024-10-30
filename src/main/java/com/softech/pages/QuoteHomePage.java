package com.softech.pages;

import com.softech.Utility.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class QuoteHomePage extends BasePage {

WebDriver driver;

  @FindBy(xpath= "//button[contains(text(), 'Accept all cookies')]")
    WebElement acceptAllButton;

    @FindBy(id= "vehicleReg")
    WebElement registarionNumber;

    @FindBy(id= "Mileage")
    WebElement mileage;

    @FindBy(xpath= "//span[normalize-space()='Get my car valuation']")
    WebElement getValuationButton;

    public QuoteHomePage(WebDriver driver){
       this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void acceptAllCookies(){
        BasePage.clickOn(driver,acceptAllButton);
    }


    public void enterCarReg(String carNumber){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(35));
        wait.until(d -> mileage.isDisplayed());
        BasePage.sendKeys(driver,registarionNumber,carNumber);

    }

    public void enterMileage(String Mileage){
        BasePage.sendKeys(driver,mileage,Mileage);
    }

    public void getValuation(){
        BasePage.clickOn(driver,getValuationButton);
    }

public void userIsOnHomePage(){
        driver.get("https://www.webuyanycar.com/");
}



}
