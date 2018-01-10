package com.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Administrator on 2018/1/7.
 * sendKeys() 指定本地上传文件路径
 */
public class UploadTest {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8090/demo.html");
        driver.manage().window().maximize();
        String filePath="F:/robotium-solo-5.6.1.jar";
        //定位上传按钮，添加本地文件
        driver.findElement(By.id("load")).sendKeys(filePath);
        Thread. sleep (5000);
        driver.quit();
    }
}
