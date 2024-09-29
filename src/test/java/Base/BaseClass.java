package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseClass {

    public WebDriver driver; //Veriable

    @BeforeTest //annotation before test
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); //Chromedriver object

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //global wait
    }

    @AfterTest
    public void closeDriver() { driver.close(); } //browser close
}
