package tests.automationExerciseTests;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.crypto.KeyAgreementSpi;

public class TestCase_02 {
    //1. Launch browser

    AutomationExercisePage automationExercisePage = new AutomationExercisePage();

    @Test(priority = 1)
    public void homePageTest(){
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));

        //3. Verify that home page is visible successfully
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(ConfigReader.getProperty("aeExpectedTitleStr")));
    }
    @Test(priority = 2)
    public void signUpLoginTest(){
        //4. Click on 'Signup / Login' button
        automationExercisePage.signUp_LoginButon.click();

        //5. Verify 'Login to your account' is visible
        Assert.assertTrue(automationExercisePage.loginToYourAccountText.isDisplayed());

        //6. Enter correct email address and password
        automationExercisePage.email.sendKeys(ConfigReader.getProperty("aeEmail")
                                              + Keys.TAB+ConfigReader.getProperty("aePassword"));

        //7. Click 'login' button
        automationExercisePage.loginButon.click();

        //8. Verify that 'Logged in as username' is visible
        Assert.assertTrue(automationExercisePage.loggedInUsernameText.isDisplayed());
    }

    @Test(priority = 3)
    public void deleteTest(){

        //9. Click 'Delete Account' button
        automationExercisePage.deleteAccount.click();

        //10. Verify that 'ACCOUNT DELETED!' is visible
        Assert.assertTrue(automationExercisePage.accountDeletedText.isDisplayed());

        ReusableMethods.bekle(3);

        Driver.closeDriver();

    }
}
