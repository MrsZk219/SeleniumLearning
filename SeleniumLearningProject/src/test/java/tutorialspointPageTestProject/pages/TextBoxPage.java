package tutorialspointPageTestProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tutorialspointPageTestProject.utilities.Driver;

import java.util.Objects;

public class TextBoxPage {
    @FindBy(id="fullname")
    private WebElement fullnameInput;

    @FindBy(id="email")
    private WebElement emailInput;

    @FindBy(id="address")
    private WebElement addressInput;

    @FindBy(id="password")
    private WebElement passwordInput;

    @FindBy(css = "input[type='submit']")
    private WebElement submitButton;


    public TextBoxPage() { PageFactory.initElements(Driver.getDriver(),this); }

    public void enterFullName(String fullname) { fullnameInput.sendKeys(fullname); }
    public void enteremail(String email) { emailInput.sendKeys(email); }
    public void enteraddress(String address) { addressInput.sendKeys(address); }
    public void enterpassword(String password) { passwordInput.sendKeys(password); }
    public void clicksubmitButton() { submitButton.click(); }
    public boolean isUrlCorrect(String expectedUrl){ return Objects.equals(Driver.getDriver().getCurrentUrl(), expectedUrl); }

}
