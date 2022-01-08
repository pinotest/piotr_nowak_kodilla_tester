package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FacebookTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();

        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

        WebElement yearCombo = driver.findElement(
                By.xpath("//*[@id=\"birthday_wrapper\"]/div/span/span/select[3]"));

        Select yearSelect = new Select(yearCombo);
        yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(5);
    }
}
