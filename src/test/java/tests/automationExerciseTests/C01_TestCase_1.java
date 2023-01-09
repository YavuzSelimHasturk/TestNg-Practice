package tests.automationExerciseTests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class C01_TestCase_1 {
    //Test Case 1: Register User
    //1. Launch browser
    AutomationExercisePage automationExercisePage = new AutomationExercisePage();
    Faker faker = new Faker();

    @Test(priority = 1)
    public void homePage(){
    //2. Navigate to url 'http://automationexercise.com'
    Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));

    //3. Verify that home page is visible successfully
    String expectedStr = "Automation Exercise";
    String actualTitle = Driver.getDriver().getTitle();
    Assert.assertEquals(actualTitle,expectedStr);
    }

    @Test(priority = 2)
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
    @Test(priority = 3)
    public void createAccountTest() {
        //9. Fill details: Title, Name, Email, Password, Date of birth
        automationExercisePage = new AutomationExercisePage();
        automationExercisePage.genderMrElementi.click();
        automationExercisePage.password.sendKeys(faker.internet().password() + Keys.TAB +
                "10" + Keys.TAB + "April" + Keys.TAB + "1991");


        //10. Select checkbox 'Sign up for our newsletter!'
        automationExercisePage.checkbox1.click();

        //11. Select checkbox 'Receive special offers from our partners!'
        automationExercisePage.checkbox2.click();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        automationExercisePage.firstname.sendKeys(faker.name().firstName() + Keys.TAB +
                faker.name().lastName() + Keys.TAB +
                faker.company() + Keys.TAB +
                faker.address().fullAddress() + Keys.TAB + Keys.TAB +
                "canada" + Keys.TAB +
                faker.address().state() + Keys.TAB +
                faker.address().city() + Keys.TAB +
                faker.address().zipCode() + Keys.TAB +
                faker.phoneNumber().cellPhone() + Keys.TAB);

        //13. Click 'Create Account button'
        automationExercisePage.createAccountButton.click();

        //14. Verify that 'ACCOUNT CREATED!' is visible
        Assert.assertTrue(automationExercisePage.accountCreatedText.isDisplayed());

        //15. Click 'Continue' button
        automationExercisePage.continueButton.click();

        //16. Verify that 'Logged in as username' is visible
        Assert.assertTrue(automationExercisePage.loggedInUsernameText.isDisplayed());
        }

        @Test(priority = 4)
        public void deleteTest () {
            //17. Click 'Delete Account' button
            automationExercisePage.deleteAccount.click();

            //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
            Assert.assertTrue(automationExercisePage.accountDeletedText.isDisplayed());

            automationExercisePage.continueButton.click();

            Driver.closeDriver();
        }
}

