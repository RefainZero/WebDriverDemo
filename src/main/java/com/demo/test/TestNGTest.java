package com.demo.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/9.
 * TestNG注解使用介绍
 */
public class TestNGTest {

    @BeforeMethod
    //表示在测试方法执行之前执行
    public void setUp() {
        System.out.println("setUp method....");
    }

    @Test
    //表示该方法是一个测试方法，在运行时，会自动的运行有@Test的方法。
    public void test() {
        System.out.println("test...");
    }

    //用来指示期望抛出的异常类型。
    @Test(expectedExceptions = java.lang.AssertionError.class)
    public void testAdd2() {
        int z = 5;
        Assert.assertEquals(z, 9);
    }

    //timeOut 表示要求方法在 100 毫秒内运行完成，否则报错
    @Test(timeOut = 100)
    public void testDivision() {
        System.out.println("in Test Division");
    }

    //跳过测试
    @Test(enabled = false)
    public void testSkip() {
        System.out.println("skip");
    }

    @AfterMethod
    //表示在测试方法执行之后执行
    public void tearDown() {
        System.out.println("tearDown method....");
    }
}
