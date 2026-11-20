package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;
import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;
//    public String getUrl= ("https://IRS.com");
//    public String getUrl= ("https://BBC.com");
    public String getUrl= ("https://www.irctc.co.in/");
    public String getFrom =("Philadelphia");

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }
        @AfterClass
        public void tearDown() {

            driver.quit();

        }
    }
