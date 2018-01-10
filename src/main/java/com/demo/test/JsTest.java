package com.demo.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Administrator on 2018/1/7.
 * JavascriptExecutor 由 driver 进行强制类型转换得来
 * executeScript 方法来执行一段 JS
 */
public class JsTest {

    public static void main(String[] args) throws Exception {
        WebDriver driver=new ChromeDriver();
        driver.get("http://localhost:8090/demo.html");
        driver.manage().window().maximize();
        //执行js操作，弹窗出现
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("alert('my first code!!')");
        //弹窗处理
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        Thread.sleep(2000);
        alert.accept();
        driver.quit();
    }
}
