package org.benz;

import org.benz.dataproviders.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDrivers {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver(); // Or your chosen driver
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
    /*
    public static WebDriver getDriver() {
        String browser = Constants.BROWSER;

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH); // Update this path
            return new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "path/to/geckodriver"); // Update this path
            return new FirefoxDriver();
        }
        return null;
    }
}
*/


