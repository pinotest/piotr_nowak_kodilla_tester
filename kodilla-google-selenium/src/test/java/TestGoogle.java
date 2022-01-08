import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GoogleSearch;

import java.util.concurrent.TimeUnit;

public class TestGoogle {
    WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\kurs_ta\\kodilla-google-selenium\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.navigate().to("http://www.google.com");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
       // driver.close();
    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();

    }
}
