package com.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Administrator on 2018/1/7.
 * isEnabled 判断该 button 是否可用
 */
public class ButtonTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8090/demo.html");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.className("button"));
        element.click();
        boolean button = element.isEnabled();
        System.out.println(button);
    }
}
