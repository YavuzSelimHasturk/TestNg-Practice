package tests.automationExerciseTests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_TestCase_1 {
    //Test Case 1: Register User
    //1. Launch browser
    AutomationExercisePage automationExercisePage = new AutomationExercisePage();
    Faker faker = new Faker();

    @Test
    public void homePage(){
    //2. Navigate to url 'http://automationexercise.com'
    Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));

    //3. Verify that home page is visible successfully
    String expectedStr = "Automation Exercise";
    String actualTitle = Driver.getDriver().getTitle();
    Assert.assertEquals(actualTitle,expectedStr);
    }

    @Test
    public void signUpTest() {
        //4. Click on 'Signup / Login' button
        automationExercisePage = new AutomationExercisePage();
        automationExercisePage.signUp_LoginButon.click();

        //5. Verify 'New User Signup!' is visible
        Assert.assertTrue(automationExercisePage.newUserSignupElementi.isDisplayed());

        //6. Enter name and email address
        automationExercisePage.newUserName.sendKeys(faker.name().name() +
                Keys.TAB + faker.internet().emailAddress());

        //7. Click 'Signup' button
        automationExercisePage.signupButton.click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        Assert.assertTrue(automationExercisePage.enterAccountInformationElement.isDisplayed());
    }
    @Test
    public void createAccountTest() {
        //9. Fill details: Title, Name, Email, Password, Date of birth
        automationExercisePage=new AutomationExercisePage();

        //10. Select checkbox 'Sign up for our newsletter!'
        //11. Select checkbox 'Receive special offers from our partners!'
        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        //13. Click 'Create Account button'
        //14. Verify that 'ACCOUNT CREATED!' is visible

    }
    //15. Click 'Continue' button
    //16. Verify that 'Logged in as username' is visible
    //17. Click 'Delete Account' button
    //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

}
