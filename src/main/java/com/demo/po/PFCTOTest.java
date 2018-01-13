package com.demo.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2018/1/13.
 */
public class PFCTOTest {
    WebDriver driver;
    HomeCtoPFLoginPage ctoPFLoginPage;
    @BeforeClass
    public void setup() {
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://home.51cto.com/index");
        ctoPFLoginPage = new HomeCtoPFLoginPage(driver);
    }

    @Test
    public void test() throws Exception {
        String login = ctoPFLoginPage.login();
        Thread.sleep(5000);
        Assert.assertEquals(login, "51CTO技术家园");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
