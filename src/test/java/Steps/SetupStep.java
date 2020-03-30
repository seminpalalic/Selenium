package Steps;

import Base.BaseUtil;
import Transformation.TitleTransformation;
import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SetupStep extends BaseUtil {

    private BaseUtil base;

    public SetupStep(BaseUtil base) {
        this.base = base;
    }

    @And("^I enter the following for User form$")
    public void iEnterTheFollowingForUserForm(DataTable table) {
        List<List<String>> data = table.raw();

        Select title = new Select(webDriver.findElement(By.name("TitleId")));
        title.selectByValue(TitleTransformation.transform(data.get(1).get(0)));
        webDriver.findElement(By.name("Initial")).sendKeys(data.get(1).get(1));
        webDriver.findElement(By.name("FirstName")).sendKeys(data.get(1).get(2));
        webDriver.findElement(By.name("MiddleName")).sendKeys(data.get(1).get(3));

        //Select gender = new Select(webDriver.findElement(By.name("Female")));
        //gender.selectByValue("female");
        //webDriver.findElement(By.name("Female")).click();
        //webDriver.findElement(By.name("Male")).sendKeys(Keys.);

        if (data.get(1).get(5).equals("English")){
            if (!webDriver.findElement(By.name("english")).isSelected()){
                webDriver.findElement(By.name("english")).click();
            }
            if (webDriver.findElement(By.name("Hindi")).isSelected()){
                webDriver.findElement(By.name("Hindi")).click();
            }
        }
        else if (data.get(1).get(5).equals("Hindi")){
            if (webDriver.findElement(By.name("english")).isSelected()){
                webDriver.findElement(By.name("english")).click();
            }
            if (!webDriver.findElement(By.name("Hindi")).isSelected()){
                webDriver.findElement(By.name("Hindi")).click();
            }
        }

    }

    @And("^I click on save button$")
    public void iClickOnSaveButton() {
        webDriver.findElement(By.name("Save")).submit();
    }
}
