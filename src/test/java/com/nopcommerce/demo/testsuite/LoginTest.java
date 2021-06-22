package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customListeners.CustomListener;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testBase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners(CustomListener.class)

public class LoginTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    SoftAssert softAssert;

    @BeforeMethod(groups = {"smoke","sanity","regression"})
    public void setUp(){

        homePage = new HomePage();
        loginPage = new LoginPage();
        softAssert = new SoftAssert();
    }


    @Test(groups = {"smoke","regression"})
    public void verifyUserNavigateToLoginPageSuccessfully(){

        homePage.clickOnLoginTab();

        String expectedWelcomeSignInText = "Welcome, Please Sign In!";
        String actualWelcomeSignInText = loginPage.getWelcomeLoginText();
        softAssert.assertEquals(expectedWelcomeSignInText,actualWelcomeSignInText);

        softAssert.assertAll();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {

        homePage.clickOnLoginTab();
        Thread.sleep(1000);
        loginPage.enterEmail("d@gmail.com");
        Thread.sleep(1000);
        loginPage.enterPassword("123456");
        Thread.sleep(1000);
        loginPage.clickOnLoginButton();

        String expectedAfterLoginText = "Log out";
        String actualAfterLoginText = loginPage.getWelcomeLoginText();
        softAssert.assertEquals(expectedAfterLoginText,actualAfterLoginText);

        softAssert.assertAll();

    }


    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNotLoginSuccessfullyWithInvalidCredentials() throws InterruptedException {

        homePage.clickOnLoginTab();

        Thread.sleep(1000);
        loginPage.enterEmail("d129@ymail.com");
        Thread.sleep(1000);
        loginPage.enterPassword("123456");
        Thread.sleep(1000);
        loginPage.clickOnLoginButton();

        Thread.sleep(1000);
        String expectedErrorMessage = "No customer account found";
        String actualErrorMessage = loginPage.getErrorMessage();
        softAssert.assertEquals(expectedErrorMessage,actualErrorMessage);

        softAssert.assertAll();
    }





}
