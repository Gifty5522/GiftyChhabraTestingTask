package org.benz.pages.browser;

import org.benz.dataproviders.Constants;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.benz.WebDrivers.driver;

public class BrowserSteps {

    public void openPortal() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constants.URL);
    }


    public void quitDriver() {
        driver.quit();
    }

}
