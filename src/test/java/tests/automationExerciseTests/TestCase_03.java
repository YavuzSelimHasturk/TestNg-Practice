package tests.automationExerciseTests;


import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class TestCase_03 {
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

        //6. Enter incorrect email address and password
        automationExercisePage.email.sendKeys(ConfigReader.getProperty("aeEmail")
                + Keys.TAB+ConfigReader.getProperty("aePassword"));

        //7. Click 'login' button
        automationExercisePage.loginButon.click();

        //8. Verify error 'Your email or password is incorrect!' is visible
        Assert.assertTrue(automationExercisePage.incorrecttext.isDisplayed());
    }




}
