package com.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

/**
 * Created by Administrator on 2018/1/7.
 * getWindowHandles 这个方法返回的是一个所有句柄的集合
 * driver.switchTo().window 实现句柄切换
 */
public class SwitchWindowTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8090/demo.html");
        driver.manage().window().maximize();
        //原窗口操作，关闭新页签
        keepWindow(driver);
        //新窗口操作，关闭老窗口
        anotherWindow(driver);
    }

    /**
     * 新窗口操作，关闭老窗口
     *
     * @param driver
     */
    private static void anotherWindow(WebDriver driver) {
        //老窗口句柄
        String windowHandle = driver.getWindowHandle();
        driver.findElement(By.linkText("Open new window")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windows : windowHandles) {
            if (!windows.equals(windowHandle)) {
                driver.switchTo().window(windows);
                String currentUrl = driver.getCurrentUrl();
                if (currentUrl.contains("baidu")) {
                    System.out.println(currentUrl);
                    break;
                } else {
                    continue;
                }

            }
        }
        driver.findElement(By.id("kw")).sendKeys("Java", Keys.ENTER);
        windowHandles = driver.getWindowHandles();
        for (String windows : windowHandles) {
            driver.switchTo().window(windows);
            if (windows.equals(windowHandle)) {
                String currentUrl = driver.getCurrentUrl();
                if (currentUrl.contains("demo")) {
                    System.out.println(currentUrl);
                    driver.close();
                    break;
                } else {
                    continue;
                }

            }
        }
    }

    /**
     * 原窗口操作，关闭新页签
     *
     * @param driver
     */
    private static void keepWindow(WebDriver driver) {
        //关闭新窗口，继续在老窗口操作
        String windowHandle = driver.getWindowHandle();
        driver.findElement(By.linkText("Open new window")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windows : windowHandles) {
            if (!windows.equals(windowHandle)) {
                driver.switchTo().window(windows);
                String currentUrl = driver.getCurrentUrl();
                if (currentUrl.contains("baidu")) {
                    System.out.println(currentUrl);
                    driver.close();
                    break;
                } else {
                    continue;
                }

            }
        }
        driver.switchTo().window(windowHandle);
        driver.findElement(By.id("user")).sendKeys("Input Test");
    }
}
