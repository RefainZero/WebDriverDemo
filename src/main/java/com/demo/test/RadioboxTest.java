package com.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Administrator on 2018/1/7.
 * findElements 返回的是一个 WebElement 集合
 * isSelected 判断当前 radiobox 对象是否被选中
 */
public class RadioboxTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8090/demo.html");
        driver.manage().window().maximize();
        List<WebElement> elements = driver.findElements(By.name("identity"));
        WebElement webElement = elements.get(2);
        //  选择第三个Opel
        webElement.click();
        //  判断是否选中
        boolean selected = webElement.isSelected();
        System.out.println(selected);
        driver.quit();
    }
}
