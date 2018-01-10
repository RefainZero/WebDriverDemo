package com.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Administrator on 2018/1/6.
 * getTitle() 获得当前页面的标题
 * getCurrentUrl() 获得当前页面的 URL
 * getText() 获取页面文本信息
 */
public class AssertTextTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        System.out.println("Search before================");
        //获取当前的 title 和 url
        System.out.println("title of current page is "+driver.getTitle());
        System.out.println("url of current page is " + driver.getCurrentUrl());
        //百度搜索
        WebElement search = driver.findElement(By.id("kw"));
        search.sendKeys("Selenium");
        search.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        System.out.println("Search after================");
        //获取当前的 title 和 url
        System.out.println("title of current page is "+driver.getTitle());
        System.out.println("url of current page is "+driver.getCurrentUrl());
        //获取第一条搜索结果的标题
        WebElement result = driver.findElement(By.xpath("//div[@id='content_left']/div/h3/a"));
        System.out.println(result.getText());
        driver.quit();
    }
}
