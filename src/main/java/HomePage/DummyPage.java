package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DummyPage {
    WebDriver driver;
    public DummyPage(WebDriver d) {
        driver = d;
        PageFactory.initElements(d, this);
    }
        @FindBy(css = "[width='230']")WebElement Logo;
        @FindBy(xpath = "//*[@id=\"bkmgFlights_origin_trip_1\"]")
        WebElement From;

  public WebElement logo(){
      return Logo;
    }
       public void fromField(String Philadelphia){
      From.sendKeys();

    }
}
