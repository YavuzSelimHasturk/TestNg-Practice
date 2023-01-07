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
}
