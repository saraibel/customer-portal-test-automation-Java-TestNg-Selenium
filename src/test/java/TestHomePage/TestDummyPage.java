package TestHomePage;

import HomePage.BaseClass;
import HomePage.DummyPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDummyPage extends BaseClass {
    @Test
    public void getHome(){
        driver.get(getUrl);
    }


    @Test
    public void verifyLogo(){
        DummyPage dp = new DummyPage(driver);
        WebElement logo = dp.logo();
       Boolean flag = logo.isDisplayed();
        Assert.assertTrue(flag);
        System.out.println(flag);
    }
    @Test
     public void fieldFrom() {
        DummyPage dp = new DummyPage(driver);
        dp.fromField(getFrom);

    }

}
