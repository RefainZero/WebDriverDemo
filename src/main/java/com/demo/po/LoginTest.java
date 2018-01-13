package com.demo.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/13.
 * pageObject模式例子
 */
public class LoginTest {
    WebDriver driver;
    LoginPage page;

    @BeforeClass
    public void setup() {
        this.driver = new ChromeDriver();
        page = new LoginPage(driver, "http://home.51cto.com/index");
    }

    @Test
    public void test() throws Exception {
        String login = page.login();
        Thread.sleep(5000);
        Assert.assertEquals(login, "51CTO技术家园");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
