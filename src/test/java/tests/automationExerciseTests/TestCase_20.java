package tests.automationExerciseTests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase_20 {
    //1. Launch browser
    AutomationExercisePage automationExercisePage =new AutomationExercisePage();
    @Test(priority = 1)
    public void productsPage() {
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));
        //3. Click on 'Products' button
        automationExercisePage.productsElementi.click();
        //4. Verify user is navigated to ALL PRODUCTS page successfully
        Assert.assertTrue(automationExercisePage.allProductsElementi.isDisplayed());

    }
    @Test(priority = 2)
    public void searchProducts() {
        //5. Enter product name in search input and click search button
        automationExercisePage.searchProductElementi.sendKeys("Winter Top");
        automationExercisePage.submitProductButton.click();
        //6. Verify 'SEARCHED PRODUCTS' is visible
        Assert.assertTrue(automationExercisePage.searchedProductSonucElementi.isDisplayed());
        //7. Verify all the products related to search are visible
        Assert.assertTrue(automationExercisePage.winterTopElementi.isDisplayed());
    }
    @Test(priority = 3)
    public void cartTest() {
        //8. Add those products to cart
        automationExercisePage.productAddToCartElementi.click();
        //9. Click 'Cart' button and verify that products are visible in cart
        automationExercisePage.viewCartButton.click();
        Assert.assertTrue(automationExercisePage.winterTopElementi.isDisplayed());

        //10. Click 'Signup / Login' button and submit login details
        automationExercisePage.signUp_LoginButon.click();
        automationExercisePage.email.sendKeys(ConfigReader.getProperty("aeEmail")+Keys.TAB+
                                                ConfigReader.getProperty("aePassword"));
        automationExercisePage.loginButon.click();
        //11. Again, go to Cart page
        automationExercisePage.cartSayfaGidisElementi.click();
        //12. Verify that those products are visible in cart after login as well
        Assert.assertTrue(automationExercisePage.winterTopElementi.isDisplayed());
    }
}
