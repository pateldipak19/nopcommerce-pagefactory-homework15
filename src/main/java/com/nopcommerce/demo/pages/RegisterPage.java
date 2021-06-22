package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameField;
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameField;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPasswordField;
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement errorMessage;
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationCompleteText;


    public String getTextRegisterText() {
        Reporter.log("Navigate to register page and verify navigated page welcome text " + registerText.toString() + "<br>");
        log.info("Navigate to register page and verify navigated page welcome text " + registerText.toString());
        return registerText.getText();
    }

    public void enterFirstName(String firstName) {

        Reporter.log("Entering first name : " + firstName + " to first name field : " + firstNameField.toString() + "<br>");
        sendTextToElement(firstNameField, firstName);
        log.info("Entering first name : " + firstName + " to email field : " + firstNameField.toString());
    }

    public void enterLastName(String lastName) {

        Reporter.log("Entering last name : " + lastName + " to last name field : " + lastNameField.toString() + "<br>");
        sendTextToElement(lastNameField, lastName);
        log.info("Entering last name : " + lastName + " to last name field : " + lastNameField.toString());
    }

    public void enterEmail(String userName, String domainName) {

        Reporter.log("Entering email address : " + userName + randomNumber() + domainName + " to email field : " + emailField.toString() + "<br>");
        sendTextToElement(emailField, userName + randomNumber() + domainName);
        log.info("Entering email address : " + userName + randomNumber() + domainName + " to email field : " + emailField.toString());
    }

    public void enterPassword(String password) {

        Reporter.log("Entering password : " + password + " to password field : " + passwordField.toString() + "<br>");
        sendTextToElement(passwordField, password);
        log.info("Entering password : " + password + " to password field : " + passwordField.toString());
    }

    public void enterConfirmPassword(String confirmPassword) {

        Reporter.log("Entering confirm password : " + confirmPassword + " to confirm password field : " + confirmPasswordField.toString() + "<br>");
        sendTextToElement(confirmPasswordField, confirmPassword);
        log.info("Entering confirm password : " + confirmPassword + " to confirm password field : " + confirmPasswordField.toString());
    }

    public void clickOnRegisterButton() {

        Reporter.log("Clicking on register button " + registerButton.toString() + "<br>");
        clickOnElement(registerButton);
        log.info("Clicking on register button " + registerButton.toString());

    }

    public String getErrorMessage() {

        Reporter.log("Getting empty mandatory field error message "+ errorMessage.toString()+ "<br>");
        log.info("Getting empty mandatory field error message "+ errorMessage.toString());
        return errorMessage.getText();

    }

    public String getRegistrationCompleteText() {

        Reporter.log("Getting registration completed message "+ registrationCompleteText.toString()+ "<br>");
        log.info("Getting registration completed message "+ registrationCompleteText.toString());
        return registrationCompleteText.getText();

    }

}
