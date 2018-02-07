package com.demo.report;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2018/2/7.
 */
public class ScreenShot {

    private WebDriver driver;

    @Test(description = "driver")
    public void test1() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //get 到百度首页
        driver.get("https://www.baidu.com/");
        driver.findElement(By. linkText("新闻")).click();
        failScreenShot("demo");
        Assert.assertEquals(driver.getTitle(),"no");
    }

    /**
     * @param desc 截图名称描述
     * @Description 用例执行成功/失败时 进行截图
     */
    public void failScreenShot(String desc) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File screenshot = new File("failScreenShot" + File.separator + desc + ".jpg");
        try {
            FileUtils.copyFile(scrFile, screenshot);
        } catch (IOException e) {
            System.out.println("截图失败!");
        }

    }
}
