package com.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Administrator on 2018/1/7.
 * findElements 返回的是一个 WebElement 集合
 * isSelected 判断是否选中
 */
public class CheckBoxTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8090/demo.html");
        driver.manage().window().maximize();
        List<WebElement> elements = driver.findElements(By.cssSelector("#checkbox>input"));
        //  单选第三项
        WebElement webElement = elements.get(2);
        webElement.click();
        boolean check = webElement.isSelected();
        System.out.println(check);
        //  全选
        for (WebElement WebElement:elements) {
            WebElement.click();
        }
        //  第三项取消选中
        check = webElement.isSelected();
        System.out.println(check);
    }
}
