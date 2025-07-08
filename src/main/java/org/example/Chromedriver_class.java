package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Chromedriver_class {

WebDriver driver;

    public void Webdriver()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nithi\\Downloads\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().fullscreen();
    }

}
