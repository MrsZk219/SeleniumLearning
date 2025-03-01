package tutorialspointPageTestProject.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tutorialspointPageTestProject.pages.TextBoxPage;
import tutorialspointPageTestProject.utilities.Driver;

import java.time.Duration;

public class TextBoxPageStepDefinitions {
    TextBoxPage textBoxPage = new TextBoxPage();

    @Given("go to Text Box page")
    public void goToTextBoxPage() {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Driver.getDriver().get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
        System.out.println("Text Box page navigated");
    }

    @And("type fullname on Text Box page")
    public void typeFullnameOnTextBoxPage() {
        textBoxPage.enterFullName("zeliha kahya");
        System.out.println("Full name is entered");
    }

    @And("type email on Text Box page")
    public void typeEmailOnTextBoxPage() {
        textBoxPage.enteremail("zeliha.kahya@gmail.com");
        System.out.println("Email is entered");
        
    }

    @And("type address on Text Box page")
    public void typeAddressOnTextBoxPage() {
        textBoxPage.enteraddress("xxxx mah. yyy sok. 34-2 45");
        System.out.println("Address is entered");
        
    }

    @And("type password on Text Box page")
    public void typePasswordOnTextBoxPage() {
        textBoxPage.enterpassword("password");
        System.out.println("Password is entered");
    }

    @When("click submit button")
    public void clickSubmitButton() {
        textBoxPage.clicksubmitButton();
    }

    @Then("Page URL should changed")
    public void pageURLShouldChanged() {
        Assert.assertTrue(textBoxPage.isUrlCorrect("https://www.tutorialspoint.com/selenium/practice/text-box.php#"));
    }
}
