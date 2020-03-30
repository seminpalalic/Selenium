package Steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginStep extends BaseUtil {

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }


    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        webDriver.get("http://www.executeautomation.com/demosite/Login.html");
    }

    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();

        webDriver.findElement(By.name("UserName")).sendKeys(data.get(0).get(0));
        webDriver.findElement(By.name("Password")).sendKeys(data.get(0).get(1));

    }

    @And("^I click on the login$")
    public void iClickOnTheLogin() {
        webDriver.findElement(By.name("Login")).submit();
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() {

    }

}
