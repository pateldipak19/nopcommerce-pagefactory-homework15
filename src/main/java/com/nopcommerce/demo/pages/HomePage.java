package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginTab;
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerTab;
    @FindBy(xpath = "(//a[@href='/computers'])[1]")
    WebElement computerTab;
    @FindBys(@FindBy(xpath = "(//ul[@class='sublist first-level'])[1]//li"))
    List<WebElement> computerSubMenuList;



    public void clickOnLoginTab() {
        Reporter.log("Clicking on login tab element " + loginTab.toString() + "<br>");
        clickOnElement(loginTab);
        log.info("Clicking on login tab element " + loginTab.toString());

    }

    public void clickOnRegisterTab() {
        Reporter.log("Clicking on register tab element " + registerTab.toString() + "<br>");
        clickOnElement(registerTab);
        log.info("Clicking on register tab element " + registerTab.toString());
    }

    public void mouseHoverOnComputerTab() {
        Reporter.log("Mouse hover on computer tab element " + computerTab.toString() + "<br>");
        mouseHoverToElement(computerTab);
        log.info("Mouse hover on computer tab element " + computerTab.toString());

    }

    public void clickOnComputerTab(){
        Reporter.log("Clicking on computer tab element " + computerTab.toString() + "<br>");
        clickOnElement(computerTab);
        log.info("Clicking on computer tab element " + computerTab.toString());

    }




    public void selectFromComputerSubMenu(String product) throws InterruptedException {

        for (WebElement element : computerSubMenuList) {
            Reporter.log("Getting text from computer sub menu product element " + element.toString() + "<br>");
            log.info("Getting text from computer sub product element " + element.toString());
            if (element.getText().equalsIgnoreCase(product)) {
                Reporter.log("Clicking on computer sub menu product element " + element.toString() + "<br>");
                Thread.sleep(1000);
                System.out.println(computerSubMenuList);
                mouseHoverToElementAndClick(element);
                log.info("Clicking computer sub menu product element " + element.toString());
                break;

            }

        }
    }
}









