package com.extentreports.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/4/23.
 */
public class ExtentreportDemo {
    @Test
    public void test1(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test2(){
        Assert.assertEquals(2,1);
        throw new RuntimeException("断言失败了.....................");
    }

    @Test
    public void test3(){
        Reporter.log("日志部分展示。。。。。。。。。。。。。。。。");
        Assert.assertEquals(2, 2);
    }
}
