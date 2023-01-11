package tests.automationExerciseTests;

import com.github.javafaker.Faker;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestCase_06 {
    //1. Launch browser
    AutomationExercisePage automationExercisePage = new AutomationExercisePage();

    Faker faker= new Faker();

    @Test(priority = 1)
    public void homePageTest() {
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));

        //3. Verify that home page is visible successfully
        String expectedStr = "Automation Exercise";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedStr);
    }
        @Test(dependsOnMethods = "homePageTest")
    public void contactUsTest() {
            //4. Click on 'Contact Us' button
            automationExercisePage.contactUsButton.click();

            //5. Verify 'GET IN TOUCH' is visible
            Assert.assertTrue(automationExercisePage.getInTouchText.isDisplayed());

            //6. Enter name, email, subject and message
            automationExercisePage.contactUsNameElementi.sendKeys(faker.name().fullName()+
                    Keys.TAB+ faker.internet().emailAddress()+Keys.TAB+faker.business()+ Keys.TAB+
                    faker.expression("cloud"));
            ReusableMethods.bekle(4);
            //7. Upload file
          //  automationExercisePage.uploadFile.click();
            String dosyaYolu = System.getProperty("user.home")+"\\Desktop\\Merhabajava.docx";

            automationExercisePage.uploadFile.sendKeys(dosyaYolu);

            //8. Click 'Submit' button
            automationExercisePage.submitButton.click();
            //9. Click OK button
            Driver.getDriver().switchTo().alert().accept();

            //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
            Assert.assertTrue(automationExercisePage.successText.isDisplayed());
        }
        @Test(dependsOnMethods = "contactUsTest")
    public void homePageReturnTest(){
            //11. Click 'Home' button and verify that landed to home page successfully
        automationExercisePage.homeButton.click();
        ReusableMethods.bekle(5);
            String expectedStr = "Automation Exercise";
            String actualTitle = Driver.getDriver().getTitle();
            Assert.assertEquals(actualTitle, expectedStr);
        }
}

