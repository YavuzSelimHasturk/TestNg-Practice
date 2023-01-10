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
