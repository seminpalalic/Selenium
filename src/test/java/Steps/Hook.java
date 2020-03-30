package Steps;

import Base.BaseUtil;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base){
        this.base = base;
    }

    @Before
    public void Initialize() {

        //System.setProperty("webdriver.chrome.driver", "/Users/semin.palalic/Desktop/chromedriver");
        //webDriver = new ChromeDriver();
        System.setProperty("webdriver.tor.driver", "/Users/semin.palalic/Desktop/geckodriver");
        webDriver = new FirefoxDriver();

    }

}
