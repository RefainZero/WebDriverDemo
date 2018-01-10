package com.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Administrator on 2018/1/6.
 * clear() 清除文本。
 * sendKeys(*value) 模拟按键输入。
 * click() 单击元素
 * submit()方法用于提交表单。
 */
public class CommonOperation1Test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");
        WebElement search_text = driver.findElement(By.id("kw"));
        WebElement search_button = driver.findElement(By.id("su"));
        search_text.sendKeys("狮子座");
        search_text.clear();
        search_text.sendKeys("曾轶可");
        search_button.click();
        //submit测试
        search_text.clear();
        search_text.sendKeys("Selenium");
        search_text.submit();
        driver.quit();
    }
}
