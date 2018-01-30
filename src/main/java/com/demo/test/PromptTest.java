package com.demo.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Administrator on 2018/1/7.
 * JavaScript-提问（prompt 消息对话框）练习处理
 * switchTo().alert() 获得警告框
 * prompt.sendKeys("100");输入确认文本
 * accept() 接收警告框
 */
public class PromptTest {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8090/jsDemo.html");
        driver.manage().window().maximize();
        driver.findElement(By.name("button")).click();
        Thread.sleep(2000);
        Alert prompt = driver.switchTo().alert();
        System.out.println("对话框文本：" + prompt.getText());
        //输入确认文本
        prompt.sendKeys("100");
        //确定输入，接受弹窗
        prompt.accept();
        Thread.sleep(2000);
        driver.quit();
    }
}
