package Runner;

import Base.BaseClass;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePageRunner extends BaseClass {
    HomePage homePage;

    @Test(priority = 1)
    public void selectAndInsert()

    {
        homePage = new HomePage(driver);
        driver.get("http://www.amazon.com");
        homePage.dropDownSelection();
        homePage.insertText();
    }


}
