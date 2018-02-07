package com.demo.report;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UseTestNg extends TestListenerAdapter {

    @Override
    public synchronized void onTestFailure(ITestResult result) {
        Object currentClass = result.getInstance();
        WebDriver webDriver = ((TestUsNg) currentClass).getDriver();
        if (webDriver != null) {
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddhhmmss");
            String dateString = formatter.format(currentTime);
            File scrFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
            try {
                File screenshot = new File("img" + File.separator + dateString + ".jpg");
                FileUtils.copyFile(scrFile, screenshot);
                String jpgName=currentClass.getClass().getName();
                //Link
                Reporter.log("<a href=./img/" + jpgName + " target=_blank>Failed Screen Shot</a>", true);
                //Img
                Reporter.log("<img src=./img/" + jpgName + " /img>", true);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}