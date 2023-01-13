package tests.automationExerciseTests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestCase_24 {
    //1. Launch browser
    AutomationExercisePage automationExercisePage = new AutomationExercisePage();
    Actions actions =new Actions(Driver.getDriver());
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
    public void addProduct() {
        //4. Add products to cart
        actions.scrollToElement(automationExercisePage.addToCartButton).perform();
        automationExercisePage.productAddToCartElementi.click();
        automationExercisePage.continueShoppingButon.click();

        //5. Click 'Cart' button
        automationExercisePage.cartSayfaGidisElementi.click();
        //6. Verify that cart page is displayed
        Assert.assertTrue(automationExercisePage.shoppingCart.isDisplayed());

        //7. Click Proceed To Checkout
        automationExercisePage.proceedToCheckout.click();
    }
    @Test(priority = 3)
    public void registerTest() {
        //8. Click 'Register / Login' button
        automationExercisePage.registerLoginButon.click();

        //9. Fill all details in Signup and create account
        automationExercisePage.newUserName.sendKeys(faker.name().name() +
                Keys.TAB + faker.internet().emailAddress());
        automationExercisePage.signupButton.click();

        automationExercisePage.genderMrElementi.click();
        automationExercisePage.password.sendKeys(faker.internet().password() + Keys.TAB +
                "10" + Keys.TAB + "April" + Keys.TAB + "1991");

        automationExercisePage.checkbox1.click();


        automationExercisePage.checkbox2.click();

       automationExercisePage.firstname.sendKeys(faker.name().firstName() + Keys.TAB +
                faker.name().lastName() + Keys.TAB +
                faker.company() + Keys.TAB +
                faker.address().fullAddress() + Keys.TAB + Keys.TAB +
                "canada" + Keys.TAB +
                faker.address().state() + Keys.TAB +
                faker.address().city() + Keys.TAB +
                faker.address().zipCode() + Keys.TAB +
                faker.phoneNumber().cellPhone() + Keys.TAB);

        automationExercisePage.createAccountButton.click();


        //10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        Assert.assertTrue(automationExercisePage.accountCreatedText.isDisplayed());
        automationExercisePage.continueButton.click();
        //11. Verify ' Logged in as username' at top
        Assert.assertTrue(automationExercisePage.loggedInUsernameText.isDisplayed());

    }
    @Test(priority = 4)
    public void checkout(){
    //12.Click 'Cart' button
    automationExercisePage.cartSayfaGidisElementi.click();

    //13. Click 'Proceed To Checkout' button
    automationExercisePage.proceedToCheckout.click();

    //14. Verify Address Details and Review Your Order
    Assert.assertTrue(automationExercisePage.adressDetails.isDisplayed());
    Assert.assertTrue(automationExercisePage.reviewYourOrder.isDisplayed());

    //15. Enter description in comment text area and click 'Place Order'
    automationExercisePage.commentText.sendKeys("thanks for your effort");
    automationExercisePage.placeOrder.click();

    //16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        automationExercisePage.commentText.sendKeys(faker.name().fullName()+Keys.TAB+
                faker.finance().creditCard()+Keys.TAB+"900"+Keys.TAB+"07"+Keys.TAB+"2025");
    //17. Click 'Pay and Confirm Order' button
        automationExercisePage.payAndConfirmOrder.click();

        Driver.getDriver().navigate().back();
    //18. Verify success message 'Your order has been placed successfully!'
        //String alertMessage = automationExercisePage.orderSuccessfullMessage.getText();
        Assert.assertTrue(automationExercisePage.orderSuccessfullMessage.isDisplayed());
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().forward();
        //Assert.assertTrue(alertMessage.contains("successfully!"));

    //19. Click 'Download Invoice' button and verify invoice is downloaded successfully.
        automationExercisePage.downloadInvoiceButton.click();

    //20. Click 'Continue' button
        automationExercisePage.continueButton.click();
    //21. Click 'Delete Account' button
        automationExercisePage.deleteAccount.click();
    //22. Verify 'ACCOUNT DELETED!' and click 'Continue' button
        Assert.assertTrue(automationExercisePage.accountDeletedText.isDisplayed());
    }
}
