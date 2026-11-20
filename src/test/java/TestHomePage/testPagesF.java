package TestHomePage;

import HomePage.BaseClass;
import HomePage.PageFeatures;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testPagesF extends BaseClass {
    @Test
    public void home(){
        driver.get(getUrl);
    }
    @Test
    public void verifylogo(){
        PageFeatures pf = new PageFeatures(driver);
      WebElement TestLogo = pf.TestLogo();
     Boolean flag = TestLogo.isDisplayed();
     Assert.assertTrue(flag);

    }
}
