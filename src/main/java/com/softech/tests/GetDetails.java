package com.softech.tests;

import com.softech.pages.QuoteDetailsPage;
import com.softech.pages.QuoteHomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class GetDetails
{
   QuoteHomePage quoteHomePage;
   QuoteDetailsPage quoteDetailsPage;
    @Test

    public void carQuoteTest(){
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.webuyanycar.com/");
        quoteHomePage=new QuoteHomePage(driver);
        quoteDetailsPage=new QuoteDetailsPage(driver);

        quoteHomePage.acceptAllCookies();

        quoteHomePage.enterCarReg("P123RAO");
        quoteHomePage.enterMileage("41000");
        quoteHomePage.getValuation();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        Assert.assertEquals("BMW",quoteDetailsPage.getManufactureName());
        Assert.assertEquals("X5 DIESEL ESTATE - xDrive30d M Sport 5dr Auto [7 Seat]",quoteDetailsPage.getModelName());
        Assert.assertEquals("2016",quoteDetailsPage.getYear());
        Assert.assertEquals("Black",quoteDetailsPage.getColour());
        Assert.assertEquals("Automatic",quoteDetailsPage.getTransmission());
        Assert.assertEquals("3000",quoteDetailsPage.getEngineSize());
        Assert.assertEquals("18/10/2016",quoteDetailsPage.getFirstRegisterd());



    }

}
