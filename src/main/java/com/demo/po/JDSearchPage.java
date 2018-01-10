package com.demo.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Administrator on 2018/1/10.
 * 将搜索和点击两个操作放在这个页面维护
 * 这样即便是元素变动，也不需要在测试用例中修改元素定位相关代码了，即修改page层即可
 */
public class JDSearchPage {

    /**
     * 搜索操作
     * @param driver
     * @param key
     */
    public static void search(WebDriver driver,String key){
        driver.findElement(By.id("key")).clear();
        driver.findElement(By.id("key")).sendKeys(key);
    }

    /**
     * 点击操作
     * @param driver
     */
    public static void click(WebDriver driver){
        driver.findElement(By.className("button")).click();
    }
}
