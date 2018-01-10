package com.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Administrator on 2018/1/7.
 * switchTo().frame 进入iframe
 * switchTo().defaultContent 退出iframe
 */
public class IframeTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8090/demo.html");
        driver.manage().window().maximize();
        //进入iframe
        driver.switchTo().frame("iframe");
        //iframe输入文本
        driver.findElement(By.id("user")).sendKeys("我是iframe。。。。。");
        //退出iframe
        driver.switchTo().defaultContent();
        //主窗口输入文本
        driver.findElement(By.id("user")).sendKeys("我是主窗口......");
        driver.quit();
    }

}
