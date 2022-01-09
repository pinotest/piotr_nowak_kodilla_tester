package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class GoogleResultDetailsRandom extends AbstractPage{

    public GoogleResultDetailsRandom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void iSeeRandomResults() {
        System.out.println("I see results");
        System.out.println(driver.getTitle());

    }
    public String getPageTitle(WebDriver driver)
    {
        return  driver.getTitle();
    }
}
