package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customListeners.CustomListener;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testBase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListener.class)
public class ComputerTest extends TestBase {

    SoftAssert softAssert;
    HomePage homePage;
    DesktopPage desktopPage;
    NotebooksPage notebooksPage;
    SoftwarePage softwarePage;
    ComputerPage computerPage;

    @BeforeMethod(groups = {"smoke", "sanity", "regression"})
    public void setUp() {

        softAssert = new SoftAssert();
        homePage = new HomePage();
        desktopPage = new DesktopPage();
        notebooksPage = new NotebooksPage();
        softwarePage = new SoftwarePage();
        computerPage = new ComputerPage();
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserAbleToNavigateToComputersPageSuccessfully(){

        homePage.clickOnComputerTab();

        String expectedComputerNavigationText = "Computers";
        String actualComputerNavigationText = computerPage.getComputerNavigationText();
        softAssert.assertEquals(expectedComputerNavigationText,actualComputerNavigationText);

        softAssert.assertAll();
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserAbleToNavigateToComputersSubMenuProductDesktopPageSuccessfully() throws InterruptedException {

        homePage.mouseHoverOnComputerTab();
        Thread.sleep(500);
        homePage.selectFromComputerSubMenu("Desktops");

        String expectedDesktopPageNavigationText = "Desktops";
        String actualDesktopPageNavigationText = desktopPage.getDesktopPageNavigationText();
        softAssert.assertEquals(expectedDesktopPageNavigationText, actualDesktopPageNavigationText);

        softAssert.assertAll();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserAbleToNavigateToComputersSubMenuProductNotebooksPageSuccessfully() throws InterruptedException {

        homePage.mouseHoverOnComputerTab();
        Thread.sleep(1000);
        homePage.selectFromComputerSubMenu("Notebooks");

        String expectedNotebooksPageNavigationText = "Notebooks";
        String actualNotebooksPageNavigationText = notebooksPage.getNotebooksPageNavigationText();
        softAssert.assertEquals(expectedNotebooksPageNavigationText, actualNotebooksPageNavigationText);

        softAssert.assertAll();

    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserAbleToNavigateToComputersSubMenuProductSoftwarePageSuccessfully() throws InterruptedException {

        homePage.mouseHoverOnComputerTab();
        Thread.sleep(1000);
        homePage.selectFromComputerSubMenu("Software");

        String expectedSoftwarePageNavigationText = "Software";
        String actualSoftwarePageNavigationText = softwarePage.getSoftwarePageNavigationText();
        softAssert.assertEquals(expectedSoftwarePageNavigationText, actualSoftwarePageNavigationText);

        softAssert.assertAll();

    }
}
