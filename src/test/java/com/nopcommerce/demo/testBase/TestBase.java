package com.nopcommerce.demo.testBase;


import com.nopcommerce.demo.propertyReader.PropertyReader;
import com.nopcommerce.demo.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Jay
 */
public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");


    @BeforeMethod(groups = {"smoke","sanity","regression"})
    public void openBrowser(){

        selectBrowser(browser);
    }

    @AfterMethod(groups = {"smoke","sanity","regression"})
    public void tearDown(){

        closeBrowser();
    }
}
