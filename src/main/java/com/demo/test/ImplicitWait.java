package com.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2018/1/7.
 * implicitlyWait。识别对象时的超时时间。
 * setScriptTimeout。异步脚本的超时时间。
 * pageLoadTimeout。页面加载时的超时时间。
 */
public class ImplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8090/demo.html");
        driver.manage().window().maximize();
        //页面加载超时时间设置为 5s
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.get("https://www.baidu.com/");
        //定位对象时给 10s 的时间, 如果 10s 内还定位不到则抛出异常
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("kw")).sendKeys("selenium");
        //异步脚本的超时时间设置成 3s
        driver.manage().timeouts().setScriptTimeout(3, TimeUnit.SECONDS);
        driver.quit();
    }
}
