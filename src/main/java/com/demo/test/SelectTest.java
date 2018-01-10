package com.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Administrator on 2018/1/7.
 * isMultiple 是否支出多选
 * selectByIndex 通过下标去选择
 * selectByValue 通过value选择
 * selectByVisibleText  通过可见文本选择
 * getFirstSelectedOption 得到被选中的选项对象，结合 getText，就是指得到被选中的选项的 text 值
 */
public class SelectTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8090/demo.html");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.name("select"));
        Select select = new Select(element);
        //  是否支出多选
        Boolean isMultiple = select.isMultiple();
        //  sout输出是否可以多选
        System.out.println(isMultiple);
        //  通过下标去选择saab
        select.selectByIndex(2);
        pause(2);
        //  通过value选择audi
        select.selectByValue("audi");
        pause(2);
        //  通过可见文本选择Volvo
        select.selectByVisibleText("Volvo");
        //  获得选择的内容
        String selectText = select.getFirstSelectedOption().getText();
        //  输出选择文本
        System.out.println(selectText);
        driver.quit();
    }


    /**
     * 等待几秒
     *
     * @param i
     */
    private static void pause(int i) {
        try {
            Thread.sleep(1000 * i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
