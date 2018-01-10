package com.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Administrator on 2018/1/6.
 * clickAndHold() 模拟鼠标悬停
 */
public class MouseTest {
    public static void main(String[] args) {
        baiduTest();
        testAction();
        //driver.quit();
    }

    private static void baiduTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");
        WebElement search_setting = driver.findElement(By.linkText("设置"));
        Actions action = new Actions(driver);
        action.clickAndHold(search_setting).perform();
    }

    public static void testAction() {
        WebDriver driver = new ChromeDriver();
        driver.get("localhost:8090/demo.html");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.className("over"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        String text = driver.findElement(By.id("over")).getText();
        System.out.println(text);
    }
}
