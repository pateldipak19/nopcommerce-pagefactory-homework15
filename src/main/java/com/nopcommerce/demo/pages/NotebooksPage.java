package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class NotebooksPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Notebooks')]")
    WebElement notebooksText;

    public String getNotebooksPageNavigationText(){

        Reporter.log("Navigate to notebooks page and verify navigated page welcome text "+ notebooksText.toString()+ "<br>");
        log.info("Navigate to notebooks page and verify navigated page welcome text "+ notebooksText.toString());
        return notebooksText.getText();
    }
}
