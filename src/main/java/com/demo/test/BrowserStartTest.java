package com.demo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Administrator on 2018/1/6.
 * ChromeDriver chrome Chrome浏览器启动
 * InternetExplorerDriver Ie浏览器启动
 * FirefoxDriver Firefox浏览器启动
 */
public class BrowserStartTest {

    public static void main(String[] args) {
        //  chrome浏览器启动
        startChrome();
        //  Ie浏览器启动
        startIe();
        //  Firefox浏览器启动
        startFirefox();
    }

    /**
     * chrome浏览器启动
     */
    public static void startChrome() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");
    }

    /**
     * Ie浏览器启动
     */
    public static void startIe() {
        System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
        DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
        ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        WebDriver driver = new InternetExplorerDriver(ieCapabilities);
        driver.get("https://www.baidu.com/");
    }

    /**
     * Firefox浏览器启动
     */
    public static void startFirefox() {
        System.setProperty("webdriver.firefox.bin", "F:/Program Files/Mozilla Firefox/firefox.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.baidu.com/");
    }
}
