package com.softech;

import com.softech.Utility.BasePage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CompleteTestWithOutFrameWork extends BasePage {

     @Test
    public  void fullTest() throws InterruptedException {
        driver.get("https://www.webuyanycar.com/");

         WebElement acceptAllButton=driver.findElement(By.xpath("//button[contains(text(), 'Accept all cookies')]"));
         BasePage.clickOn(driver,acceptAllButton);

         Thread.sleep(35000);

        WebElement registarionNumber=driver.findElement(By.id("vehicleReg"));
         BasePage.sendKeys(driver,registarionNumber,"P123RAO");

        WebElement mileage=driver.findElement(By.id("Mileage"));
         BasePage.sendKeys(driver,mileage,"40000");

        WebElement getValuationButton=driver.findElement(By.xpath("//span[normalize-space()='Get my car valuation']"));
      BasePage.clickOn(driver,getValuationButton);

         Thread.sleep(10000);

         String xpath=" //div[@class='d-none d-sm-block mb-4 ng-tns-c2261452767-2 ng-star-inserted']//div[@class='d-table-cell value']";

         WebElement carNumber= driver.findElement(By.xpath("//div[@class='d-none d-sm-block mb-4 ng-tns-c2261452767-2 ng-star-inserted']//div[@class='details-vrm ng-star-inserted']"));


         System.out.println(carNumber.getText());
         System.out.println(driver.findElements(By.xpath(xpath)).get(0).getText());
         System.out.println(driver.findElements(By.xpath(xpath)).get(1).getText());
         System.out.println(driver.findElements(By.xpath(xpath)).get(2).getText());
         System.out.println(driver.findElements(By.xpath(xpath)).get(3).getText());
         System.out.println(driver.findElements(By.xpath(xpath)).get(4).getText());
         System.out.println(driver.findElements(By.xpath(xpath)).get(5).getText());
         System.out.println(driver.findElements(By.xpath(xpath)).get(6).getText());


     }

}
