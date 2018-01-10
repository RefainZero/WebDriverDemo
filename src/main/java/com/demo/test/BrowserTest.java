package com.demo.test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Administrator on 2018/1/6.
 * maximize() 设置浏览器最大化
 * setSize() 设置浏览器宽高
 * driver.close()是指关闭打开的浏览器，
 * driver.quit()是指退出 driver,
 */
public class BrowserTest {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.cn");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://m.baidu.cn");
        driver.manage().window().setSize(new Dimension(480, 800));
        Thread.sleep(2000);
        //driver.close();
        driver.quit();
    }
}
