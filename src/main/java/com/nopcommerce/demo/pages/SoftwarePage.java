package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SoftwarePage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Software')]")
    WebElement SoftwareText;

    public String getSoftwarePageNavigationText(){

        Reporter.log("Navigate to Software page and verify navigated page welcome text "+ SoftwareText.toString()+ "<br>");
        log.info("Navigate to desktop page and verify navigated page welcome text "+ SoftwareText.toString());
        return SoftwareText.getText();
    }
}
