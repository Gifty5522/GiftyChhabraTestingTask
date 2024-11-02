package org.benz.mainTest;

import org.benz.WebDrivers;
import org.benz.pages.browser.BrowserSteps;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class PriceEnquiryTest extends GenericWebSteps {
    //private WebDriver driver;
    private GenericWebSteps genericWebSteps;
    private BrowserSteps browserSteps;

    private static final String rootOne = "//cmm-cookie-banner[@class='hydrated']";

    @BeforeMethod
    public void setUp() throws InterruptedException {
        browserSteps = new BrowserSteps();
        browserSteps.openPortal();
    }

    @Test
    public void testPriceEnquiry() {
        genericWebSteps = new GenericWebSteps();

        genericWebSteps.clickAgreeToAll();


        //genericWebSteps.selectState();

        // 1. write code for wait till Policy Accept dialog opens.

        // 2. code to click Agree to all button

        //3. Select Location : South Wales
        // genericWebSteps_toCheck.selectState();
        //   genericWebSteps_toCheck.inputPostalCod();
        //   genericWebSteps_toCheck.selectPurpose();

        //or this:  genericWebSteps.openLocationSelection(Constants.STATE, Constants.POSTAL_CODE, Constants.PURPOSE);

        //4. Click continue button
        //     genericWebSteps.clickContinueButton();

        // 5. write the code to click on filter button on the next page
        //genericWebSteps_toCheck.checkIfDisplayed(); write code to validate of explore page opens
        //* genericWebSteps.clickFilterButton();


        // 6.click on preowned tab
        // genericWebSteps.selectPreOwnedTab();
        // genericWebSteps.clickAllFiltersButton(); // to click on all filters button under preowned page/


        // 7. click on color and select blue color
        //   genericWebSteps.clickColorFilterButton();
        //   genericWebSteps.selectBlueColorOption();
        //genericWebSteps.clickShowAvailableVehiclesButton();


        // 8. click on sorting button and select Price high to low
        //genericWebSteps.selectSorting();


        // 9. click on top priced vin and fetch the vin number and model year of the top priced card
        //   genericWebSteps.clickTopPriceVin();

        // 10.  save to a file- done
        //  genericWebSteps.saveVinInformation();

        // 11. click on "speak to a expert" button


        // 12. fill the personal data and try to add incorrect email

        // 13. click submit and handle this negative test

    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Test failed, keeping the browser open for debugging.");
            // You might want to add additional logging or take screenshots here
        } else {
            // Close the browser if the test passed
            browserSteps.quitDriver();
        }
        browserSteps.quitDriver();
    }
}
/*}
    @Test
    public void setUp() throws InterruptedException {
        genericWebSteps = new GenericWebSteps();
        browserSteps = new BrowserSteps();

        browserSteps.openPortal();
        // write code to accept cookies.
        //  genericWebSteps_toCheck.selectState();
        //   Thread.sleep(20);
        //  genericWebSteps_toCheck.selectState();
        //   genericWebSteps_toCheck.inputPostalCod();
        //   genericWebSteps_toCheck.selectPurpose();

        // genericWebSteps.openLocationSelection(Constants.STATE, Constants.POSTAL_CODE, Constants.PURPOSE);
        genericWebSteps.clickContinueButton();
        //genericWebSteps_toCheck.checkIfDisplayed(); write code to validate of explore page opens
        genericWebSteps.clickFilterButton();
        genericWebSteps.selectPreOwnedTab();
        genericWebSteps.clickAllFiltersButton(); // to click on all filters button under preowned page/
        genericWebSteps.clickColorFilterButton();
        genericWebSteps.selectBlueColorOption();
        genericWebSteps.clickShowAvailableVehiclesButton();
        genericWebSteps.selectSorting();
        genericWebSteps.clickTopPriceVin();
        genericWebSteps.clickTopPriceVin();
        genericWebSteps.saveVinInformation();



    //@Test
    // public void testMethod() {
    // Your test logic here
    //  Assert.assertTrue(true); // Example assertion
    //   }
*/
