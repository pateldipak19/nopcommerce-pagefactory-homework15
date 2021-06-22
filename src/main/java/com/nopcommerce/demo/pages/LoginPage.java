package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeLoginText;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutText;
    @FindBy(xpath = "//li[contains(text(),'No customer account found')]")
    WebElement errorMessage;



    public String getWelcomeLoginText(){

        Reporter.log("Navigate to register page and verify navigated page welcome text "+ welcomeLoginText.toString()+ "<br>");
        log.info("Navigate to register page and verify navigated page welcome text "+ welcomeLoginText.toString());
        return welcomeLoginText.getText();
    }

    public void enterEmail(String email) {

        Reporter.log("Entering email address : " +email+ " to email field : " + emailField.toString() + "<br>");
        sendTextToElement(emailField, email);
        log.info("Entering email address : " + email + " to email field : " + emailField.toString());
    }

    public void enterPassword(String password) {

        Reporter.log("Entering password : " + password + " to password field : " + passwordField.toString() + "<br>");
        sendTextToElement(passwordField, password);
        log.info("Entering password : " + password + " to password field : " + passwordField.toString());
    }

    public void clickOnLoginButton(){

        Reporter.log("Clicking on login button " + loginButton.toString()+"<br>");
        clickOnElement(loginButton);
        log.info("Clicking on login button " + loginButton.toString());
    }

    public String getLogOutText(){

        Reporter.log("Page Navigation with welcome Text from element "+ logOutText.toString()+"<br>" );
        log.info("Page Navigation with welcome Text from element "+ logOutText.toString());
        return logOutText.getText();
    }

    public String getErrorMessage() {

        Reporter.log("Getting invalid credentials error message " + errorMessage.toString() + "<br>");
        log.info("Getting invalid credentials error message " + errorMessage.toString());
        return errorMessage.getText();
    }

}
