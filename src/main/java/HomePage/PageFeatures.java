package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFeatures {
    WebDriver driver;
    public PageFeatures(WebDriver d) {
        driver = d;
        PageFactory.initElements(d, this);
    }

@FindBy(xpath = " //div[@class='silver-nav-wrapper']//img[@alt='IRS']")
WebElement IRSLogo;
    public WebElement TestLogo() {
        return IRSLogo;


    }
}

