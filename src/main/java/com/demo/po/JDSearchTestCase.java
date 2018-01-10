package com.demo.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2018/1/10.
 */
public class JDSearchTestCase {

    WebDriver driver;
    String URL = "https://www.jd.com/";

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @Test(dataProvider="test")
    public void test(String key) throws InterruptedException {
        JDSearchPage.search(driver, key);
        JDSearchPage.click(driver);
        Thread.sleep(3000);
        String title = driver.getTitle();
        Assert.assertEquals(title,key+" - 商品搜索 - 京东");
    }

    //数据驱动部分
    @DataProvider
    public Object[][] test() {
        return new Object[][]{
                {"十万个为什么？"},{"java"},{"大数据测试"}
        };
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
