package org.benz.mainTest;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


import static org.benz.WebDrivers.driver;

public class GenericWebSteps {
    public void selectState() {

       JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement agreeBtn= (WebElement) jse.executeScript("return document.querySelector('cmm-cookie-banner').shadowRoot.querySelector('div').querySelector('div').querySelector('cmm-buttons-wrapper').querySelector('wb7-button:nth-of-type(2) ').shadowRoot.querySelector('button.button')");
       ((JavascriptExecutor)driver).executeScript("arguments[0].click();", agreeBtn);
    }

    //also write code for validate if the state is selected, then postal code will be enabled.
    public void inputPostalCod() {
        driver.findElement(By.xpath("//wb-input-control[@class='hydrated']//input[@aria-labelledby='postal-code-hint']")).sendKeys("2007");

    }

  //  also write code for validate if the postal code is input, then radio btton  will be enabled
    public void selectPurpose() {
        driver.findElement(By.xpath("//div[@class='dcp-radio__options-container']//input[@value='P']")).click();
    }

    public void clickContinueButton() {
        driver.findElement(By.xpath("//button[@data-test-id='state-selected-modal__close']//span")).click();
    }

    public void clickFilterButton() {
        driver.findElement(By.xpath("//span[@class='filter-toggle']")).click();
    }

    public void selectPreOwnedTab() {
        driver.findElement(By.xpath("//button[@type='button']//span[contains(text(),' Pre-Owned')]")).click();
    }

    public void clickAllFiltersButton() {
        driver.findElement(By.xpath("//button[@type='button']//wb-icon")).click();
    }

    public void clickColorFilterButton() {
        driver.findElement(By.xpath("//div[@data-test-id= 'emh-side-filters-categories__item__vehicle']//wb-icon[@class='emh-side-filters-categories__icon hydrated']//*[name()='svg']//*[name()=\"path\" and @d= \"M6.1 3.1 5 4.1 8.9 8 5 11.8l1.1 1.1L11 8z\"]")).click();
    }

    public void selectBlueColorOption() {
        driver.findElement(By.xpath("//div[@class= 'emh-side-filters-category-filter-template__content-wrapper']//wb-checkbox-control[2]//wb-icon//*[name()='svg']//*[name()=\"path\" and @d=\"M5.817 13.048 2 8.308l1.29-1.036 2.606 3.24 6.88-7.552L14 4.074z\"]")).click();
    }

//    not displaying now on site.
  //  public void clickShowAvailableVehiclesButton() {
    //    driver.findElement(By.xpath("//button[@data-test-id= 'emh-side-filters-modal__show-cars-button']//wb-icon//*[name()='svg']//*[name()=\"path\"and @d=\"M12 14.3a1 1 0 1 0 0-2 1 1 0 0 0 0 2z\"]")).click();
   // }

    public void selectSorting() {
        Select sortList = new Select(driver.findElement(By.xpath("//div[@class='dcp-cars-srp__sorting-dropdown']//select[@id='tn1g14g00c']")));
        sortList.selectByVisibleText("Price: High to Low");
        String confirmSelection = sortList.getFirstSelectedOption().getText();
        System.out.println(confirmSelection);// validating
    }

    public void clickTopPriceVin() {
        driver.findElement(By.xpath("//div[@class='dcp-cars-srp__results dcp-cars-srp-results srp-grid-layout__results']//div[@class='dcp-cars-srp-results__tile'][1]//a[@class= 'emh-vehicle-tile__wrapper-top']//h2")).click();
    }

    public String getVinNumber() {
        WebElement vinnumber = driver.findElement(By.xpath("//div[@class='dcp-cars-buy-box__title-wrapper']"));
        return vinnumber.getText();
    }

    public String getVinModelYear() {
        WebElement vinmodelyear = driver.findElement(By.xpath("//span[@data-test-id='dcp-cars-buy-box-vehicle-characteristics-ucos-first-registration-date']"));
        return vinmodelyear.getText();
    }

    public void saveVinInformation() {
        try {
            String vinNumber = getVinNumber();
            String modelYear = getVinModelYear();
            saveToFile(vinNumber, modelYear);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error fetching vehicle information: " + e.getMessage());
        }
    }

    private void saveToFile(String vinNumber, String modelYear) throws IOException {
        String filePath = "vehicleInfo.txt";
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("VIN Number: " + vinNumber + "\n");
            writer.write("Model Year: " + modelYear + "\n");
            System.out.println("Vehicle information saved to file: " + filePath);
        }
    }

    public void clickEnquiryNowButton() {
        driver.findElement(By.xpath("//button[@data-datadog-id='buybox-leadform']//span")).click();
    }


}

//public void checkIfDisplayed(By locator) {
//    WebElement element = driver.findElement(locator);
//    Assert.assertTrue(element.isDisplayed(), "Element not displayed: " + locator);
//  }

