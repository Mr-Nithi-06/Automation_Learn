package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginxpath {

    public void xpath(){

        WebDriver we;
        we= new ChromeDriver();
        WebElement Login = we.findElement(By.name("username"));
        Login.sendKeys("student"+ Keys.ARROW_DOWN);
        WebElement loginP =we.findElement(By.name("password"));
        loginP.sendKeys("Password123"+Keys.ARROW_DOWN);
        WebElement Button = we.findElement(By.xpath("/html/body/div/div/section/section/div[1]/button"));
        Button.click();
        we.quit();

    }
}
