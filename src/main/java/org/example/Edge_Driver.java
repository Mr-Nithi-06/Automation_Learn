package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Driver {

    WebDriver Driver;

    public void Edgedriver(){

        System.setProperty("webdriver.edge.driver","C:\\Users\\Nithi\\Downloads\\edgedriver_win64");
        Driver=new EdgeDriver();
    }
}
