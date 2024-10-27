package org.benz.mainTest;

import org.benz.pages.browser.BrowserSteps;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriceEnquiryTest extends GenericWebSteps {
    //private WebDriver driver;
    private GenericWebSteps genericWebSteps;
    private BrowserSteps browserSteps;

    @BeforeMethod

    public void setUp() {
        genericWebSteps = new GenericWebSteps();
        browserSteps = new BrowserSteps();
        browserSteps.openPortal();
    }

    @Test
    public void testPriceEnquiry() {
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

    }
    // write the code to click on filter button on the next page
    // click on preowned tab
    // click on color and select blue color
    // clikc on sorting button and select Price high to low
    //click on top priced vin
    // fetch the vin number and model year of the top priced card
    // and save to a file- done
    // click on "speak to a expert" button
    // fill the personal data and try to add incorrect email
    // click submit and handle this negative test


    //@Test
    // public void testMethod() {
    // Your test logic here
    //      Assert.assertTrue(true); // Example assertion
    //   }
*/
