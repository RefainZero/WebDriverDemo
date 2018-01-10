package com.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2018/1/7.
 * WebDriverWait 类是由 WebDirver 提供的等待方法。在设置时间内，默认每隔一段时间检测一次当前页面元素是否存在，如果超过设置时间检测不到则抛出异常
 */
public class WaitTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8090/demo.html");
        driver.manage().window().maximize();
        //全局等待
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.className("wait")).click();
        //显式等待，针对某个元素等待
        WebElement red = new WebDriverWait(driver, 10, 1).until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.className("red"));
            }
        });
        String text = red.getText();
        System.out.println(text);
    }
}
