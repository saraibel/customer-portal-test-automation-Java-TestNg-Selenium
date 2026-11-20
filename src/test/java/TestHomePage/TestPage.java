package TestHomePage;

import HomePage.BaseClass;
import HomePage.homePageActions;
import org.testng.annotations.Test;

public class TestPage {

    @Test
    public void home(){
        driver.get(getUrl);
    }
    @Test public void DropDownMenu(){
        homePageActions hpa = new homePageActions(driver);
        hpa.hoverOverDropdownMenu();
        hpa.performkeyDown();

    }


