package com.demo.report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({com.demo.report.UseTestNg.class })
public class TestUsNg {
    private WebDriver driver;
    public WebDriver getDriver() {  
        return driver;
    } 

    @Test
    public void f() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //get 到百度首页
        driver.get("https://www.baidu.com/");
        driver.findElement(By. linkText("新闻")).click();
        Assert.assertEquals(driver.getTitle(), "no");
    }
}