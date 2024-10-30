package com.softech.pages;


import com.softech.Utility.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class QuoteDetailsPage extends BasePage {
    WebDriver driver;

    @FindBy(xpath= "//div[@class='d-none d-sm-block mb-4 ng-tns-c2261452767-2 ng-star-inserted']//div[@class='d-table-cell value']")
     List<WebElement> vehicleDetails;

@FindBy(xpath="//div[@class='details-vrm ng-star-inserted']")
WebElement carNumber;
//div[@class='d-none d-sm-block mb-4 ng-tns-c2261452767-2 ng-star-inserted']//div[@class='details-vrm ng-star-inserted'][normalize-space()='P123RAO']

    public QuoteDetailsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public String getManufactureName(){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(d -> vehicleDetails.get(0).isDisplayed());
        return vehicleDetails.get(0).getText();
    }
    public String getModelName(){
        return vehicleDetails.get(1).getText();
    }
    public String getYear(){
        return vehicleDetails.get(2).getText();
    }
    public String getColour(){
        return vehicleDetails.get(3).getText();
    }
    public String getTransmission(){
        return vehicleDetails.get(4).getText();
    }
    public String getEngineSize(){
        return vehicleDetails.get(5).getText();
    }
    public String getFirstRegisterd(){
        return vehicleDetails.get(6).getText();
    }

public String getCarNumber(){
        return carNumber.getText();
}

}
