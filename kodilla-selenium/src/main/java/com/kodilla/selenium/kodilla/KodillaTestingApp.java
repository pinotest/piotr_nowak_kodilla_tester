package com.kodilla.selenium.kodilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class KodillaTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.kodilla.com/pl/sign-in");
        driver.manage().window().maximize();

        WebElement inputField = driver.findElement(By.xpath("/html/body/div[1]/div/form/fieldset[1]/input"));
        inputField.sendKeys("testuser@gmail.com");
        inputField.submit();

    }
}
