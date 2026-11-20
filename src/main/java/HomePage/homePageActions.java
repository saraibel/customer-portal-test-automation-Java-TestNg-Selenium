package HomePage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageActions {
    WebDriver driver;
    public homePageActions(WebDriver driver1){
        driver=driver1;

        PageFactory.initElements(driver1,this);
    }
    @FindBy(xpath= "//label[@id='ham-icon']")
    WebElement Menu;
    @FindBy(xpath= "/@FindBy(xpath= \"//label[@id='ham-icon']\")")
    WebElement TaxDebtRelief;
    public void hoverOverDropdownMenu() {
        Actions action = new Actions(driver);
        action.moveToElement(Menu).build().perform();
    }
    public void performkeyDown(){
        Actions action = new Actions(driver);
        action.sendKeys(TaxDebtRelief, Keys.DOWN).build().perform();
        action.clickAndHold();
    }


    }


