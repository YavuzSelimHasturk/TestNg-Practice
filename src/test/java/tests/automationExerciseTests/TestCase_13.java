package tests.automationExerciseTests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase_13 {
    //1. Launch browser
    AutomationExercisePage automationExercisePage = new AutomationExercisePage();

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
    public void productViewTest() {
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(automationExercisePage.rs500ViewProductElementi);
        //4. Click 'View Product' for any product on home page
        automationExercisePage.rs500ViewProductElementi.click();
        //5. Verify product detail is opened
        Assert.assertTrue(automationExercisePage.productInformation.isDisplayed());
    }
    @Test(priority = 3)
    public void quantityTest() {

        //6. Increase quantity to 4
        automationExercisePage.quantity.clear();
        automationExercisePage.quantity.sendKeys("4");
        //7. Click 'Add to cart' button
        automationExercisePage.addToCartButton.click();
        //8. Click 'View Cart' button
        automationExercisePage.viewCartButton.click();
        //9. Verify that product is displayed in cart page with exact quantity
        int siparisAdedi = Integer.parseInt(automationExercisePage.cartQuantityElementi.getText());
        System.out.println(siparisAdedi);
        Assert.assertEquals(siparisAdedi, 4);
    }
}
