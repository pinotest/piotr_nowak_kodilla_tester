package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {
    @FindBy(css = "div[class='g']")
    private List<WebElement> results;
    private static GoogleResultDetailsRandom googleResultDetailsRandom;



    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }

    public void clickRandomResults (){
        Random intNumber = new Random();
        int randomResultIndex = intNumber.nextInt(5);
        googleResultDetailsRandom = loadRandomResults(driver, randomResultIndex);
        googleResultDetailsRandom.iSeeRandomResults();

    }

    public GoogleResultDetailsRandom loadRandomResults(WebDriver driver, int randomResultIndex) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
     //   System.out.println("path href:" + results.get(randomResultIndex).findElement(By.xpath("//*[@href]")).getAttribute("href"));
        wait.until(ExpectedConditions.elementToBeClickable(results.get(randomResultIndex))).click();
        GoogleResultDetailsRandom googleResultDetailsRandom = new GoogleResultDetailsRandom(driver);
        return googleResultDetailsRandom;
    }
}
