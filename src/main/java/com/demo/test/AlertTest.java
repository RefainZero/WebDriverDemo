package com.demo.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Administrator on 2018/1/7.
 * switchTo().alert() 获得警告框
 * accept() 接收警告框
 */
public class AlertTest {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8090/demo.html");
        driver.manage().window().maximize();
        driver.findElement(By.className("alert")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        //弹窗文本
        String text = alert.getText();
        System.out.println(text);
        Thread.sleep(2000);
        //确认接受弹窗
        alert.accept();
        driver.quit();
    }
}
