package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {

    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signUp_LoginButon;
    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement newUserSignupElementi;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement newUserName;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signupButton;

    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement enterAccountInformationElement;

    @FindBy(id = "id_gender1")
    public WebElement genderMrElementi;

    @FindBy(id="password")
    public WebElement password;
    @FindBy(id="newsletter")
    public WebElement checkbox1;
    @FindBy(id="optin")
    public WebElement checkbox2;
    @FindBy(name="first_name")
    public WebElement firstname;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreatedText;

    @FindBy(xpath = "//*[text()='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "(//li)[10]")
    public WebElement loggedInUsernameText;
    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement deleteAccount;

    @FindBy(xpath = "//*[text()='Account Deleted!']")
    public WebElement accountDeletedText;

    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement loginToYourAccountText;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement email;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement loginButon;

    @FindBy(xpath = "//*[text()='Your email or password is incorrect!']")
    public WebElement incorrecttext;
    @FindBy(xpath = "//*[text()=' Contact us']")
    public WebElement contactUsButton;
    @FindBy(xpath = "//*[text()='Get In Touch']")
    public WebElement getInTouchText;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement contactUsNameElementi;
    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement uploadFile;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;
    @FindBy(xpath = "//*[@class='status alert alert-success']")
    public WebElement successText;
    @FindBy(xpath = "(//*[text()=' Home'])[2]")
    public WebElement homeButton;

    @FindBy(xpath = "(//*[text()='View Product'])[1]")
    public WebElement rs500ViewProductElementi;

    @FindBy(xpath = "//*[@class='product-information']")
    public WebElement productInformation;

    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement quantity;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement addToCartButton;
    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCartButton;
    @FindBy(xpath = "//button[@class='disabled']")
    public WebElement cartQuantityElementi;

    @FindBy(xpath = "//*[text()=' Products']")
    public WebElement productsElementi;

    @FindBy(xpath = "//*[text()='All Products']")
    public WebElement allProductsElementi;

    @FindBy(xpath = "//*[@id='search_product']")
    public WebElement searchProductElementi;
    @FindBy(xpath = "//*[@id='submit_search']")
    public WebElement submitProductButton;

    @FindBy(xpath = "//*[text()='Searched Products']")
    public WebElement searchedProductSonucElementi;

    @FindBy(xpath = "(//*[text()='Winter Top'])[1]")
    public WebElement winterTopElementi;

    @FindBy(xpath = "//*[text()='Add to cart']")
    public WebElement productAddToCartElementi;

    @FindBy(xpath = "//*[text()=' Cart']")
    public WebElement cartSayfaGidisElementi;


    @FindBy(xpath= "//*[@id='dismiss-button']")
    public WebElement advCloseButon;

    @FindBy(xpath = "//*[@aria-label='Close ad']")
    public WebElement reklamCloseButon;

    @FindBy(id = "ad_position_box")
    public WebElement googleAds;

    @FindBy(xpath = "(//*[@class='adsbygoogle adsbygoogle-noablate'])[3]")
    public WebElement reklam;
    @FindBy(xpath = "//iframe[@id='aswift_2']")
    public WebElement iframe2;

}
