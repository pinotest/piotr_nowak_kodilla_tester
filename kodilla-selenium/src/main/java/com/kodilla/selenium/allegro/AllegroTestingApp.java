package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.allegro.pl");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@data-role=\"accept-consent\"]")).click();


        WebElement selectDropDown = driver.findElement(
                By.xpath("//select[@data-role=\"filters-dropdown-toggle\"]"));
        Select yearSelect = new Select(selectDropDown);
        yearSelect.selectByIndex(3);

        WebElement searchField = driver.findElement(By.xpath("//input[@name=\"string\"]"));
        searchField.sendKeys("Mavic mini");

        driver.findElement(By.xpath("//button[@data-role=\"search-button\"]")).click();
    }
}
