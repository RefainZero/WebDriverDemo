package com.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Administrator on 2018/1/6.
 * getSize() 获取元素尺寸（宽、高）
 * getText() 获取页面文本信息
 * getAttribute() 获取元素属性（type="text"）
 * isDisplayed() 判断元素是否显示（True/False）
 */
public class CommonOperation2Test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");
        //获得百度输入框的尺寸
        WebElement size = driver.findElement(By.id("kw"));
        System.out.println(size.getSize());
        //返回百度页面底部备案信息
        WebElement text = driver.findElement(By.id("cp"));
        System.out.println(text.getText());
        //返回元素的属性值，可以是 id、name、type 或元素拥有的其它任意属性
        WebElement ty = driver.findElement(By.id("kw"));
        System.out.println(ty.getAttribute("type"));
        //返回元素的结果是否可见，返回结果为 True 或 False
        WebElement display = driver.findElement(By.id("kw"));
        System.out.println(display.isDisplayed());
        driver.quit();
    }
}
